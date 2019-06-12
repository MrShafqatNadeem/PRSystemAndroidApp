package com.example.prsystem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SearchActivity extends AppCompatActivity {

    Button search_button;
    Button entry_Button;
    WebView data_view;
    ImageView topimageicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        topimageicon = findViewById(R.id.userImage);
        final LinearLayout search_layout = findViewById(R.id.search_layout);
        data_view = findViewById(R.id.data_view);
        entry_Button = findViewById(R.id.entry_button);
        search_button = findViewById(R.id.searcch_button);

        entry_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search_layout.setVisibility(View.GONE);
                topimageicon.setVisibility(View.GONE);
                //data_view.setWebViewClient(new WebViewClient());
                data_view.setVisibility(View.VISIBLE);

                String loadurl = "http://192.168.137.1:5555/entry";
                data_view.getSettings().setJavaScriptEnabled(true);
                data_view.setWebViewClient(new WebViewClient());
                data_view.loadUrl(loadurl);




            }
        });
        search_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search_layout.setVisibility(View.GONE);
                topimageicon.setVisibility(View.GONE);
                data_view.setVisibility(View.VISIBLE);

                String loadurl = "http://192.168.137.1:5555/search";
                data_view.getSettings().setJavaScriptEnabled(true);
                data_view.setWebViewClient(new WebViewClient());

                data_view.loadUrl(loadurl);




            }
        });


    }
}
