package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MAIN extends AppCompatActivity {

    TextView n,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_a_i_n);

        n = findViewById(R.id.numbers);
        p = findViewById(R.id.phrases);

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //          INTENT ---------

                Intent I = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(I);

                // -------------------------------

//                //          Fragment ---------
//                NumberFragment t1 = new NumberFragment();
//                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                ft.replace(R.id.Linear,t1);
//                ft.commit();
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //          INTENT ---------

                Intent I = new Intent(getApplicationContext(),Phrases.class);
                startActivity(I);

                // -------------------------------

            }
        });
    }

    public void next(View view) {
        Intent I = new Intent(this,MPTest.class);
        startActivity(I);
    }


}