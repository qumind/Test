package com.example.root.test;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ChooseFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ChooseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChooseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_choose, container, false);

        ImageButton algebraButton = (ImageButton)view.findViewById(R.id.algebra_button);
        ImageButton geometryButton = (ImageButton)view.findViewById(R.id.geometry_button);

        algebraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("My logs", "algebra button click");
                getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new ThemeFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        geometryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("My logs", "geometry button click");
                getFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, new ThemeFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;

    }
}
