package com.app.recyclerviewwithfragment.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.recyclerviewwithfragment.R;
import com.app.recyclerviewwithfragment.adapter.DataAdapter;
import com.app.recyclerviewwithfragment.model.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SearchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SearchFragment extends Fragment {
    RecyclerView recyclerView;
    List<Model> itemList;







    public static SearchFragment newInstance() {
        SearchFragment fragment = new SearchFragment();
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
        View view= inflater.inflate(R.layout.fragment_search, container, false);


       // View view=inflater.inflate(R.layout.fragment_music, container, false);

        recyclerView=view.findViewById(R.id.recycleryoutube);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
         recyclerView.setAdapter(new DataAdapter(initData()));

   /*    YoutubeAdapter.setSellingListInterface(new YoutubeAdapter.SellingListInterface() {
            @Override
            public void sellinglistitem(String id) {
                Intent intent = new Intent(SearchFragment.this, YoutubeActivity.class);
                intent.putExtra("id", id);
                startActivity(intent);

            }
        });*/



 /*       YoutubeAdapter.setmoviesQuotesListInterface(new YoutubeAdapter.MoviesQuotesListInterface() {
            @Override
            public void moviesQuotesListItem(int position) {
                Intent i = new Intent(SearchFragment.this,YoutubeActivity.class);
               // i.addFlags(FLAG_ACTIVITY_NEW_TASK);
                //i.putExtra("Text", moviesQuotesList.get(position).getQuote());
              //  i.putExtra("Writtername", moviesQuotesList.get(position).getWriter());

                startActivity(i);

            }
        });*/



        return view;

    }

    private List<Model>initData(){

        itemList=new ArrayList<>();
        itemList.add(new Model(R.drawable.placeholder_inbox,"video 1"));
        itemList.add(new Model(R.drawable.placeholder_inbox,"video 2"));
        itemList.add(new Model(R.drawable.placeholder_inbox,"video 3"));
        itemList.add(new Model(R.drawable.placeholder_inbox,"video 4"));
        itemList.add(new Model(R.drawable.placeholder_inbox,"video 1"));
        itemList.add(new Model(R.drawable.placeholder_inbox,"video 1"));
        itemList.add(new Model(R.drawable.placeholder_inbox,"video 1"));
        itemList.add(new Model(R.drawable.placeholder_inbox,"video 1"));
        itemList.add(new Model(R.drawable.placeholder_inbox,"video 1"));


        return itemList;
    }

}