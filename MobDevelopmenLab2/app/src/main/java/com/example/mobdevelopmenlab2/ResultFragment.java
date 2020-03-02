package com.example.mobdevelopmenlab2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ResultFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_result,container,false );
        return view;
    }
 /*   public void setText(String item) {
        TextView textView = (TextView) getView().findViewById(R.id.textView);
        textView.setText(item);
    }

  */

}
