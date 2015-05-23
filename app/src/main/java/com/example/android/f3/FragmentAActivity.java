package com.example.android.f3;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class FragmentAActivity extends Activity {
    public static final String MY_TEXT = "defaultny text FragmentAActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // check if activity has been switched to landscape mode
        // if yes, finish this activity
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            finish();
            return;
        }
        setContentView(R.layout.activity_fragmenta);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String url = extras.getString(MY_TEXT);
            FragmentB detailFragment = (FragmentB) getFragmentManager()
                    .findFragmentById(R.id.fragmentB);
            detailFragment.setText(url);
        }
    }
}
