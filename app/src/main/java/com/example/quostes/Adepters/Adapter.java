package com.example.quostes.Adepters;

import static android.app.ProgressDialog.show;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quostes.Menu_item.Menu_item_page;
import com.example.quostes.R;
import com.example.quostes.java.MainActivity;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewData> {

    int[] img;
    String[] type;
    Activity activity;

    public Adapter(MainActivity mainActivity, String[] type,int[] img) {
        this.img= img;
        this.type = type;
        activity = mainActivity;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_file,parent,false);
        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, @SuppressLint("RecyclerView") int position) {

        holder.text.setText(type[position]);
        holder.img.setImageResource(img[position]);

        holder.item_file.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, Menu_item_page.class);
                intent.putExtra("name1",type[position]);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return type.length;
    }

    public static class ViewData extends RecyclerView.ViewHolder {
        private final CardView item_file;
        TextView text;
        ImageView img;
        public ViewData(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
            img = itemView.findViewById(R.id.img);
            item_file = itemView.findViewById(R.id.item_file);
        }
    }
}
