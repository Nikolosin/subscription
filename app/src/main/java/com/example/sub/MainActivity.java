package com.example.sub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Button btnOk = findViewById(R.id.buttonOk);
        final EditText editTextname = findViewById(R.id.editTextname);
        final EditText editTextgmail = findViewById(R.id.editTextgmail);
        final TextView tvResult = findViewById(R.id.textResult);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = getString(R.string.resul1) + " " +
                        editTextname.getText() + " " +
                        getString(R.string.resul2) + " " +
                        editTextgmail.getText();
                tvResult.setText(res);
            }

    });
}
}

