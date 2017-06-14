package br.com.pet.edu.projetotcc.domain;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edu-f on 26/05/2017.
 */

public class DogService {
    public static List<Dog> getDog(Context context){
        List<Dog> dogs = new ArrayList<Dog>();
        for(int i = 0;i<20;i++){

            Dog d = new Dog();
            d.nome = "Nome: "+i;
            d.raca = "raca: "+i;
            d.temperamento = "Temperamento: "+i;
            d.url_foto="https://unsplash.com/search/dog?photo=E-1tnSNP0y4";
            dogs.add(d);

        }
        return dogs;

    }
}
