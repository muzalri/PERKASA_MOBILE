package com.example.perkasa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class LoginActivity extends AppCompatActivity {

    private LinearLayout signUpLayout, signInLayout;
    private Button toSignInBtn, toSignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference to the layouts
        signUpLayout = findViewById(R.id.signUpLayout);
        signInLayout = findViewById(R.id.signInLayout);

        // Reference to the buttons
        toSignInBtn = findViewById(R.id.toSignInBtn);
        toSignUpBtn = findViewById(R.id.toSignUpBtn);

        // Load animations
        final Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        final Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);

        // Switch to Sign In layout with animation
        toSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpLayout.startAnimation(fadeOut);
                signUpLayout.setVisibility(View.GONE);
                signInLayout.startAnimation(fadeIn);
                signInLayout.setVisibility(View.VISIBLE);
            }
        });

        // Switch to Sign Up layout with animation
        toSignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signInLayout.startAnimation(fadeOut);
                signInLayout.setVisibility(View.GONE);
                signUpLayout.startAnimation(fadeIn);
                signUpLayout.setVisibility(View.VISIBLE);
            }
        });
    }
}