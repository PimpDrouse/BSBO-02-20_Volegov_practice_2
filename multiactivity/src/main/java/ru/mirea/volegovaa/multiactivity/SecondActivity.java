package ru.mirea.volegovaa.multiactivity;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import ru.mirea.volegovaa.multiactivity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView text = (TextView) findViewById(R.id.textView5);
        text.setText((String) getIntent().getSerializableExtra("key"));
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