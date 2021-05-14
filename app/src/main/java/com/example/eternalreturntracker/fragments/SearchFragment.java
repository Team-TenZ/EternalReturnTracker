package com.example.eternalreturntracker.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.eternalreturntracker.R;

public class SearchFragment extends Fragment {


    private EditText etSearch;
    private ImageView ivSearchIcon;

    private OnDataPassFromSearch dataPasser;
    public interface OnDataPassFromSearch{
        public void onDataPassFromSearch(CharSequence data);
    }


    public SearchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etSearch = view.findViewById(R.id.etSearch);
        ivSearchIcon = view.findViewById(R.id.ivSearchIcon);



        // Button for Search
        ivSearchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence input = etSearch.getText();
                passData(input);

            }
        });

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        dataPasser = (OnDataPassFromSearch) context;
    }

    // USE THIS METHOD TO SEND DATA IN THIS CLASS
    public void passData(CharSequence data){
        dataPasser.onDataPassFromSearch(data);
    }
}