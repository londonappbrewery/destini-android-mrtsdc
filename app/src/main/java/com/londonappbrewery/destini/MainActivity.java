package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private Button mTombolAtas;
    private Button mTombolBawah;
    private TextView mTextView;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
    mTombolAtas = findViewById(R.id.tombolAtas);
    mTombolBawah = findViewById(R.id.tombolBawah);
    mTextView = findViewById(R.id.ceritaTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTombolAtas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(mStoryIndex == 1 || mStoryIndex == 2){
                mTextView.setText(R.string.T3_Story);
                mTombolAtas.setText(R.string.T3_Ans1);
                mTombolBawah.setText(R.string.T3_Ans2);
                mStoryIndex = 3;
               } else {
                   mTextView.setText(R.string.T6_End);
                   mStoryIndex = 6;
                    mTombolAtas.setVisibility(View.GONE);
                    mTombolBawah.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mTombolBawah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){

                    mTextView.setText(R.string.T2_Story);
                    mTombolAtas.setText(R.string.T2_Ans1);
                    mTombolBawah.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 3){

                    mTextView.setText(R.string.T5_End);
                    mStoryIndex = 3;
                    mTombolAtas.setVisibility(View.GONE);
                    mTombolBawah.setVisibility(View.GONE);

                } else {

                    mTextView.setText(R.string.T4_End);
                    mStoryIndex = 4;
                    mTombolAtas.setVisibility(View.GONE);
                    mTombolBawah.setVisibility(View.GONE);

                }

            }
        });

    }

}
