package com.incapp.animation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button buttonRotate;
    private ImageView imageView;
    private Button buttonTranslate;
    Button buttonWheel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRotate = findViewById(R.id.button_rotate);
        imageView = findViewById(R.id.imageView);
        buttonTranslate = findViewById(R.id.button_translate);
        buttonWheel = findViewById(R.id.button_wheel);

        buttonRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(
                        MainActivity.this, R.anim.rotate_animation);

                imageView.startAnimation(animation);

            }
        });

        buttonTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(
                        MainActivity.this, R.anim.translate_animation);

                imageView.startAnimation(animation);

            }
        });

        buttonWheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation animation = AnimationUtils.loadAnimation(
                        MainActivity.this, R.anim.rotate_translate_animation);

                imageView.startAnimation(animation);

            }
        });
    }
}
