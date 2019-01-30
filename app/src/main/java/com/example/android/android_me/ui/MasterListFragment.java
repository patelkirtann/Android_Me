package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

public class MasterListFragment extends Fragment {

    private List<Integer> mImageIds;


    public MasterListFragment (){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // get list of all resources
        mImageIds = AndroidImageAssets.getAll();
        // get object of MasterListAdapter
        MasterListAdapter listAdapter = new MasterListAdapter(getContext(),mImageIds);
        // set the master list fragment view
        View rootView = inflater.inflate(R.layout.fragment_master_list,container,false);

        // find the grid view
        GridView gridView = (GridView) rootView.findViewById(R.id.master_list_grid_view);

        // set adapter to grid view
        gridView.setAdapter(listAdapter);

        return rootView;
    }
}
