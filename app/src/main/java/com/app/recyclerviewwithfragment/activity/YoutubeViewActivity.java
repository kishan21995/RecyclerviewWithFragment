package com.app.recyclerviewwithfragment.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.app.recyclerviewwithfragment.R;

public class YoutubeViewActivity extends AppCompatActivity {


    private TextView quote,writer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_view);

        //clickListner
        quote = findViewById(R.id.shared_qutoes);
        writer = findViewById(R.id.shared_writer);


        //View cardView = findViewById(R.id.cardView);


        Bundle bundle = getIntent().getExtras();
        final String dialog = bundle.getString("Text");
        String w_nmae = bundle.getString("Writtername");

        quote.setText(dialog);
        writer.setText(w_nmae);



    }
}