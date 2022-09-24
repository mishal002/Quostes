package com.example.quostes.Menu_item;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quostes.Adepters.Adapter;
import com.example.quostes.R;
import com.example.quostes.java.MainActivity;

import java.util.ArrayList;
import java.util.List;

//public class Menu_Adepter extends RecyclerView.Adapter<Menu_Adepter.ViewData> {
public class Menu_Adepter extends RecyclerView.Adapter<Menu_Adepter.ViewData> {

   List<Menu_modal_class>l1;
    int[] image;
    Activity activity;


    public Menu_Adepter(Menu_item_page menu_item_page, List<Menu_modal_class> l1) {
        this.image = image;
        this.l1=l1;
        activity = menu_item_page;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(activity).inflate(R.layout.menu_item_file,parent,false);
        return new ViewData(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {

//         holder.shayri1.setImageResource(image[position]);


    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    static class ViewData extends RecyclerView.ViewHolder {
        ImageView shayri1;

        public ViewData(@NonNull View itemView) {
            super(itemView);
            shayri1 = itemView.findViewById(R.id.shayri1);
        }
    }
}

