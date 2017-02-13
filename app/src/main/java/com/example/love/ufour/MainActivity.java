package com.example.love.ufour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.text);
        buttonListener listener = new buttonListener();
        button.setOnClickListener(listener);
    }
    class buttonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            text.setText("I am full");
        }
    }
}
