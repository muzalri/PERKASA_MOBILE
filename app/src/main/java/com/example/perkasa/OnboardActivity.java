    package com.example.perkasa;

    import android.content.Intent;
    import android.os.Bundle;
    import android.widget.ImageButton;

    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;

    public class OnboardActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_onboard);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });

            ImageButton btnOnboard = findViewById(R.id.btn_onboard);
            btnOnboard.setOnClickListener(v -> {
                Intent intent = new Intent(OnboardActivity.this, LoginActivity.class);

                startActivity(intent);
            });


        }
    }