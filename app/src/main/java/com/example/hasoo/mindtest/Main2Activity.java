package com.example.hasoo.mindtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String title = "액티비티 호출";
        setTitle(title);
    }

    public void onClick(View v){

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        if(v.getId() == R.id.button2)  intent.putExtra("AnimalType", 0);
        else if(v.getId() == R.id.button3)  intent.putExtra("AnimalType", 1);
        else if(v.getId() == R.id.button4)  intent.putExtra("AnimalType", 2);
        else if(v.getId() == R.id.button5)  intent.putExtra("AnimalType", 3);
        else if(v.getId() == R.id.button6)  intent.putExtra("AnimalType", 4);

        setResult(RESULT_OK, intent);
        finish();
    }
}
