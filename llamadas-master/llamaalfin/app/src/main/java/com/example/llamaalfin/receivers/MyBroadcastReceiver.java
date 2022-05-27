package com.example.llamaalfin.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.llamaalfin.R;


public class MyBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "MyBroadcastReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {

        if (Intent.ACTION_INPUT_METHOD_CHANGED.equals(intent.getAction())){
            Toast.makeText(context, "CAmbios", Toast.LENGTH_LONG).show();
        }else if(intent.getAction().equals(context.getString(R.string.action_broadcast))){

            Toast.makeText(context, "Captando las difuciones: " +
                    intent.getStringExtra("key1"), Toast.LENGTH_LONG).show();

        }

        StringBuilder sb = new StringBuilder();
        sb.append("Action: " + intent.getAction() + "\n");
        sb.append("URI: " + intent.toUri(Intent.URI_INTENT_SCHEME).toString() + "\n");
        String log = sb.toString();
        Log.d(TAG, log);
        Toast.makeText(context, log, Toast.LENGTH_LONG).show();
    }
}

