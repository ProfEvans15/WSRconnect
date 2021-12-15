package com.example.wsrconnect;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitText();

    }
    //Run on start builds the MAIN structure list of past events
    public void InitText(){
        TextView textView = findViewById(R.id.RunningLog);
        String newText = "";
        StringBuilder text = new StringBuilder();
        for(int i=0; i<=100; i++) {
            text.append(newText).append(i).append("\n");
        }
        textView.setText(text);
    }
}