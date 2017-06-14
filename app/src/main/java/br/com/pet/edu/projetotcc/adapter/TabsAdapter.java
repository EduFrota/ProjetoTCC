package br.com.pet.edu.projetotcc.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import br.com.pet.edu.projetotcc.R;
import br.com.pet.edu.projetotcc.fragments.DogsFragment;

/**
 * Created by edu-f on 07/06/2017.
 */

public class TabsAdapter extends FragmentPagerAdapter{
    private Context context;
    public TabsAdapter(Context context,FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment f = null;
        if (position == 0) {
            f = DogsFragment.newInstance("Meu");
        } else if(position == 1){
            f = DogsFragment.newInstance("Todos");

        }else{
            f = DogsFragment.newInstance("Favoritos");
        }
        return f;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "meu";
        } else if (position == 1) {
            return "Todos";
        }
        return "Favoritos";
    }

    @Override
    public int getCount() {
        return 3;
    }
}
