package com.example.toasttemplates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.muddzdev.styleabletoast.StyleableToast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    Button toast_show_button,styleable_button,id_toasty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast_show_button = findViewById(R.id.toast_show_button);
        toast_show_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Method to Custom Toast
                showToast();
            }
        });

        styleable_button = findViewById(R.id.styleable_button);
        styleable_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Method for styleable Toast
                showStyleToast();
            }
        });


    }

    //Using Toast Layout
    public void showToast(){
        /*
        Custom Toast with LayoutInflater
         */
        LayoutInflater layoutInflater = getLayoutInflater();
        View layout = layoutInflater.inflate(R.layout.toast_layout,(ViewGroup) findViewById(R.id.id_linear_layout));

        /* -- Custom your own Toast Here -- */
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        /*
        // Java Code Custom Toast
        TextView textView = layout.findViewById(R.id.text);
        ImageView imageView = layout.findViewById(R.id.image);
        textView.setText("Custom Toast here!");
        imageView.setImageResource(R.drawable.ic_toast_image);
         */
    }

    //Using StyleAble Library
    public void showStyleToast(){
        StyleableToast.makeText(MainActivity.this,"Styleable Toast Here !!",Toast.LENGTH_LONG,R.style.styleToast).show();
    }

}
