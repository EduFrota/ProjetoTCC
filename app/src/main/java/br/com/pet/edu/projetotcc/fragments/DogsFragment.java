package br.com.pet.edu.projetotcc.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

import br.com.pet.edu.projetotcc.R;
import br.com.pet.edu.projetotcc.activity.DogActivity;
import br.com.pet.edu.projetotcc.adapter.DogAdapter;
import br.com.pet.edu.projetotcc.domain.Dog;
import br.com.pet.edu.projetotcc.domain.DogService;

public class DogsFragment extends BaseFragment {
    protected RecyclerView recyclerView;
    private List<Dog> dogs;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dogs, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_fragment_dog);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        return view;
    }
    public static DogsFragment newInstance(String tab) {
        Bundle args = new Bundle();
        DogsFragment f = new DogsFragment();
        f.setArguments(args);
        return f;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        taskDogs();
    }

    private void taskDogs(){
        this.dogs = DogService.getDog(getContext());
        recyclerView.setAdapter(new DogAdapter( dogs, getContext() ,onClickDog()));
    }
    private DogAdapter.DogOnclickListener onClickDog(){
        return new DogAdapter.DogOnclickListener() {
            @Override
            public void onClickDog(View view, int idx) {
                Dog dog = dogs.get(idx);
                Intent intent = new Intent(getContext(), DogActivity.class);
                intent.putExtra("dog", dog);
                startActivity(intent);

            }
        };

    }


}
