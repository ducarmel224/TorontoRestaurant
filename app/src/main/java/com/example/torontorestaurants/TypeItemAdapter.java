package com.example.torontorestaurants;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TypeItemAdapter extends RecyclerView.Adapter<TypeItemAdapter.ItemViewHolder>{
    private LayoutInflater inflater;
    private List<com.example.torontorestaurants.Type> types;
    onClickInterface onClickInterface;

    TypeItemAdapter(Context context, List<com.example.torontorestaurants.Type> types, onClickInterface onClickInterface) {
        this.types = types;
        this.inflater = LayoutInflater.from(context);
        this.onClickInterface = onClickInterface;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate the view here
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.type_item_text_layout,parent, false);

        ItemViewHolder ivh = new ItemViewHolder(v);

        return ivh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, final int position) {
        //set the text to the textview coming from the dataset
        holder.textView.setText(types.get(position).getName_type());
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           // Log.i("tag","-----------CLICK---------"+position);
                onClickInterface.setClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return types.size();
    }
    // this class represents the views for each item
    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            //more views here
        }
    }


}
