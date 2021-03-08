package com.example.recyclerview_tsakaev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {

    String data1[], data2[], data3[];
    int images[];
    Context context;

    public ViewAdapter(Context ct,String s1[], String s2[], String s3[], int img[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        data3 = s3;
        images = img;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.student_txt.setText(data1[position]);
        holder.group_txt.setText(data2[position]);
        holder.unversity_txt.setText(data3[position]);
        holder.avatar_img.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {

        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView unversity_txt, group_txt, student_txt;
        ImageView avatar_img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            unversity_txt = itemView.findViewById(R.id.unversity_txt);
            group_txt = itemView.findViewById(R.id.group_txt);
            student_txt = itemView.findViewById(R.id.student_txt);
            avatar_img = itemView.findViewById(R.id.avatar_img);
        }
    }
}
