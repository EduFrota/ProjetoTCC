package br.com.pet.edu.projetotcc.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.pet.edu.projetotcc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PetFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pet, container, false);
    }

}
