package br.com.thesource.pizzaap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    private @BindView(R.id.etUsuario) EditText etUsuario;
    private @BindView(R.id.etPsw) EditText etPsw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    public void logar(Button button) {
        Toast.makeText(this,"OLA " + etUsuario.getText(),Toast.LENGTH_SHORT);
    }
}
