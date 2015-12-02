package com.stanstudios.myapplication;

/**
 * Created by DMSv4 on 12/2/2015.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Vlonjat Gashi (vlonjatg)
 */
public class CustomSlide extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        return rootView;
    }
}