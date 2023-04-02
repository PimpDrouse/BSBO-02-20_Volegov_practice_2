package ru.mirea.volegovaa.activitylifecycle;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.textLog);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "Destroy log");
        text.setText("Destroy");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "Stop log");
        text.setText("Stop");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "Start log");
        text.setText("Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "Restart log");
        text.setText("Restart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "Resume log");
        text.setText("Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "Pause log");
        text.setText("Pause");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.i(TAG, "Restore Instance State log");
        text.setText("Restore Instance State");
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i(TAG, "Save Instance State log");
        text.setText("Save Instance State");
    }
}