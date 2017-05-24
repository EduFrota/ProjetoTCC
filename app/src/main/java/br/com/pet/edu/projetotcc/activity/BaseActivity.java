package br.com.pet.edu.projetotcc.activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import br.com.pet.edu.projetotcc.R;

/**
 * Created by edu-f on 23/05/2017.
 */

public class    BaseActivity extends AppCompatActivity {
    //Configura Toolbar
    protected void setUpToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
    }
}
