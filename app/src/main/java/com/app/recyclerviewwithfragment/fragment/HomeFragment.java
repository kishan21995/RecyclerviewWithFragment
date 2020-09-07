package com.app.recyclerviewwithfragment.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.recyclerviewwithfragment.R;
import com.app.recyclerviewwithfragment.activity.ShareDataActivity;
import com.app.recyclerviewwithfragment.adapter.MoviesAdapter;
import com.app.recyclerviewwithfragment.model.MovieData;

import java.util.ArrayList;
import java.util.List;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    List<MovieData> moviesQuotesList = new ArrayList<>();
    RecyclerView recyclerView;
    private MoviesAdapter moviesQuotesListAdapter;

    //private AppBarConfiguration mAppBarConfiguration;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = view.findViewById(R.id.recyclerview);
    // View cardView =view. findViewById(R.id.cardView);
        recyclerViewOperation();

        return view;
    }

    public void recyclerViewOperation() {

        //  moviesQuotesListAdapter = new MoviesQuotesListAdapter(moviesQuotesList);

        MoviesAdapter moviesQuotesListAdapter= new MoviesAdapter(moviesQuotesList, getContext());

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        // recyclerView.setAdapter(moviesQuotesListAdapter);
        recyclerView.setAdapter(moviesQuotesListAdapter);


        for (int i =0 ; i<10; i++){
            MovieData movieData = new MovieData();
            movieData.setQuote("9th Live Traning Program " +
                    "on Youtube Basic Features and FAQs of " +
                    "Olympus Insufflator"+i);
            movieData.setWriter(i+" Views");

            moviesQuotesList.add(movieData);
        }


        moviesQuotesListAdapter.setmoviesQuotesListInterface(new MoviesAdapter.MoviesQuotesListInterface() {
            @Override
            public void moviesQuotesListItem(int position) {
                Intent i = new Intent(getActivity(), ShareDataActivity.class);
                i.addFlags(FLAG_ACTIVITY_NEW_TASK);
                i.putExtra("Text", moviesQuotesList.get(position).getQuote());
                i.putExtra("Writtername", moviesQuotesList.get(position).getWriter());

                startActivity(i);

            }
        });

    }

}