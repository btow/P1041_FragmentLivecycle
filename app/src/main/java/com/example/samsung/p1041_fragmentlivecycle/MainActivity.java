package com.example.samsung.p1041_fragmentlivecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = getString(R.string.main_activity_) + getString(R.string.on_create);
        Messager.sendToAllRecipients(getBaseContext(), message);
    }

    @Override
    protected void onStart() {
        super.onStart();
        message = getString(R.string.main_activity_) + getString(R.string.on_start);
        Messager.sendToAllRecipients(getBaseContext(), message);
    }

    @Override
    protected void onResume() {
        super.onResume();
        message = getString(R.string.main_activity_) + getString(R.string.on_resume);
        Messager.sendToAllRecipients(getBaseContext(), message);
    }

    @Override
    protected void onPause() {
        super.onPause();
        message = getString(R.string.main_activity_) + getString(R.string.on_pause);
        Messager.sendToAllRecipients(getBaseContext(), message);
    }

    @Override
    protected void onStop() {
        super.onStop();
        message = getString(R.string.main_activity_) + getString(R.string.on_stop);
        Messager.sendToAllRecipients(getBaseContext(), message);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        message = getString(R.string.main_activity_) + getString(R.string.on_destroy);
        Messager.sendToAllRecipients(getBaseContext(), message);
    }
}
