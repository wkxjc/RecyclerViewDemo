package com.aioo.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.mViewHolder>{

    private ArrayList<App> apps;

    //构造方法，传入数据
    public MyAdapter(ArrayList<App> apps) {
        this.apps = apps;
    }

    //初始化控件
    public class mViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivIcon;
        private TextView tvName;
        public mViewHolder(View itemView) {
            super(itemView);
            ivIcon = itemView.findViewById(R.id.iv_icon);
            tvName = itemView.findViewById(R.id.tv_name);
        }
    }

    //绑定布局
    @NonNull
    @Override
    public mViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_item,parent,false);
        mViewHolder holder = new mViewHolder(view);
        return holder;
    }

    //对应位置绑定数据，这里可以添加点击事件
    @Override
    public void onBindViewHolder(@NonNull mViewHolder holder, int position) {
        holder.tvName.setText(apps.get(position).getName());
        holder.ivIcon.setImageDrawable(apps.get(position).getIcon());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里添加点击事件
            }
        });
    }

    //获取列表长度
    @Override
    public int getItemCount() {
        return apps.size();
    }
}