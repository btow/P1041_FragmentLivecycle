package com.example.samsung.p1041_fragmentlivecycle;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by samsung on 28.04.2017.
 */

public class Messager {

    private static final String LOG_TAG = "myLogs";

    public static void sendToAllRecipients(final Context context, final String message) {
        Log.d(LOG_TAG, message);
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void sendOnlyToLogs(final String message) {
        Log.d(LOG_TAG, message);
    }
}
