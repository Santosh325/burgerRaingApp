package com.example.burgerating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {
    Button submit;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        submit = findViewById(R.id.button);
        ratingBar = findViewById(R.id.rate);
        ratingBar.setRating(2.5f);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rate = ratingBar.getRating();
                Toast.makeText(getApplicationContext(),String.valueOf(rate)+ " Star",Toast.LENGTH_SHORT ).show();
            }
        });
//        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//                Toast.makeText(getApplicationContext(),String.valueOf(rating),Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
