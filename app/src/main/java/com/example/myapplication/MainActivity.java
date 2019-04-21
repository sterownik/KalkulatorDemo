package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String str2,str3;
    String str="";
    String str1="";
    char znak=' ';


    Float liczba1,liczba2;
    Float wynik,wynik1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    //    Button id1,id2,id3,id4,id5,id6,id7,id8,id9,id0,idc,idkr,idro,iddz,idra,idmi,idpl;
        //EditText editText;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button id1=(Button)findViewById(R.id.id1);
        Button id2=(Button)findViewById(R.id.id2);
        Button id3=(Button)findViewById(R.id.id3);
        Button id4=(Button)findViewById(R.id.id4);
        Button id5=(Button)findViewById(R.id.id5);
        Button id6=(Button)findViewById(R.id.id6);
        Button id7=(Button)findViewById(R.id.id7);
        Button id8=(Button)findViewById(R.id.id8);
        Button id9=(Button)findViewById(R.id.id9);
        Button id0=(Button)findViewById(R.id.id0);
        Button idc=(Button)findViewById(R.id.idc);
        Button idkr=(Button)findViewById(R.id.idkr);
        Button idro=(Button)findViewById(R.id.idro);
        Button iddz=(Button)findViewById(R.id.iddz);
        Button idra=(Button)findViewById(R.id.idra);
        Button idmi=(Button)findViewById(R.id.idmi);
        Button idpl=(Button)findViewById(R.id.idpl);
        Switch switch1=(Switch)findViewById(R.id.switch1);
        final TextView textView=(TextView)findViewById(R.id.textView);
        textView.setVisibility(View.INVISIBLE);
        textView.setText("Program został wykonany przez Wojciecha Gołde w dniu 21 dnia kwietnia 2019 roku");

        final TextView textView2=(TextView)findViewById(R.id.textView2);



        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    textView.setVisibility(View.VISIBLE);
                }
                else
                {
                    textView.setVisibility(View.INVISIBLE);
                }
            }
        });




        id0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(znak==' ')
            {
                str2="0";
                str=str+str2;

                textView2.setText(str);
            }
            else
            {
                str3="0";
                str1=str1+str3;

                textView2.setText(str1);
            }
            }
        });
        id1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = "1";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="1";
                    str1=str1+str3;

                    textView2.setText(str1);
                }
            }
        });
        id2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = "2";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="2";
                    str1=str1+str3;

                    textView2.setText(str1);
                }
            }
        });
        id3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = "3";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="3";
                    str1=str1+str3;

                    textView2.setText(str1);
                }
            }
        });
        id4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = "4";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="4";
                    str1=str1+str3;

                    textView2.setText(str1);
                }
            }
        });
        id5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = "5";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="5";
                    str1=str1+str3;

                    textView2.setText(str1);
                }
            }
        });
        id6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = "6";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="6";
                    str1=str1+str3;

                    textView2.setText(str1);
                }
            }
        });
        id7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = "7";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="7";
                    str1=str1+str3;

                    textView2.setText(str1);
                }
            }
        });
        id8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = "8";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="8";
                    str1=str1+str3;

                    textView2.setText(str1);
                }
            }
        });
        id9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = "9";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="9";
                    str1=str1+str3;

                    textView2.setText(str1);
                }
            }
        });
        idc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            textView2.setText(null);
            str="";
            str1="";
            znak=' ';
            wynik=null;
            wynik1=null;
            }
        });
        iddz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            znak='/';
            if(wynik!=null)
            {
                wynik1=wynik;
                str1="";
            }

            }
        });
        idkr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(znak==' ') {
                    str2 = ".";
                    str = str + str2;

                    textView2.setText(str);
                }
                else
                {
                    str3="9";
                    str1=str1+str3;

                    textView2.setText(str1);


                }
            }
        });
        idmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            znak='-';
                if(wynik!=null)
                {
                    wynik1=wynik;
                    str1="";
                }

            }
        });
        idpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            znak='+';
                if(wynik!=null)
                {
                    wynik1=wynik;
                    str1="";
                }

            }
        });
        idra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            znak='x';
                if(wynik!=null)
                {
                    wynik1=wynik;
                    str1="";
                }
            }
        });
        idro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (znak)
                {
                    case 'x':
                        liczba1=Float.parseFloat(str);
                        liczba2=Float.parseFloat(str1);
                        if(wynik1!=null)wynik=wynik1*liczba2;
                        else wynik = liczba1 * liczba2;



                        textView2.setText(wynik.toString());
                        break;
                    case '/':

                        liczba1=Float.parseFloat(str);
                        liczba2=Float.parseFloat(str1);
                        if(wynik1!=null)wynik=wynik1/liczba2;
                        else wynik = liczba1 / liczba2;
                        if(liczba2!=0) {

                            textView2.setText(wynik.toString());
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"nie wolno dzielić przez zero",Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case '+':
                        liczba1=Float.parseFloat(str);
                        liczba2=Float.parseFloat(str1);
                        if(wynik1!=null)wynik=wynik1+liczba2;
                        else wynik = liczba1 + liczba2;

                        textView2.setText(wynik.toString());;
                        break;
                    case '-':
                        liczba1=Float.parseFloat(str);
                        liczba2=Float.parseFloat(str1);
                        if(wynik1!=null)wynik=wynik1-liczba2;
                        else wynik = liczba1 - liczba2;


                        textView2.setText(wynik.toString());;
                        break;

                }
            }
        });



    }
}
