package com.example.imagechanger;
//Alunos: Lucas Aguiar Cera e Renan Wenzel
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgMain;
    private Button btnImg1;
    private Button btnImg2;
    private Button btnImg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnImg1 = (Button) findViewById(R.id.btnImg1);
        btnImg2 = (Button) findViewById(R.id.btnImg2);
        btnImg3 = (Button) findViewById(R.id.btnImg3);

        btnImg1.setOnClickListener(new EscutadorBotao());
        btnImg2.setOnClickListener(new EscutadorBotao());
        btnImg3.setOnClickListener(new EscutadorBotao());
    }
    private class EscutadorBotao implements View.OnClickListener{
        @Override
        public void onClick(View view){
                imgMain = (ImageView) findViewById(R.id.imgMain);
                Button b = (Button) view;
                switch (b.getId()){
                    case R.id.btnImg1:
                        imgMain.setImageResource(R.drawable.img1);
                        break;
                    case R.id.btnImg2:
                        imgMain.setImageResource(R.drawable.img2);
                        break;
                    case R.id.btnImg3:
                        imgMain.setImageResource(R.drawable.img3);
                        break;
            }
        }
    }
}