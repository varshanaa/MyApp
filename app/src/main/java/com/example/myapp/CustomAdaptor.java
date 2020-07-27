package com.example.myapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.MyViewHolder> {

    private Context context;
    Activity activity;
    private ArrayList task_id, task_title, task_duration;

    public CustomAdaptor(Activity activity, Context context, ArrayList task_id, ArrayList task_title, ArrayList task_duration){

        this.activity = activity;
        this.context = context;
        this.task_id = task_id;
        this.task_title = task_title;
        this.task_duration = task_duration;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.myrow, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        String string_duration = String.valueOf(task_duration.get(position)) + " hours";

        holder.task_id_text.setText(String.valueOf(task_id.get(position)));
        holder.task_title_text.setText(String.valueOf(task_title.get(position)));
        holder.task_duration_text.setText(string_duration);
        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, UpdateActivity.class);
                intent.putExtra("id", String.valueOf(task_id.get(position)));
                intent.putExtra("title", String.valueOf(task_title.get(position)));
                intent.putExtra("duration", String.valueOf(task_duration.get(position)));
                activity.startActivityForResult(intent, 1);

            }
        });

    }

    @Override
    public int getItemCount() {

        return task_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView task_id_text, task_title_text, task_duration_text;
        LinearLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            task_id_text = itemView.findViewById(R.id.task_id_text);
            task_title_text = itemView.findViewById(R.id.task_title_text);
            task_duration_text = itemView.findViewById(R.id.task_duration_text);
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
