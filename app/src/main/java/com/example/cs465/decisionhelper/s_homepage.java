package com.example.cs465.decisionhelper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.support.v7.appcompat.R.styleable.View;

public class s_homepage extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_homepage);
        setTitle("Settings");
    }

    public void resetDB(View view)
    {
        db.clear();
    }
}