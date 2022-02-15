package com.enjoy.ceiling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StarAdapter extends RecyclerView.Adapter<StarAdapter.StarViewHolder> {

    private final Context context;
    private final List<Star> starList;

    public StarAdapter(Context context, List<Star> starList) {
        this.context = context;
        this.starList = starList;
    }

    /**
     * 是否是组的第一个item
     */
    public boolean isGroupHeader(int position) {
        if (position == 0) {
            return true;
        } else {
            String curGroupName = getGroupName(position);
            String preGroupName = getGroupName(position - 1);
            return !preGroupName.equals(curGroupName);
        }
    }

    public String getGroupName(int position) {
        return starList.get(position).getGroupName();
    }

    @NonNull
    @Override
    public StarAdapter.StarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.rv_item_star, null);
        return new StarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StarAdapter.StarViewHolder holder, int position) {
        holder.tv.setText(starList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return starList == null ? 0 : starList.size();
    }

    public class StarViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv;

        public StarViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv_star);
        }
    }
}
