package com.regionaltolima.worldskills.turistapp;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Clase para generar el Adaptador de Las Listas de Sitios
 */
public class AdaptadorSitios extends RecyclerView.Adapter< AdaptadorSitios.ViewHolderSitios > {

    ArrayList<Sitios> sitios;

    public AdaptadorSitios(ArrayList sitios) {
        this.sitios = sitios;
    }

    @NonNull
    @Override
    public AdaptadorSitios.ViewHolderSitios onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);

        return new ViewHolderSitios(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorSitios.ViewHolderSitios holder, int position) {

        holder.iv_sitio.setImageResource(sitios.get(position).getImagenSitio());
       holder.tv_nombre.setText(sitios.get(position).getNombreSitio());
       holder.tv_descripcioncorta.setText(sitios.get(position).getDescCortaSitio());
       holder.tv_ubicacion.setText(sitios.get(position).getUbicacionSitio());

    }

    @Override
    public int getItemCount() {
        return sitios.size();
    }

    public class ViewHolderSitios extends RecyclerView.ViewHolder {
        ImageView iv_sitio;
        TextView tv_nombre, tv_descripcioncorta, tv_ubicacion;

        public ViewHolderSitios(View itemView) {
            super(itemView);

            iv_sitio = itemView.findViewById(R.id.imagen);

            tv_nombre = itemView.findViewById(R.id.nombre);
            tv_descripcioncorta = itemView.findViewById(R.id.descorta);
            tv_ubicacion = itemView.findViewById(R.id.ubicacion);


        }
    }
}
