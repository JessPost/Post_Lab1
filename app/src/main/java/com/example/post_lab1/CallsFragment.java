package com.example.post_lab1;

// necessary classes for android components and fragments management
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CallsFragment extends Fragment {
    @Nullable
    @Override
    // called to create and return the view hierarchy associated with the fragment
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment and return the root view
        //R.layout.fragment_calls refers to the layout resource file for the fragment
        return inflater.inflate(R.layout.fragment_calls, container, false);
    }
}