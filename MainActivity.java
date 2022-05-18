 package com.example.sumanshu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {




     double input1 = 0, input2 = 0;
     TextView edt1, edt2;
     boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;
     Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
             buttonMul, buttonDivision, buttonEqual, buttonDel, buttonDot, Remainder , butttonclear;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        button0 = (Button) findViewById(R.id.btnzero);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        buttonDot = (Button) findViewById(R.id.btndic);
        buttonAdd = (Button) findViewById(R.id.btnplus);
        buttonSub = (Button) findViewById(R.id.btnsub);
        buttonMul = (Button) findViewById(R.id.btnmultiply);
        buttonDivision = (Button) findViewById(R.id.btndivision);
//        Remainder = (Button) findViewById(R.id.Remainder);
        buttonDel = (Button) findViewById(R.id.btnback);
        buttonEqual = (Button) findViewById(R.id.btnequal);
        butttonclear =(Button) findViewById(R.id.btnclear);







        edt1 = (TextView) findViewById(R.id.info);

        edt2 =(TextView) findViewById(R.id.result);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
//                    edt1.setText(String.valueOf(input1) + "+");
                    Addition = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Subtract = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt1.setText(null);
                }
            }
        });

//        buttonDivision.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (edt1.getText().length() != 0) {
//                    input1 = Float.parseFloat (edt1.getText() + "/");
//                    Division = true;
//                    decimal = false;
//                    edt1.setText(null);
//                }
//            }
//        });

//        Remainder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (edt1.getText().length() != 0) {
//                    input1 = Float.parseFloat(edt1.getText() + "");
//                    mRemainder = true;
//                    decimal = false;
//                    edt1.setText(null);
//                }
//            }
//        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(edt1.getText() + "");
                }

                if (Addition) {

                    edt1.setText(input1 + input2 + "");
                    Addition = false;
                }

                if (Subtract) {

                    edt1.setText(input1 - input2 + "");
                    Subtract = false;
                }

                if (Multiplication) {
                    edt1.setText(input1 * input2 + "");
                    Multiplication = false;
                }

                if (Division) {
                    edt1.setText(input1 / input2 + "");
                    Division = false;
                }
                if (mRemainder) {
                    edt1.setText(input1 % input2 + "");
                    mRemainder = false;
                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });





        }

}


