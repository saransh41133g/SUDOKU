package com.example.user.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    EditText editText5;
    EditText editText6;
    EditText editText7;
    EditText editText8;
    EditText editText9;
    EditText editText10;
    EditText editText11;
    EditText editText12;
    EditText editText13;
    EditText editText14;
    EditText editText15;
    EditText editText16;
    EditText editText17;
    Button button;
     int a[][]=new int[4][4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=(EditText)findViewById(R.id.textView1);
        editText2=(EditText)findViewById(R.id.textView2);
        editText3=(EditText)findViewById(R.id.textView3);
        editText4=(EditText)findViewById(R.id.textView4);
        editText5=(EditText)findViewById(R.id.textView5);
        editText6=(EditText)findViewById(R.id.textView6);
        editText7=(EditText)findViewById(R.id.textView7);
        editText8=(EditText)findViewById(R.id.textView8);
        editText9=(EditText)findViewById(R.id.textView9);
        editText10=(EditText)findViewById(R.id.textView10);
        editText11=(EditText)findViewById(R.id.textView11);
        editText12=(EditText)findViewById(R.id.textView12);
        editText13=(EditText)findViewById(R.id.textView13);
        editText14=(EditText)findViewById(R.id.textView14);
        editText15=(EditText)findViewById(R.id.textView15);
        editText16=(EditText)findViewById(R.id.textView16);
        editText17=(EditText)findViewById(R.id.textView17);
        button=(Button)findViewById(R.id.bt1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a[0][0]=Integer.parseInt(editText1.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[0][1]=Integer.parseInt(editText2.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[0][2]=Integer.parseInt(editText3.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[0][3]=Integer.parseInt(editText4.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[1][0]=Integer.parseInt(editText5.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[1][1]=Integer.parseInt(editText6.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[1][2]=Integer.parseInt(editText7.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[1][3]=Integer.parseInt(editText8.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[2][0]=Integer.parseInt(editText9.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[2][1]=Integer.parseInt(editText10.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[2][2]=Integer.parseInt(editText11.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[2][3]=Integer.parseInt(editText12.getText().toString());
                if (a[0][0]>4||a[0][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ", Toast.LENGTH_LONG).show();
                }
                a[3][0]=Integer.parseInt(editText13.getText().toString());
                if (a[3][0]>4||a[3][0]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[3][1]=Integer.parseInt(editText14.getText().toString());
                if (a[3][1]>4||a[3][1]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[3][2]=Integer.parseInt(editText15.getText().toString());
                if (a[3][2]>4||a[3][2]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                a[3][3]=Integer.parseInt(editText16.getText().toString());
                if (a[3][3]>4||a[3][3]<1) {
                    Toast.makeText(getApplicationContext(), "You have entered a Wrong Number ",Toast.LENGTH_LONG).show();
                }
                int l=0;
                for(int i=0;i<4;i++)
                {int b[]=new int [4];
                    for(int j=0;j<4;j++)
                    {
                        b[j]=a[i][j];
                    }

                    for(int p=0;p<4;p++)
                    {for(int q=(p+1);q<4;q++)
                    {if(b[p]>b[q])
                    {int temp;
                        temp=b[p];
                        b[p]=b[q];
                        b[q]=temp;
                    }
                    }
                    }
                    for(int j=0;j<4;j++)
                    {if(b[j]!=(j+1))
                    {   l=1;
                        break;
                    }
                    }
                    if(l==1)
                    {break;
                    }
                }
                for(int i=0;i<4;i++)
                {int b[]=new int [4];
                    for(int j=0;j<4;j++)
                    {
                        b[j]=a[j][i];
                    }
                    for(int p=0;p<4;p++)
                    {for(int q=(p+1);q<4;q++)
                    {if(b[p]>b[q])
                    {int temp;
                        temp=b[p];
                        b[p]=b[q];
                        b[q]=temp;
                    }
                    }
                    }
                    for(int j=0;j<4;j++)
                    {if(b[j]!=(j+1))
                    {   l=1;
                        break;
                    }
                    }
                    if(l==1)
                    {break;
                    }
                }
                int c[]=new int [4];
                int w=0;
                for(int i=0;i<2;i++)
                {for(int j=0;j<2;j++)
                {
                    c[w]=a[i][j];
                    w++;
                }
                }
                for(int i=0;i<4;i++)
                {for(int j=(i+1);j<4;j++)
                {
                    if(c[i]>c[j])
                    {int temp;
                        temp=c[i];
                        c[i]=c[j];
                        c[j]=temp;
                    }
                }
                }
                for(int i=0;i<4;i++)
                {
                    if(c[i]!=(i+1))
                    {l=1;
                    }
                }
                int d[]=new int [4];
                int x=0;
                for(int i=2;i<4;i++)
                {for(int j=0;j<2;j++)
                {
                    d[x]=a[i][j];
                    x++;
                }
                }
                for(int i=0;i<4;i++)
                {for(int j=(i+1);j<4;j++)
                {
                    if(d[i]>d[j])
                    {int temp;
                        temp=d[i];
                        d[i]=d[j];
                        d[j]=temp;
                    }
                }
                }
                for(int i=0;i<4;i++)
                {
                    if(d[i]!=(i+1))
                    {l=1;
                    }
                }
                int e[]=new int [4];
                int y=0;
                for(int i=0;i<2;i++)
                {for(int j=2;j<4;j++)
                {
                    e[y]=a[i][j];
                    y++;
                }
                }
                for(int i=0;i<4;i++)
                {for(int j=(i+1);j<4;j++)
                {
                    if(e[i]>e[j])
                    {int temp;
                        temp=e[i];
                        e[i]=e[j];
                        e[j]=temp;
                    }
                }
                }
                for(int i=0;i<4;i++)
                {
                    if(e[i]!=(i+1))
                    {l=1;
                    }
                }
                int f[]=new int [4];
                int z=0;
                for(int i=2;i<4;i++)
                {for(int j=2;j<4;j++)
                {
                    f[z]=a[i][j];
                    z++;
                }
                }
                for(int i=0;i<4;i++)
                {for(int j=(i+1);j<4;j++)
                {
                    if(f[i]>f[j])
                    {int temp;
                        temp=f[i];
                        f[i]=f[j];
                        f[j]=temp;
                    }
                }
                }
                for(int i=0;i<4;i++)
                {
                    if(f[i]!=(i+1))
                    {l=1;
                    }
                }
                if(l==1)
                {editText17.setText("Sorry try it again");
                }
                else
                {editText17.setText("Congrats you solved it");
                }
                Intent i= new Intent(getApplicationContext(),SUBMIT.class);
                startActivity(i);
            }
        });


    }
}
