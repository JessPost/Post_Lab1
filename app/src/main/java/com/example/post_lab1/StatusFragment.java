package com.example.post_lab1;

// necessary classes for android components and fragments management
import android.os.Bundle; //for passing data btwn activities/fragments
import android.view.LayoutInflater; //for inflating XML layout files
import android.view.View; // for representing the UI components
import android.view.ViewGroup; //for representing a group of views

import androidx.annotation.NonNull; // for indicating non-null parameters
import androidx.annotation.Nullable; // for indicating nullable parameters
import androidx.fragment.app.Fragment; //base class for fragments

public class StatusFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_status, container, false);
    }
}