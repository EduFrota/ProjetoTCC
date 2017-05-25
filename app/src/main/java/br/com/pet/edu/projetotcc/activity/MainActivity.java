package br.com.pet.edu.projetotcc.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.pet.edu.projetotcc.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpToolbar();
        setupNavDrawer();
    }
}
