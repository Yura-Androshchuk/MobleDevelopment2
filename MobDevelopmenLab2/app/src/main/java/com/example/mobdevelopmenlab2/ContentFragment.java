package com.example.mobdevelopmenlab2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class ContentFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_content,container,false );
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Button button = (Button) getActivity().findViewById(R.id.OK);
        button.setOnClickListener(new View.OnClickListener(){
         @Override
            public void onClick(View v)
         {
             TextView textView = (TextView) getActivity().findViewById(R.id.textView);
             EditText editText = (EditText) getActivity().findViewById(R.id.editText);
             textView.setText(editText.getText());
         }});
        Button button1 = (Button) getActivity().findViewById(R.id.Cancel);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                getActivity().finish();
                startActivity(getActivity().getIntent());
            }});
    }



/*
    private OnFragmentInteractionListener mListener;
    interface OnFragmentInteractionListener {

        void onFragmentInteraction(String link);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (OnFragmentInteractionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " должен реализовывать интерфейс OnFragmentInteractionListener");
        }
    }
    public void updateInfo()
    {
        EditText editText = (EditText) getActivity().findViewById(R.id.editText);
        String editText1 = editText.getText().toString();
        mListener.onFragmentInteraction(editText1);

    }

 */

}
