package br.com.pet.edu.projetotcc.activity;

import android.os.Bundle;

import org.parceler.Parcels;

import br.com.pet.edu.projetotcc.R;
import br.com.pet.edu.projetotcc.domain.Dog;
import br.com.pet.edu.projetotcc.fragments.DogFragment;
import br.com.pet.edu.projetotcc.fragments.PetFragment;

public class DogActivity extends BaseActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        setUpToolbar();

        Dog d = Parcels.unwrap(getIntent().getParcelableExtra("dog"));
        getSupportActionBar().setTitle("Nome");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if(savedInstanceState == null){
            DogFragment fragment = new DogFragment();
            fragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.container_fragemnt_dog,fragment).commit();

        }

    }
}
