package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    CheckBox checkbox1,checkbox2;
    private int mCount1 = 0,mCount2 = 0,price1=0,price2=0;
    private TextView mShowCount1,mShowCount2;
    private String toast_message="";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkbox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkbox2 = (CheckBox) findViewById(R.id.checkBox2);
        mShowCount1 = (TextView) findViewById(R.id.showCount1);
        mShowCount2 = (TextView) findViewById(R.id.show_count2);
    }
//    public void showToast(View view) {
//        toast_message = "Order = " + mCount;
//        Toast toast = Toast.makeText(this,toast_message,
//                Toast.LENGTH_LONG);
//        toast.show();
//    }
    public void countUp1(View view)
    {
        mCount1++;
        if (mShowCount1 != null)
            mShowCount1.setText(Integer.toString(mCount1));
    }
    public void countDown1(View view)
    {
        mCount1--;
        if (mCount1<0)
            mCount1 = 0;
        if(mShowCount1 != null)
            mShowCount1.setText(Integer.toString(mCount1));
    }

    public void countUp2(View view)
    {
        mCount2++;
        if (mShowCount2 != null)
            mShowCount2.setText(Integer.toString(mCount2));
    }
    public void countDown2(View view)
    {
        mCount2--;
        if (mCount2<0)
            mCount2 = 0;
        if(mShowCount2 != null)
            mShowCount2.setText(Integer.toString(mCount2));
    }
    public void Order(View view)
    {
        if(checkbox1.isChecked()==false && checkbox2.isChecked()==false)
        {
            toast_message = "Nothing has been selected !";
        }
        else
        {
            if(mCount1==0 && mCount2 == 0)
            {
                toast_message = "Nothing has been selected !";
            }
            else
            {
                if(mCount1 >=0)
                {
                    price1 = mCount1 * 200;
                }
                if(mCount2 >=0)
                {
                    price2 = mCount2 * 100;
                }

                toast_message = "Amount For Burger = "+Integer.toString(price1)+"\n& for fries = "+Integer.toString(price2);
            }
        }
        Toast toast = Toast.makeText(this,toast_message,Toast.LENGTH_LONG);
        toast.show();
        price1=0;price2 =0;
    }

//    public void clear(View view)
//    {   /* Clears the screen in */
//        mCount = 0;
//        mShowCount.setText(Integer.toString(mCount));
//    }

}
