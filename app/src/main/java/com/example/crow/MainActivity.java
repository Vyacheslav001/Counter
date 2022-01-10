package com.example.crow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text_count;
    private Increment increment;
    private Button button_count;
    private Button zeroing;
    private Button button_goto_cat_counter;
    private int zero = 5;
//    private Applicat applicat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increment = ((Applicat) getApplication()).getIncrement_crows();
    //Попытка переписать код предыдущей строчки развернутым образом
//        applicat = new Applicat(getApplication());
//        increment = applicat.getIncrement_crows();
//        increment = new Increment(zero); //на старте все время будет zero
        text_count = findViewById(R.id.text_count);
        text_count.setText(String.valueOf(increment.getValue()));
        button_count = findViewById(R.id.button_increment);
        button_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment.incrementer();
                text_count.setText(String.valueOf(increment.getValue()));
            }
        });
        zeroing = findViewById(R.id.button_zeroing);
        zeroing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increment.zeroing(zero);
                text_count.setText(String.valueOf(increment.getValue()));
            }
        });
        button_goto_cat_counter = findViewById(R.id.button_goto_cats_counter);
        button_goto_cat_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CatCounterAcrivity.class);
                startActivity(intent);
            }
        });
    }
}