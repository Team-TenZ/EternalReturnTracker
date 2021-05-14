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

public class CharactersFragment extends Fragment {


    private EditText etSearch;
    private ImageView ivSearchIcon;

    private OnDataPassFromSearch2 dataPasser;
    public interface OnDataPassFromSearch2{
        public void onDataPassFromSearch2(CharSequence data);
    }


    public CharactersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_characters, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etSearch = view.findViewById(R.id.etSearchC);
        ivSearchIcon = view.findViewById(R.id.ivSearchIconC);



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
        dataPasser = (OnDataPassFromSearch2) context;
    }

    // USE THIS METHOD TO SEND DATA IN THIS CLASS
    public void passData(CharSequence data){
        dataPasser.onDataPassFromSearch2(data);
    }
}