package com.example.gema.androidbottomfragmentgojek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SlideShowActivity extends AppCompatActivity {

    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_show);

        btnToast = findViewById(R.id.button_toast_slideshow);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SlideShowActivity.this, "Slide Show Activity", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
