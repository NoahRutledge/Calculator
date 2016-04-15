package com.something.myfirstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import static java.lang.Math.sqrt;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private double currenTopText = 0.0;
    private double value = 0.0;
    private int last = 0; //last is an int variable from 1-4 that is set each function (add,minus,multiply,divide) to make things easier in "equals"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public int factorial(double n){
        if (n == 1){
            return 1;
        }
        else{
            return (int) n * factorial(n-1);
        }
    }
    //--------------------------
    //Clicked button
    //--------------------------
    public void clickedPI (View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        currenTopText = 3.14159;
        topText.setText(currenTopText+"");
    }
    public void clickedSquare(View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        currenTopText = currenTopText*currenTopText;
        topText.setText(currenTopText+"");
    }
    public void clickedCubed(View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        currenTopText = currenTopText*currenTopText*currenTopText;
        topText.setText(currenTopText+"");
    }
    public void clickedFactorial(View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        currenTopText = factorial(currenTopText);
        topText.setText(currenTopText+"");
    }
    public void clickedRoot(){
        TextView topText = (TextView) findViewById(R.id.topText);
        currenTopText = Math.sqrt(currenTopText);
        topText.setText(currenTopText+"");
    }
    public void clickedZero(View view){
        currenTopText *= 10.0;
        currenTopText += 0;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(""+currenTopText);
    }
    public void clickedOne(View view){
        currenTopText *= 10.0;
        currenTopText += 1;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(""+currenTopText);
    }
    public void clickedTwo(View view){
        currenTopText *= 10.0;
        currenTopText += 2;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(""+currenTopText);
    }
    public void clickedThree(View view){
        currenTopText *= 10.0;
        currenTopText += 3;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(""+currenTopText);
    }
    public void clickedFour(View view){
        currenTopText *= 10.0;
        currenTopText += 4;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(""+currenTopText);
    }
    public void clickedFive(View view){
        currenTopText *= 10.0;
        currenTopText += 5;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(""+currenTopText);
    }
    public void clickedSix(View view){
        currenTopText *= 10.0;
        currenTopText += 6;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(""+currenTopText);
    }
    public void clickedSeven(View view){
        currenTopText *= 10.0;
        currenTopText += 7;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(""+currenTopText);
    }
    public void clickedEight(View view){
        currenTopText *= 10.0;
        currenTopText += 8;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(""+currenTopText);
    }
    public void clickedNine(View view) {
        currenTopText *= 10.0;
        currenTopText += 9;
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("" + currenTopText);
    }
    public void clickedDiv(View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        if (value == 0){
            topText.setText(currenTopText/1+"");
            value = currenTopText/1;
        }
        else{
            topText.setText(value/currenTopText+"");
            value = value/currenTopText;
        }
        currenTopText = 0.0;
        last = 4;
    }
    public void clickedMul(View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        if (value == 0){
            topText.setText(currenTopText*1+"");
            value = currenTopText*1;
        }
        else{
            topText.setText(currenTopText*value+"");
            value = currenTopText*value;
        }
        currenTopText = 0.0;
        last = 3;
    }
    public void clickedMin(View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        if (value == 0){
            value = currenTopText-value;
            currenTopText = 0.0;
        }
        else {
            topText.setText(value - currenTopText + "");
            value = value - currenTopText;
            currenTopText = 0.0;
        }
        last = 2;
    }
    public void clickedAdd(View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText(currenTopText+value+"");
        value = currenTopText+value;
        currenTopText = 0.0;
        last = 1;
    }
    public void clickedAC(View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        topText.setText("0.0");
        currenTopText = 0.0;
        value = 0.0;
        last = 0;
    }
    public void clickedEqu(View view){
        TextView topText = (TextView) findViewById(R.id.topText);
        if (last == 1) {
            topText.setText(currenTopText + value + "");
            value = currenTopText + value;
        }
        else if (last == 2){
            topText.setText(value - currenTopText + "");
            value = value - currenTopText;
        }
        else if (last == 3){
            topText.setText(currenTopText * value + "");
            value = currenTopText * value;
        }
        else if (last == 4){
            topText.setText(value / currenTopText + "");
            value = value / currenTopText;
        }
    }

}
