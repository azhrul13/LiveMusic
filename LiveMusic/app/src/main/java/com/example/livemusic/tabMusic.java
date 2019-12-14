package com.example.livemusic;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;


public class tabMusic extends Fragment {

    public  tabMusic(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        String[] song  ={"Own It",
                "Dance Monkey",
                "Dont't Start Now",
                "South of the Border",
                "Loyal",
                "Good as Hell",
                "ROXANNE",
                "Orphans",
                "10.000 Hours",
                "It's You",
                "Circle",
                "Beautiful",
                "Post Malone",
                "Make It To Heaven",
                "I.F.L.Y",
                "fuck, i'm lonely",
                "Torn",
                "Lalala",
                "Hot Girl Summer",
                "Camelot",
                "I Don't Care",
                "Faith",
                "Champion Of The World",
                "Bad Guy",
                "Ransom"};
        ListView listView = (ListView) view.findViewById(R.id.listSong);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                song
        );
        listView.setAdapter(listViewAdapter);
        return view;

    }
}
