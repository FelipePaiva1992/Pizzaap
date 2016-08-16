package br.com.thesource.pizzaap;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        if(getIntent() != null){
            Toast.makeText(this, getIntent().getStringExtra("nome"),Toast.LENGTH_SHORT);
        }
    }
}
