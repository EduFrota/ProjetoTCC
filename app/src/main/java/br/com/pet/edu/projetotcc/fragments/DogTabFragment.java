package br.com.pet.edu.projetotcc.fragments;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.pet.edu.projetotcc.R;
import br.com.pet.edu.projetotcc.adapter.TabsAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class DogTabFragment extends BaseFragment {


    public DogTabFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dog_tab, container, false);
        //ViewPager
        ViewPager viewPager = (ViewPager)view.findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setAdapter(new TabsAdapter(getContext(),getChildFragmentManager()));
        //Tabs
        TabLayout tab = (TabLayout) view.findViewById(R.id.tablayout);
        tab.setupWithViewPager(viewPager);
        int cor = ContextCompat.getColor(getContext(),R.color.white);
        tab.setTabTextColors(cor,cor);
        return view;
    }

}
