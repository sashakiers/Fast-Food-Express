package com.dcv3.fastfood.fastfood;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dezereljones on 11/17/15.
 */
public class CreateAccountFragment extends Fragment {
    public CreateAccountFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_createacct, container, false);
        return v;
    }
}
