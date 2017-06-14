package br.com.pet.edu.projetotcc.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import org.parceler.Parcels;

import br.com.pet.edu.projetotcc.R;
import br.com.pet.edu.projetotcc.domain.Dog;

/**
 * A simple {@link Fragment} subclass.
 */
public class DogFragment extends BaseFragment {
    private Dog dog;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dog, container, false);
        dog = Parcels.unwrap(getArguments().getParcelable("dog"));
        return view;
    }
    /*@Override
    public void onViewCreated(View view, Bundle bundle){
        super.onViewCreated(view,bundle);
        final ImageView imageView = (ImageView) getView().findViewById(R.id.imgview_fragment_dog);
        imageView.setImageResource(R.drawable.meredith_p);


    }*/

}
