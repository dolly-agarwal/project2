package com.example.faltu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String s="";
    int t=0;
    public void press0(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        TextView text =  (TextView)findViewById(R.id.textView2);
        char c='0';
        s=s+c;
        text.setText(""+s);
    }
    public void press1(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='1';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void press2(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='2';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void press3(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='3';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void press4(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='4';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void press5(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='5';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void press6(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='6';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void press7(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='7';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void press8(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='8';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void press9(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='9';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void pressDot(View v)
    {
        if(t==1)
        {
            s="";
            t=0;
        }
        char c='.';
        s=s+c;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void pressP(View v)
    {
        if(t==1)
            t=0;
        TextView text =  (TextView)findViewById(R.id.textView2);
        double n=value(s);
        s=""+n;
        text.setText(""+s);
        char c='+';
        s=s+c;
        text.setText(""+s);
    }
    public void pressS(View v)
    {
        if(t==1)
            t=0;
        TextView text =  (TextView)findViewById(R.id.textView2);
        double n=value(s);
        s=""+n;
        text.setText(""+s);
        char c='-';
        s=s+c;
        text.setText(""+s);
    }
    public void pressM(View v)
    {
        if(t==1)
            t=0;
        TextView text =  (TextView)findViewById(R.id.textView2);
        double n=value(s);
        s=""+n;
        text.setText(""+s);
        char c='*';
        s=s+c;
        text.setText(""+s);
    }
    public void pressD(View v)
    {
        if(t==1)
            t=0;
        TextView text =  (TextView)findViewById(R.id.textView2);
        double n=value(s);
        s=""+n;
        text.setText(""+s);
        char c='/';
        s=s+c;
        text.setText(""+s);
    }
    public void pressC(View v)
    {
        if(t==1)
            t=0;
        s="";
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }

    public void pressCut(View v)
    {
        if(t==1)
            t=0;
        int n=s.length();
        if(n>0)
        s=s.substring(0,n-1);
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+s);
    }
    public void pressEqual(View v)
    {
        double n=value(s);
       s=""+n;
        TextView text =  (TextView)findViewById(R.id.textView2);
        text.setText(""+n);
        t++;
    }
    public int isDigit(char c)
    {
        int m=c-'0';
        if(m>=0&&m<=9)
        {
            return 1;
        }
        else
            return 0;
    }
//    public int value(String s)
//    {
//        int i=0;
//        if(i<s.length())
//        if(isDigit(s.charAt(i))==1)
//            return 9;
//        return 5;
//    }
    public double value(String s)
    {
        double f;
        String sd="";
        int i=0;
        while(i<s.length())
        {
            if(isDigit(s.charAt(i))==1||s.charAt(i)=='.')
            {
                sd=sd+s.charAt(i);
                i++;
            }
            else
                break;
        }
        f=Double.parseDouble(sd);
        sd="";
        int opr=i;
        i++;
        for(;i<s.length();i++)
        {
            if (isDigit(s.charAt(i)) == 1||s.charAt(i)=='.')
            {
                sd = sd + s.charAt(i);
            }
        }
        if(sd!="") {
            double op = Double.parseDouble(sd);
            if (s.charAt(opr) == '+')
                f = op + f;
            else if (s.charAt(opr) == '/')
                f = f / op;
            else if (s.charAt(opr) == '-')
                f = f - op;
            else if (s.charAt(opr) == '*')
                f = op * f;
        }
        return f;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}