package br.com.thesource.pizzaap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsuario;
    private EditText etPsw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsuario =(EditText) findViewById(R.id.etUsuario);
        etPsw =(EditText) findViewById(R.id.etPsw);
    }

    public void logar(View v) {
        if(etUsuario.getText().toString().equals("felipe") && etPsw.getText().toString().equals("123")){
            Toast.makeText(this,"UHUL, lo usuarito estáss correcto", Toast.LENGTH_LONG);

            Intent i = new Intent(this,OrderActivity.class);
            i.putExtra("nome", etUsuario.getText().toString());
            startActivity(i);
        }else{
            Toast.makeText(this,"AIAIAII, lo usuarito estáss eradito", Toast.LENGTH_LONG);
        }
    }
}
