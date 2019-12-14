package com.example.livemusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.GoogleApi;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button best = (Button) findViewById(R.id.top);
        best.setOnClickListener(this);
        Button req = (Button) findViewById(R.id.requst);
        req.setOnClickListener(this);
        Button liv = (Button) findViewById(R.id.live);
        liv.setOnClickListener(this);
        Button abot = (Button) findViewById(R.id.about);
        abot.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.requst:
                startActivity(new Intent(this, menu.class));
                break;
            case R.id.top:
                startActivity(new Intent(this, TopMusic.class));
                break;
            case R.id.live:
                startActivity(new Intent(this, LiveHere.class));
                break;
            case R.id.about:
                startActivity(new Intent(this, about.class));
                break;
        }
    }
}
