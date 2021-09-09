package com.example.listapersonalizada.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.listapersonalizada.R;

import java.util.List;

public class Adaptador extends ArrayAdapter {

    public Context context;
    public String equipos[];
    public String descripciones[];
    public int imagenes[];
    View fila;


    public Adaptador(Context contexto, String [] equipo, int[] imagen, String[] descripcion) {
        super(contexto, R.layout.fila, descripcion);
        this.context = contexto;
        this.equipos = equipo;
        this.descripciones = descripcion;
        this.imagenes = imagen;
    }

    @Override
    public View getView (int position, View view, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        fila = inflater.inflate(R.layout.fila, parent, false);
        TextView txtTitulo = (TextView) fila.findViewById(R.id.txtTitulo);
        TextView txtDescripcion = (TextView) fila.findViewById(R.id.txtDescripcion);
        ImageView imgEquipo = (ImageView) fila.findViewById(R.id.imageView);
        txtTitulo.setText(equipos[position]);
        txtDescripcion.setText(descripciones[position]);
        imgEquipo.setImageResource(imagenes[position]);

        return fila;
    }
}
