package com.example.admin.towaso;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WorkerRequest extends AppCompatActivity {
private Button button;
private TextView textView,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worker_request);
        button = (Button)findViewById(R.id.button3);
        textView2 = (TextView)findViewById(R.id.textView3);
        textView = (TextView)findViewById(R.id.textView2);
        textView.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Calendar calendar =Calendar.getInstance();
                @SuppressLint("SimpleDateFormat") SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
                String item = format.format(calendar.getTime());
                button.setText(" Accepted");
                button.setEnabled(false);
                textView.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                String currentdate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
                textView2.setText(currentdate);
               textView.setText(item);
            }
        });
    }
}
