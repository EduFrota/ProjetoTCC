package br.com.pet.edu.projetotcc.domain;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import br.com.pet.edu.projetotcc.R;


/**
 * Created by edu-f on 26/05/2017.
 */
@org.parceler.Parcel
public class Dog  {
    private static final long SerialVersionUID = 6601006766832473959L;
    public long id;
    public String url_foto;
    public String nome;
    public String idade;
    public String raca;
    public String temperamento;


    @Override
    public String toString() {
        return "Dog{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", raca='" + raca + '\'' +
                ", temperamento='" + temperamento + '\'' +
                '}';
    }


}


