package com.example.lanchefacil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResumoPedidoActivity extends AppCompatActivity {

    private TextView txtResumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_pedido);

        txtResumo = findViewById(R.id.txtResu);

        String nome = getIntent().getStringExtra("nomeCliente");
        String lanche = getIntent().getStringExtra("lancheEscolhido");

        String mensagem = "Pedido Confirmado!\n\nNome: " + nome + "\nLanche: " + lanche;
        txtResumo.setText(mensagem);
    }

    public void voltarInicio(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}