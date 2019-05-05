package com.example.prsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView goto_sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goto_sign_up = findViewById(R.id.goto_sign_up);

        goto_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto_sign_up_activity  = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(goto_sign_up_activity);
            }
        });

    }
}
