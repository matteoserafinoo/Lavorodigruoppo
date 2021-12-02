package com.example.lavorodigruppo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnReset; // creare un oggetto di tipo Button
    Button btnTest;
    Button btnPlay;

    TextView txtMessaggio;


    @Override
    protected void onCreate(Bundle savedInstanceState) // metodo onCreate(non ritorna nessun valore) è il primo metodo ad andare in esecuzione
    {
        super.onCreate(savedInstanceState); // si invoca il metodo del padre grazie alla chiamata super
        setContentView(R.layout.activity_main); // carica il file xml

        btnTest = (Button)findViewById(R.id.btnTest);

    }

    public void reset(View v) // View v serve per riconoscere l' Activity
    {
        txtMessaggio.setText(" ");
    }

    public void test(View v)
    {
        Toast t = Toast.makeText(getApplicationContext(),"MATTEO SERAFINO",Toast.LENGTH_LONG);// tre parametri(dove viene invocato,messaggio visualizzato,durata)
        // oggetto TOAST ha anche una gravity per posizionarlo
        t.show();
    }

}

