package com.example.android.f3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity implements
        FragmentA.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemSelected(String link) {
        FragmentB fragment = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
        if (fragment != null && fragment.isInLayout()) {
            fragment.setText(link);
        } else {
            Intent intent = new Intent(getApplicationContext(),
                    FragmentAActivity.class);
            intent.putExtra(FragmentAActivity.MY_TEXT, link);
            startActivity(intent);
        }
    }
}
