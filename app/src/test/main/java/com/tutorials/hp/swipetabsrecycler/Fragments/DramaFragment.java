package com.tutorials.hp.swipetabsrecycler.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.swipetabsrecycler.R;
import com.tutorials.hp.swipetabsrecycler.Recycler.Movie;
import com.tutorials.hp.swipetabsrecycler.Recycler.MyRecyclerAdapter;

import java.util.ArrayList;

/**
 * Created by Hp on 3/23/2016.
 */
public class DramaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.drama_frgament,null);
        RecyclerView rv= (RecyclerView) v.findViewById(R.id.myRecyclerDrama);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getDramaMovies()));
        return v;
    }

    private ArrayList<Movie> getDramaMovies() {
        ArrayList<Movie> movies=new ArrayList<>();
        Movie movie=new Movie("Star Wars",R.drawable.starwars);
        movies.add(movie);

        movie=new Movie("Ghost Rider",R.drawable.rider);
        movies.add(movie);

        movie=new Movie("Game Of Thrones",R.drawable.thrones);
        movies.add(movie);

        movie=new Movie("Ghost",R.drawable.ghost);
        movies.add(movie);


        return movies;
    }

    //SET TITLE FOR THE FRAGMENT


    @Override
    public String toString() {
        return "Drama";
    }
}
