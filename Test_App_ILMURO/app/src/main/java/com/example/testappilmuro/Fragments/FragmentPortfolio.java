package com.example.testappilmuro.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.testappilmuro.Profile;
import com.example.testappilmuro.R;

public class FragmentPortfolio extends Fragment {

    View view;

    public FragmentPortfolio() {


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.portfolio_fragment,container,false);
        return view;
    }

}
