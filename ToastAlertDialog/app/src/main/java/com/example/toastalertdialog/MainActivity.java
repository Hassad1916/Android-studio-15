package com.example.toastalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void btn(View v) {
            Toast toast = Toast.makeText(MainActivity.this, "Hello world", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        }

    public void btn2(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("對話框測試");
        builder.setMessage("這是一個對話視窗");
        builder.setCancelable(true);
        builder.setPositiveButton("關閉視窗", null);
        builder.show();
    }

}
