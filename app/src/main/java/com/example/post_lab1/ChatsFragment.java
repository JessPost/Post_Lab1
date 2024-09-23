package com.example.post_lab1;

// necessary classes for android components and fragments management
import android.os.Bundle; //for passing data btwn activities/fragments
import android.view.LayoutInflater; //for inflating XML layout files
import android.view.View; // for representing the UI components
import android.view.ViewGroup; //for representing a group of views

import androidx.annotation.NonNull; // for indicating non-null parameters
import androidx.annotation.Nullable; // for indicating nullable parameters
import androidx.fragment.app.Fragment; //base class for fragments

public class ChatsFragment extends Fragment {
    @Nullable
    @Override
    //called when the fragments view hierarchy is being created
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //inflate the layout for this fragment and return root view
        //R.layout.fragment_chats refers to the layout resource file for this fragment
        return inflater.inflate(R.layout.fragment_chats, container, false);
    }
}
