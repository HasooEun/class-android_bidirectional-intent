package com.example.hasoo.mindtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK) {

            int imgs[] = new int[5];
            imgs[0] = R.drawable.img1;
            imgs[1] = R.drawable.img2;
            imgs[2] = R.drawable.img3;
            imgs[3] = R.drawable.img4;
            imgs[4] = R.drawable.img5;

            String contents[] = new String[5];
            contents[0] = "사자는 자존심을 의미합니다.\n";
            contents[1] = "말은 가족을 의미합니다.\n";
            contents[2] = "양은 사랑을 의미합니다.\n";
            contents[3] = "원숭이는 친구를 의미합니다.\n";
            contents[4] = "소는 직업을 의미합니다.\n";

            String comment = "\n당신이 선택한 동물은 살아가면서 힘든 일이 닥쳤을 때, 가장 먼저 버리게 되는 것을 의미한다고 합니다.\n\n" + "당신이 마지막까지 포기하지 않고 싶은 것은 무엇인가요?";

           ImageView imageView = (ImageView) findViewById(R.id.imageView);
            imageView.setImageResource(imgs[data.getIntExtra("AnimalType", 0)]);

            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText(contents[data.getIntExtra("AnimalType", 0)] + comment);



        }
    }
}
