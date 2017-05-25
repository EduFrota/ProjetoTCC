package br.com.pet.edu.projetotcc.activity;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import br.com.pet.edu.projetotcc.R;

import static java.security.AccessController.getContext;

/**
 * Created by edu-f on 23/05/2017.
 */

public class BaseActivity extends AppCompatActivity {
    protected DrawerLayout drawerLayout;
    //Configura Toolbar
    protected void setUpToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar != null){
            setSupportActionBar(toolbar);
        }
    }

    protected void setupNavDrawer() {
        // Drawer Layout
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            // Ícone do menu do nav drawer
            actionBar.setHomeAsUpIndicator(R.drawable.menu);
            actionBar.setDisplayHomeAsUpEnabled(true);
            drawerLayout = (DrawerLayout) findViewById(R.id.nav_drawer);
            NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
            if (navigationView != null && drawerLayout != null) {
                // Atualiza os dados do header do Navigation View
                setNavViewValues(navigationView, R.string.nome_nav_drawer,
                        R.string.email_nav_drawer, R.drawable.img_perfil);

                // Trata o evento de clique no menu.
                navigationView.setNavigationItemSelectedListener(
                        new NavigationView.OnNavigationItemSelectedListener() {
                            @Override
                            public boolean onNavigationItemSelected(MenuItem menuItem) {
                                // Seleciona a linha
                                menuItem.setChecked(true);
                                // Fecha o menu
                                drawerLayout.closeDrawers();
                                // Trata o evento do menu
                                onNavDrawerItemSelected(menuItem);
                                return true;
                            }
                        });
            }
        }
    }

    // Atualiza os dados do header do Navigation View
    public static void setNavViewValues(NavigationView navView, int nome, int email, int img) {
        View headerView = navView.getHeaderView(0);
        TextView tNome = (TextView) headerView.findViewById(R.id.User_navDraw);
        TextView tEmail = (TextView) headerView.findViewById(R.id.userEmail_navDraw);
        ImageView imgView = (ImageView) headerView.findViewById(R.id.image_header_nav);
        tNome.setText(nome);
        tEmail.setText(email);
        imgView.setImageResource(img);
    }

    // Trata o evento do menu lateral
    private void onNavDrawerItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.item1:
                // Nada aqui pois somente a MainActivity possui menu lateral
                Toast.makeText(this, "item 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "item 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "item 3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this, "Item 4", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    // Adiciona o fragment no centro da tela
   /* protected void replaceFragment(Fragment frag) {
        toast("OK!");
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Trata o clique no botão que abre o menu.
                if (drawerLayout != null) {
                    openDrawer();
                    return true;
                }
        }
        return super.onOptionsItemSelected(item);
    }

    // Abre o menu lateral
    protected void openDrawer() {
        if (drawerLayout != null) {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }

    // Fecha o menu lateral
    protected void closeDrawer() {
        if (drawerLayout != null) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
}
