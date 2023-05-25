package com.example.ad_lp2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText editText;
        Button button;

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }

    public void newsScreen(View view) {
        Intent i = new Intent(getApplicationContext(), SecondActivity.class);
        startActivity(i);
    }
}