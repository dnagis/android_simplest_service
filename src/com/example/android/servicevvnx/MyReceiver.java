/*
 * Basé sur samples/ShortcutSample
 * 
 * 
 * 
 * 
 */
package com.example.android.servicevvnx;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.os.BatteryManager;

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "ReceiverVvnx";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive dans MyReceiver");
        
        if (intent.getAction().equals(android.content.Intent.ACTION_BATTERY_CHANGED)) {
			final int mBatteryLevel = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 100);
			Log.d(TAG, "intent battery_changed: level: " + mBatteryLevel);
		}
    }

}
