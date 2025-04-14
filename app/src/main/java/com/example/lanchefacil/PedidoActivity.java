package com.example.lanchefacil;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class PedidoActivity extends AppCompatActivity {

    private EditText edtNome;
    private RadioButton rbLanche1, rbLanche2, rbLanche3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        edtNome = findViewById(R.id.edtNome);
        rbLanche1 = findViewById(R.id.rbLanche1);
        rbLanche2 = findViewById(R.id.rbLanche2);
        rbLanche3 = findViewById(R.id.rbLanche3);
    }

    public void confirmarPedido(View view) {
        String nome = edtNome.getText().toString();
        String lancheEscolhido = "";

        if (rbLanche1.isChecked()) {
            lancheEscolhido = "Lanche de Frango";
        } else if (rbLanche2.isChecked()) {
            lancheEscolhido = "Lanche de Carne";
        } else if (rbLanche3.isChecked()) {
            lancheEscolhido = "Lanche Vegetariano";
        }

        if (nome.isEmpty() || lancheEscolhido.isEmpty()) {
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, ResumoPedidoActivity.class);
            intent.putExtra("nomeCliente", nome);
            intent.putExtra("lancheEscolhido", lancheEscolhido);
            startActivity(intent);
        }
    }
}