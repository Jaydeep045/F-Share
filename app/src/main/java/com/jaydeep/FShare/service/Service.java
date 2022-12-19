package com.jaydeep.FShare.service;

import android.content.SharedPreferences;

import com.jaydeep.FShare.util.AppUtils;
import com.jaydeep.FShare.util.NotificationUtils;
import com.jaydeep.FShare.db.AccessDatabase;

abstract public class Service extends android.app.Service
{
    private NotificationUtils mNotificationUtils;

    public AccessDatabase getDatabase()
    {
        return AppUtils.getDatabase(this);
    }

    public SharedPreferences getDefaultPreferences()
    {
        return AppUtils.getDefaultPreferences(getApplicationContext());
    }

    public NotificationUtils getNotificationUtils()
    {
        if (mNotificationUtils == null)
            mNotificationUtils = new NotificationUtils(getApplicationContext(), getDatabase(), getDefaultPreferences());

        return mNotificationUtils;
    }
}
