package com.dcv3.fastfood.fastfood.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dcv3.fastfood.fastfood.R;

/**
 * Created by dezereljones on 11/17/15.
 */
public class RestaurantMenuFragment extends Fragment {
    public RestaurantMenuFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }
}
