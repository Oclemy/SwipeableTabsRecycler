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
public class CrimeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.crime_fragment,null);

        //RECYCLERVIEW
        RecyclerView rv= (RecyclerView) v.findViewById(R.id.mRecyclerCrime);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getCrimeMovies()));

        return v;
    }

    private ArrayList<Movie> getCrimeMovies() {
        //COLECTION OF CRIME MOVIES
        ArrayList<Movie> movies=new ArrayList<>();

        //SINGLE MOVIE
        Movie movie=new Movie("BLACKLIST",R.drawable.red);

        //ADD ITR TO COLLECTION
        movies.add(movie);

        movie=new Movie("Breaking Bad",R.drawable.breaking);
        movies.add(movie);

        movie=new Movie("Crisis",R.drawable.crisis);
        movies.add(movie);

        movie=new Movie("BlackList",R.drawable.blacklist);
        movies.add(movie);

        movie=new Movie("Men In Black",R.drawable.meninblack);
        movies.add(movie);



        return movies;
    }

    //SET TITLE FOR THE FRAGMENT


    @Override
    public String toString() {
        return "Crime";
    }
}
