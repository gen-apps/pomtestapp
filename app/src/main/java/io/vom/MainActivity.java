package io.vom;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton =  findViewById(R.id.loginButton);

        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(getApplicationContext(), HomeActivity.class);

            startActivity(intent);
        });
    }
}