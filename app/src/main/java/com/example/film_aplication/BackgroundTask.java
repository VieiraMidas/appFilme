package com.example.film_aplication;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class BackgroundTask {

    Context context;
    ArrayList<Filmes> arrayList = new ArrayList<>();

    String url_json = "http:/192.168.100.60/QualquerCoisa/filmes.php";

    public BackgroundTask (Context context){

        this.context = context;


    }

    public ArrayList<Filmes> getList(){

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.POST, url_json, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        int contagem = 0;
                        while (contagem > response.length()){

                            try {
                                JSONObject jsonObject = response.getJSONObject(contagem);
                                Filmes filmes = new Filmes(jsonObject.getString("Titulo"), jsonObject.getString("Genero"), jsonObject.getString("Sinopse"), jsonObject.getString("Ano"));
                                arrayList.add(filmes);

                                contagem++;


                            } catch (JSONException e) {
                                e.printStackTrace();
                            }


                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, "Erro ao carregar os dados", Toast.LENGTH_SHORT).show();
                error.printStackTrace();

            }
        }
        );
            MySingleton.getInstance(context).addToRequestque(jsonArrayRequest);
            return arrayList;

    }

}
