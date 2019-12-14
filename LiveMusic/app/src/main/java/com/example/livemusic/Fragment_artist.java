package com.example.livemusic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_artist extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewart = inflater.inflate(R.layout.fragment_artist, container, false);
        String[] ListA = {"Ariana Grande",
                "Billie Eilish",
                "Shawn Mendes",
                "Khalid",
                "Post Maline",
                "Hasley",
                "Bruno Mars",
                "Rihana",
                "Imagine Dragon",
                "Adele",
                "Selena Gomesz",
                "Charlie Puth",
                "Beyonce Knowless",
                "Panic! at the Disco",
                "Dua Lipa",
                "Lady Gaga",
                "The Chainsmokers",
                "Bangtan Boys",
                "Cardi B",
                "Sam Smith",
                "Sia Furler",
                "Ketty Perry",
                "Bebe Rexha",
                "Shakira",
                "Adam Levine"};

        ListView listView = (ListView) viewart.findViewById(R.id.listArtist);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                ListA
        );
        listView.setAdapter(listViewAdapter);
        return viewart;


    }
}
