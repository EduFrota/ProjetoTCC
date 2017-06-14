package br.com.pet.edu.projetotcc.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.pet.edu.projetotcc.R;
import br.com.pet.edu.projetotcc.domain.Dog;

/**
 * Created by edu-f on 31/05/2017.
 */

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.DogViewHolder> {
    protected static final String TAG="projetotcc";
    private final List<Dog> dogs;
    private final Context context;
    private DogOnclickListener dogOnclickListener;


    public DogAdapter(List<Dog> dogs, Context context, DogOnclickListener dogOnclickListener) {
        this.dogs = dogs;
        this.context = context;
        this.dogOnclickListener = dogOnclickListener;
    }



    @Override
    public DogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_dog,parent,false);
        DogViewHolder holder = new DogViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final DogViewHolder holder,final int position) {
        Dog d = dogs.get(position);
        holder.tNome.setText(d.nome);
        holder.tRaca.setText(d.raca);
        if(dogOnclickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dogOnclickListener.onClickDog(holder.itemView, position);
                }
            });

            }

        }


    @Override
    public int getItemCount() {
        return this.dogs != null ? this.dogs.size():0;
    }


    public static class DogViewHolder extends RecyclerView.ViewHolder {
        public TextView tNome;
        public TextView tRaca;
        ImageView img;
        CardView cardView;
        public DogViewHolder(View itemView) {
            super(itemView);
            tNome = (TextView) itemView.findViewById(R.id.textView_nome);
            tRaca = (TextView) itemView.findViewById(R.id.textView_raca);
            img = (ImageView) itemView.findViewById(R.id.img_cardview_adapter);
            cardView = (CardView) itemView.findViewById(R.id.card_view_adapter);
        }



    }


    public interface DogOnclickListener {
        public void onClickDog(View view, int idx);
    }
}