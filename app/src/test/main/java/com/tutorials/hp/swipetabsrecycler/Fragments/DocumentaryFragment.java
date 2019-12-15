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
public class DocumentaryFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.documentary_fragment,null);

        //RECYCLERVIEW
        RecyclerView rv= (RecyclerView) v.findViewById(R.id.myRecyclerDoc);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rv.setAdapter(new MyRecyclerAdapter(this.getActivity(),getDocumentaryMovies()));
        return v;
    }

    private ArrayList<Movie> getDocumentaryMovies() {
        ArrayList<Movie> movies=new ArrayList<>();
        Movie movie=new Movie("Columbia",R.drawable.shuttlecarrier);
        movies.add(movie);

        movie=new Movie("How to Live to 100",R.drawable.fruits);
        movies.add(movie);

        movie=new Movie("Death of The Sun",R.drawable.space);
        movies.add(movie);

        movie=new Movie("Inventions That Changed The World",R.drawable.thrones);
        movies.add(movie);

        movie=new Movie("The Super Jumbo ",R.drawable.moderncity);
        movies.add(movie);

        return movies;
    }




    //SET TITLE FOR THE FRAGMENT


    @Override
    public String toString() {
        return "Documentary";
    }
}
