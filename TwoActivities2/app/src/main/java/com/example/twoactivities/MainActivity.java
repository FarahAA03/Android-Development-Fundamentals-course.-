package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final String LOG_TAG = MainActivity.class.getSimpleName() ;
    public static final String EXTRA_MESSAGE  = "com.example.android.twoactivities.extra.MESSAGE";
    public static  final int TEXT_REQUEST=1;
    private EditText mMessageEditText;
    private TextView mReplyHeadTextView;
    private TextView mReplyTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "-----");
        Log.d(LOG TAG, "onCreate");

        mMessageEditText = findViewById(R.id.editText_main);
        mReplyHeadTextView = findViewById(R.id.text_header_reply);
        mReplyTextView = findViewById(R.id.text_message_reply);

    }

    @Override
    protected void onPause() (
            super.onPause();
            Log.d(LOG_TAG, "onPause");

    @Override
    protected void onRestart() (
            super.onRestart();
            Log.d(LOG_TAG, "onRestart");

    @Override
    protected void onResume() (
            super.onResume();
            Log.d(LOG_TAG, "onResume");

    @Override
    protected void onStop() (
            super.onStop();
            Log.d(LOG_TAG, "onStop");

    @Override
    protected void onDestroy() (
            super.onDestroy();
            Log.d(LOG_TAG, "onDestroy");



}
