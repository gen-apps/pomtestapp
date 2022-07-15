package io.vom;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View container  = findViewById(R.id.container);

        container.setOnClickListener(view -> {
            View currentFocus = getCurrentFocus();
            if (currentFocus != null){
                currentFocus.clearFocus();
                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        });
        loginButton =  findViewById(R.id.loginButton);


        loginButton.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(getApplicationContext(), HomeActivity.class);

            startActivity(intent);
        });
    }
}