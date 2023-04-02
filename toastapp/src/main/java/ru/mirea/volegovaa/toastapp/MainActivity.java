package ru.mirea.volegovaa.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(),
                String.format("Студент №3 Группа БСБО-02-20 Количество символов - %s", ((TextView) findViewById(R.id.textEdit)).getText().length()),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}