package com.app.recyclerviewwithfragment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.app.recyclerviewwithfragment.R;
import com.app.recyclerviewwithfragment.adapter.MoviesAdapter;
import com.app.recyclerviewwithfragment.model.MovieData;

import java.util.ArrayList;
import java.util.List;

public class ShareDataActivity extends AppCompatActivity {


    private TextView quote,writer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_data);

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