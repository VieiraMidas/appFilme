package com.example.film_aplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usuario, senha;
    Button btnEntrar, btnCadastrar;

    String url_json = "http://192.168.100.60/test/Aifudeu.PNG";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usuario = findViewById(R.id.txtUsuário);
        senha = findViewById(R.id.txtSenha);


        btnEntrar = findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuarioL, senhaL;
                usuarioL = usuario.getText().toString();
                senhaL = senha.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Activity_home.class);
                startActivity(intent);
            }
        });

        btnCadastrar = findViewById(R.id.btnCadastro);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_cadastrar.class);
            }
        });


    }
}
