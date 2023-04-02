package ru.mirea.volegovaa.multiactivity;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String text = ((EditText) findViewById(R.id.textEdit)).getText().toString();
        intent.putExtra("key", text);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "Destroy log");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "Stop log");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "Start log");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "Restart log");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "Resume log");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "Pause log");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        Log.i(TAG, "Restore Instance State log");
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i(TAG, "Save Instance State log");
    }
}