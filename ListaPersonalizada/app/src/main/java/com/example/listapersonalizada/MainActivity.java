package com.example.listapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listapersonalizada.adapter.Adaptador;

public class MainActivity extends ListActivity {

    String[] equipo;
    String[] descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        equipo = getResources().getStringArray(R.array.equipos);
        descripcion = getResources().getStringArray(R.array.descripciones);
        int [] imagen = {
                R.drawable.athletic_bilbao,
                R.drawable.atletico_madrid,
                R.drawable.barcelona,
                R.drawable.betis,
                R.drawable.celta_vigo,
                R.drawable.deportivo,
                R.drawable.espanyol,
                R.drawable.getafe,
                R.drawable.granada,
                R.drawable.levante,
                R.drawable.malaga,
                R.drawable.mallorca,
                R.drawable.osasuna,
                R.drawable.rayo_vallecano,
                R.drawable.real_madrid,
                R.drawable.real_sociedad,
                R.drawable.sevilla,
                R.drawable.valencia,
                R.drawable.valladolid,
                R.drawable.zaragoza
        };
        setListAdapter(new Adaptador(this, equipo, imagen, descripcion));
    }

    protected void onListItemClick(ListView listView, View view, int position, long id){
        Toast.makeText(this, "Usted ha elegido: " + equipo[position], Toast.LENGTH_SHORT).show();
    }
}