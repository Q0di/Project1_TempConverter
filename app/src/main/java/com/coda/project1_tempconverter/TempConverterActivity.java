package com.coda.project1_tempconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.widget.TextView.OnEditorActionListener;

public class TempConverterActivity extends AppCompatActivity
    implements OnEditorActionListener {

    private EditText editText;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);
      //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);

        editText = (EditText)findViewById(R.id.editText);
        textView4.setOnEditorActionListener(this);



      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    protected float findCel(float far){
        float cel = 0;
            cel = (far - 32)*(5/9);
        return cel;
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event){
        if(actionId == EditorInfo.IME_ACTION_DONE){
           /* try {
                float far = Float.valueOf(editText.getText().toString());
                findCel(far);

            }catch(NumberFormatException e){

                e.printStackTrace();

            }*/

        }


        return false;
    }
}
