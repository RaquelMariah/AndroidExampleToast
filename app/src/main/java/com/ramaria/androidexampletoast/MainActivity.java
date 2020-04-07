package com.ramaria.androidexampletoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void exibirToast(View view){
                                            //ou getApplicationContext()
        ImageView image = new ImageView(this);
        image.setImageResource(android.R.drawable.btn_star_big_on);

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(image);
        toast.show();
        //Toast.makeText(getApplicationContext(),"Hello Toast", Toast.LENGTH_SHORT).show();
    }
}
