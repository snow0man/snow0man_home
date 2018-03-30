package com.chyeseol.homework01;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    boolean fabFlag;
    public static final Random RANDOM = new Random();
    int hideNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        ImageView imageView1 = (ImageView)findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();


        fab.setOnClickListener((View view) -> {
            Toast.makeText(getApplicationContext(), "wow~", Toast.LENGTH_SHORT).show();

            initDice(imageView1, dice1,1);
            initDice(imageView2, dice2,2);
            initDice(imageView3, dice3,3);

            if (fabFlag) {
                fabFlag = false;
                ViewCompat.animate(fab)
                        .setDuration(500)
                        .rotation(360f)
                        .alpha(0f) //안보임
                        .scaleX(1.2f)
                        .scaleY(1.2f);

                //imageView1.animate().alpha(1f) ;//보임
            } else {
                fabFlag = true;
                ViewCompat.animate(fab)
                        .setDuration(500)
                        .rotation(0f)
                        .alpha(1f)
                        .scaleX(1f)
                        .scaleY(1f);
                //imageView1.animate().alpha(0f) ;//안보임
            }
        });
    }

    private void initDice(ImageView imageView, Dice dice, int diceNumber){
        String name = dice.getViewName(diceNumber);
        int ranNo = randomDiceValue();
        int res = getResources().getIdentifier(name + ranNo, "drawable", "com.chyeseol.homework01");
        imageView.setImageResource(res);
        rotation(imageView,dice);
    }

    public void rotation(ImageView imageView, Dice dice) {
        imageView.animate()
                .setDuration(500)
                .rotationBy(720)
                //.alphaBy(0f)
                //   .alpha(0f) // 투명, 안보인다
                //.alpha(1f) // 보인다
                .scaleXBy(1.5f).scaleYBy(1.5f)
                .scaleXBy(0.5f).scaleYBy(0.5f)
                .scaleXBy(0.0f).scaleYBy(0.0f)
                ;

    }
    //random
    public static int randomDiceValue(){
        return RANDOM.nextInt(6)+1;
    }

    // 히든 처리는 좀더 연구가 필요함
    public void diceShow(){
/*
 if (dice.getFlag()) {

            dice.setFlag(false);

            imageView.animate()
                    .setDuration(500)
                    .rotationBy(720.0f)
                 //   .alpha(0f) // 투명, 안보인다
                    //.alpha(1f) // 보인다
                    .scaleX(1.5f).scaleY(1.5f)
                    .scaleX(1f).scaleY(1f);
            //멈춤
        } else {

            dice.setFlag(true);
            imageView.animate()
                    .setDuration(500)
                    .rotationBy(0f)
                    //.alpha(0f) // 투명, 안보인다
//                    .alpha(1f) // 보인다
                    .scaleX(1.5f).scaleY(1.5f)
                    .scaleX(1f).scaleY(1f);
            //없어짐
 */
    }


}



