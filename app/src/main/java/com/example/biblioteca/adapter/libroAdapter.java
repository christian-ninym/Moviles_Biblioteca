package com.example.biblioteca.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.biblioteca.R;
import com.example.biblioteca.activity.libroActivity;
import com.example.biblioteca.model.libro;

import java.util.List;

public class libroAdapter extends ArrayAdapter<libro> {

    private Context context;
    private List<libro> libro;

    public libroAdapter(@NonNull Context context, int resource, @NonNull List<libro> objects) {
        super(context, resource, objects);
        this.context=context;
        this.libro=objects;
    }

    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=layoutInflater.inflate(R.layout.content_main_libro,parent,false);
        TextView idlibro=(TextView)rowView.findViewById(R.id.idlibro);
        TextView titulo=(TextView)rowView.findViewById(R.id.titulo);;
        TextView autor=(TextView)rowView.findViewById(R.id.autor);;
        TextView paginas=(TextView)rowView.findViewById(R.id.paginas);;
        TextView edicion=(TextView)rowView.findViewById(R.id.edicion);;
        TextView editorial_ideditorial=(TextView)rowView.findViewById(R.id.editorial_ideditorial);;


        idlibro.setText(String.format("ID:%d",libro.get(position).getIdp()));
        titulo.setText(String.format("TITULO:%s",libro.get(position).gettitulo()));
        autor.setText(String.format("AUTOR: %s",libro.get(position).getautorp()));
        paginas.setText(String.format("PAGINAS: %s",libro.get(position).getpaginas()));
        edicion.setText(String.format("EDICION: %s",libro.get(position).getedicionp()));
        editorial_ideditorial.setText(String.format("EDITORIAL_IDEDITORIAL: %s",libro.get(position).geteditorial_ideditorialp()));


        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, libroActivity.class);
                intent.putExtra("ID",String.valueOf(libro.get(position).getIdp()));
                intent.putExtra("TITULO",libro.get(position).gettitulo());
                intent.putExtra("AUTOR",libro.get(position).getautorp());
                intent.putExtra("PAGINAS",libro.get(position).getpaginas());
                intent.putExtra("EDICION",libro.get(position).getedicionp());
                context.startActivity(intent);
            }
        });
        return rowView;

    }
}
