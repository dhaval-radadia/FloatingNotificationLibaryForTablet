package com.example.floatingnotification.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.floatingnotification.R;
import com.example.floatingnotification.models.NotificationItem;
import com.example.floatingnotification.viewholders.SubNotificationHolder;

import java.util.ArrayList;

public class SubNotificationAdapter extends RecyclerView.Adapter<SubNotificationHolder> {

    private ArrayList<NotificationItem> notificationItemArrayList;

    public SubNotificationAdapter(ArrayList<NotificationItem> notificationItems) {
        this.notificationItemArrayList = notificationItems;
    }

    @NonNull
    @Override
    public SubNotificationHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new SubNotificationHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.notification_child_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SubNotificationHolder notificationItemHolder, int position) {
        notificationItemHolder.bindView(notificationItemArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return notificationItemArrayList.size();
    }
}
