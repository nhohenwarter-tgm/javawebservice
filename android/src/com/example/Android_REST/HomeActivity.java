package com.example.Android_REST;

import android.app.Activity;
import android.os.Bundle;
import com.prgguru.example.R;

/**
 *
 * Home Screen Activity
 */
public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Displays Home Screen
        setContentView(R.layout.home);
    }

}