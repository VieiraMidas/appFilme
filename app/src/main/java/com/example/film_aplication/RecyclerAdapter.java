package com.example.film_aplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MiViewHolder> {
    
    ArrayList<Filmes> arrayList = new ArrayList<>();
    public RecyclerAdapter(ArrayList<Filmes> arrayList){
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_molde,parent,false);
        MiViewHolder miviewholder = new MiViewHolder(view);
        return miviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        holder.titulo.setText(arrayList.get(position).getTitulo());
        holder.genero.setText(arrayList.get(position).getGenero());
        holder.sinopse.setText(arrayList.get(position).getSinopse());
        holder.ano.setText(arrayList.get(position).getAno());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder {
        
        TextView titulo, genero, sinopse, ano;

        
        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            
            titulo = itemView.findViewById(R.id.txtNomeFilme);
            genero = itemView.findViewById(R.id.txtGenero);
            sinopse = itemView.findViewById(R.id.txtSinopseConteudo);
            ano = itemView.findViewById(R.id.txtAno);
            
            
        }
    }
}
