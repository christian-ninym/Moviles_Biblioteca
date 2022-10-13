package com.example.biblioteca.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.biblioteca.R;
import com.example.biblioteca.model.editorial;

import java.util.List;

public class editorialAdapter extends ArrayAdapter<editorial> {
    private Context context;
    private List<editorial> editorial;

    public editorialAdapter(@NonNull Context context, int resource, @NonNull List<editorial> objects) {
        super(context, resource, objects);
        this.context=context;
        this.editorial=objects;
    }

    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=layoutInflater.inflate(R.layout.content_main_editorial,parent,false);


        TextView idcategorias=(TextView)rowView.findViewById(R.id.ideditorial);
        TextView nombre=(TextView)rowView.findViewById(R.id.nombre);;

        idcategorias.setText(String.format("IDEDITORIAL:%d",editorial.get(position).getId()));
        nombre.setText(String.format("NOMBRE:%s",editorial.get(position).getNombres()));

        return rowView;

    }

}
