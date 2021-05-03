package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private CheckBox Fever, Cough, Breathlessness;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtTextName = (EditText) findViewById(R.id.edtTextName);
                String s=edtTextName.getText().toString();
                System.out.println(s+"hellooooo");
                Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("stringkey", s);
                startActivity(intent);
            }
        });

    }
}