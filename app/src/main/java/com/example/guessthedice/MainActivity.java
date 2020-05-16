package com.example.guessthedice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1;
    private ImageView image;
    private Button btn;
    private Button res;
    private Random rand=new Random();
    private int value;
    private TextView pt;
    private int count=0;
    private Button close;
    private int play=0;
    private TextView tv;
    private TextView num;
    private Button sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.guess);
        image = (ImageView) findViewById(R.id.dice);
        btn = (Button) findViewById(R.id.roll);
        pt=(TextView)findViewById(R.id.point);
        res = (Button) findViewById(R.id.reset);
        close=(Button)findViewById(R.id.exit);
        tv=(TextView)findViewById(R.id.times);
        num=(TextView)findViewById(R.id.number);
        sub=(Button)findViewById(R.id.submit);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (play != 10) {

                    if ((etNum1.getText().toString().equals("")) || (etNum1.getText().toString().equals(null))) {
                        Toast.makeText(getApplicationContext(), "Please Guess a number!", Toast.LENGTH_LONG).show();
                    }

                    else if (Integer.parseInt(etNum1.getText().toString()) >= 1 && Integer.parseInt(etNum1.getText().toString()) <= 6) {
                        rollDice();

                        if (etNum1.getText().toString().equals("1") && value == 1) {
                            Toast.makeText(getApplicationContext(), "WOW! You guessed it correct!", Toast.LENGTH_LONG).show();
                            count += 5;
                            pt.setText(String.valueOf(count));
                            play++;
                            tv.setText(String.valueOf(play));
                            if(play==1)
                                num.setText("time");
                            else
                                num.setText("times");

                        }

                        else if (etNum1.getText().toString().equals("2") && value == 2) {
                            Toast.makeText(getApplicationContext(), "WOW! You guessed it correct!", Toast.LENGTH_LONG).show();
                            count += 5;
                            pt.setText(String.valueOf(count));
                            play++;
                            tv.setText(String.valueOf(play));
                            if(play==1)
                                num.setText("time");
                            else
                                num.setText("times");
                        }

                        else if (etNum1.getText().toString().equals("3") && value == 3) {
                            Toast.makeText(getApplicationContext(), "WOW! You guessed it correct!", Toast.LENGTH_LONG).show();
                            count += 5;
                            pt.setText(String.valueOf(count));
                            play++;
                            tv.setText(String.valueOf(play));
                            if(play==1)
                                num.setText("time");
                            else
                                num.setText("times");
                        }

                        else if (etNum1.getText().toString().equals("4") && value == 4) {
                            Toast.makeText(getApplicationContext(), "WOW! You guessed it correct!", Toast.LENGTH_LONG).show();
                            count += 5;
                            pt.setText(String.valueOf(count));
                            play++;
                            tv.setText(String.valueOf(play));
                            if(play==1)
                                num.setText("time");
                            else
                                num.setText("times");
                        }

                        else if (etNum1.getText().toString().equals("5") && value == 5) {
                            Toast.makeText(getApplicationContext(), "WOW! You guessed it correct!", Toast.LENGTH_LONG).show();
                            count += 5;
                            pt.setText(String.valueOf(count));
                            play++;
                            tv.setText(String.valueOf(play));
                            if(play==1)
                                num.setText("time");
                            else
                                num.setText("times");
                        }

                        else if (etNum1.getText().toString().equals("6") && value == 6) {
                            Toast.makeText(getApplicationContext(), "WOW! You guessed it correct!", Toast.LENGTH_LONG).show();
                            count += 5;
                            pt.setText(String.valueOf(count));
                            play++;
                            tv.setText(String.valueOf(play));
                            if(play==1)
                                num.setText("time");
                            else
                                num.setText("times");
                        }

                        else {
                            Toast.makeText(getApplicationContext(), "Oops! Try again!", Toast.LENGTH_LONG).show();
                            play++;
                            tv.setText(String.valueOf(play));
                            if(play==1)
                                num.setText("time");
                            else
                                num.setText("times");
                        }


                    }

                    else {
                        Toast.makeText(getApplicationContext(), "Please input between 1 and 6!", Toast.LENGTH_LONG).show();
                    }
                }

                else
                {
                    tv.setTextColor(Color.RED);
                    num.setTextColor(Color.RED);
                    Toast.makeText(getApplicationContext(), "Thank You for your response.", Toast.LENGTH_LONG).show();
                    //showResult();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(play==10)
                {
                    showResult();
                }
                else if ((etNum1.getText().toString().equals("")) || (etNum1.getText().toString().equals(null))) {
                    Toast.makeText(getApplicationContext(), "Please Guess a number!", Toast.LENGTH_LONG).show();
                }
                else if (Integer.parseInt(etNum1.getText().toString()) < 1 || Integer.parseInt(etNum1.getText().toString()) > 6)
                {
                    Toast.makeText(getApplicationContext(), "Please input between 1 and 6!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please complete your guessing!", Toast.LENGTH_LONG).show();
                }
            }
        });


        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNum1.setText("");
                pt.setText("0");
                tv.setText("0");
                num.setText("time");
                play=0;
                image.setImageResource(R.drawable.dice1);
                count=0;
                tv.setTextColor(Color.WHITE);
                num.setTextColor(Color.WHITE);
                //recreate();
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }


        public void rollDice()
        {
            int random=rand.nextInt(6) + 1;
            switch(random)
            {
                case 1:
                    image.setImageResource(R.drawable.dice1);
                    value=1;
                    break;
                case 2:
                    image.setImageResource(R.drawable.dice2);
                    value=2;
                    break;
                case 3:
                    image.setImageResource(R.drawable.dice3);
                    value=3;
                    break;
                case 4:
                    image.setImageResource(R.drawable.dice4);
                    value=4;
                    break;
                case 5:
                    image.setImageResource(R.drawable.dice5);
                    value=5;
                    break;
                case 6:
                    image.setImageResource(R.drawable.dice6);
                    value=6;
                    break;
            }
        }

        public void showResult()
        {
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setTitle("Result:");
            double per=(double) ((double)((double)(count/5)/10)*100);
            int unicode = 0x1F60A;
            if(count/5==0)
                builder.setMessage("You guessed: "+count/5+"/10\n"+"Score: "+count+"\nGuess Percentage: "+(int)per+"%"+"\n\nBetter Luck Next Time!"+getEmojiByUnicode(unicode));
            else if(count/5==1 || count/5==2 || count/5==3)
                builder.setMessage("You guessed: "+count/5+"/10\n"+"Score: "+count+"\nGuess Percentage: "+(int)per+"%"+"\n\nKeep It Up!!"+getEmojiByUnicode(unicode));
            else
                builder.setMessage("You guessed: "+count/5+"/10\n"+"Score: "+count+"\nGuess Percentage: "+(int)per+"%"+"\n\nThat's Great!!!"+getEmojiByUnicode(unicode));

            builder.setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    recreate();
                    etNum1.setText("");
                    pt.setText("0");
                }
            });

            builder.setNegativeButton("Quit", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

            builder.show();
        }
    public String getEmojiByUnicode(int unicode){

        return new String(Character.toChars(unicode));
    }
}
