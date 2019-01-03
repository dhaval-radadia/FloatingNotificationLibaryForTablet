package com.example.floatingnotification.models;

import com.example.floatingnotification.utils.Constants;
import com.example.floatingnotification.R;

import static com.example.floatingnotification.utils.Constants.FAILED;
import static com.example.floatingnotification.utils.Constants.SUCCESS;

public class NotificationItem<T> {
    protected int containerType;
    protected String message;
    @Constants.MessageType
    protected String type;
    protected T data;


    protected NotificationItem(int containerType, String message, String type) {
        this.containerType = containerType;
        this.message = message;
        this.type = type;
    }

    protected NotificationItem(int containerType, String message, String type, T data) {
        this(containerType, message, type);
        this.data = data;

    }

    public static <T> NotificationItem<T> singleMessage(String message, @Constants.MessageType String type, T data) {
        return new NotificationItem<>(Constants.SINGLE, message, type, data);
    }


    public static <T> NotificationItem<T> multipleMessage(String message, @Constants.MessageType String type, T dataModels) {
        return new NotificationItem<>(Constants.MULTIPLE, message, type, dataModels);
    }

    public String getMessage() {
        return message;
    }


    public int getContainerType() {
        return containerType;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public int getResId() {
        if (type.equalsIgnoreCase(SUCCESS))
            return R.drawable.notification_success;
        else if (type.equalsIgnoreCase(FAILED))
            return R.drawable.notification_failed;
        else
            return R.drawable.notification_conflict;
    }

    public int getSubResId() {
        if (type.equalsIgnoreCase(SUCCESS))
            return R.drawable.sub_notification_success;
        else if (type.equalsIgnoreCase(FAILED))
            return R.drawable.notification_failed;
        else
            return R.drawable.sub_notification_conflict;
    }
}