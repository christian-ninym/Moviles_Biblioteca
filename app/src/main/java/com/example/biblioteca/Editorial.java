package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.example.biblioteca.adapter.editorialAdapter;
import com.example.biblioteca.model.editorial;
import com.example.biblioteca.utils.Apis;
import com.example.biblioteca.utils.editorialService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Editorial extends AppCompatActivity {

    List<editorial> editorialList =new ArrayList<>();
    editorialService categoriasService;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editorial);

        listView=(ListView)findViewById(R.id.listView);

        listcategorias();
    }

    public void listcategorias() {
        categoriasService = Apis.getcategoriasService();
        Call<List<editorial>> call = categoriasService.getcategorias();
        call.enqueue(new Callback<List<editorial>>() {
            @Override
            public void onResponse(Call<List<editorial>> call, Response<List<editorial>> response) {
                if (response.isSuccessful()) {
                    editorialList = response.body();
                    listView.setAdapter(new editorialAdapter(Editorial.this, R.layout.content_main_editorial, editorialList));
                }
            }

            @Override
            public void onFailure(Call<List<editorial>> call, Throwable t) {
                Log.e("Error:", t.getMessage());
            }

        });
    }
        public void irMenuPrincipal(View view){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }




