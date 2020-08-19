package com.app.recyclerviewwithfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MusicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MusicFragment extends Fragment {
    RecyclerView recyclerView;
    List<Model>itemList;

    public static MusicFragment newInstance() {
        MusicFragment fragment = new MusicFragment();
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
       // return inflater.inflate(R.layout.fragment_music, container, false);


        View view=inflater.inflate(R.layout.fragment_music, container, false);

        recyclerView=view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //initData();

        //use adapter data here
        recyclerView.setAdapter(new ItemAdapter(initData()));



        return view;

    }

    private List<Model>initData(){

        itemList=new ArrayList<>();
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 2"));
        itemList.add(new Model(R.drawable.arman,"video 3"));
        itemList.add(new Model(R.drawable.arman,"video 4"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));
        itemList.add(new Model(R.drawable.arman,"video 1"));


        return itemList;
    }

}