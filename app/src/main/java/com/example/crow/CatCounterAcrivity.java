package com.example.crow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CatCounterAcrivity extends AppCompatActivity {
    private TextView text_view_count;
    private Increment increment;
    private int zero = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_counter);
        increment = ((Applicat) getApplication()).getIncrement_cats();
        text_view_count = findViewById(R.id.text_cat_count);
        text_view_count.setText(String.valueOf(increment.getValue()));
//        ((Button) findViewById(R.id.button_cats_increment)).setOnClickListener(ign -> {
    //Можно убрать приведение типов (Button), тк кнопка - это View, а любая View поддерживает метод setOnClickListener
        findViewById(R.id.button_cats_increment).setOnClickListener(ign -> {
            increment.incrementer();
            text_view_count.setText(String.valueOf(increment.getValue()));
        });
        findViewById(R.id.button_cats_zeroing).setOnClickListener(ign -> {
            increment.zeroing(zero);
            text_view_count.setText(String.valueOf(increment.getValue()));
        });
        findViewById(R.id.button_goto_crows_counter).setOnClickListener(ign -> {
            Intent intent = new Intent(CatCounterAcrivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}