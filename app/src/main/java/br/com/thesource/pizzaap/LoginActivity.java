package br.com.thesource.pizzaap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        EditText etUsuario =(EditText) findViewById(R.id.etUsuario);
        EditText etPsw =(EditText) findViewById(R.id.etPsw);
    }

    public void logar(Button button) {
        Intent i = new Intent(this,OrderActivity.class);
        startActivity(i);
    }
}
