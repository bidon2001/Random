package com.logic.random;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        final EditText min = (EditText)findViewById(R.id.edit_min);
        final EditText max = (EditText)findViewById(R.id.edit_max);

        final TextView result = (TextView)findViewById(R.id.text_result);

        final Button random = (Button)findViewById(R.id.button_random);

        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int mi, ma, random;
                try {

                    mi = Integer.parseInt(min.getText().toString());
                    ma = Integer.parseInt(max.getText().toString());

                    random = mi + (int) (Math.random() * ma);

                    result.setText(Integer.toString(random));

                }catch (Exception e){
                    result.setText("Error!");
                }

            }
        });

    }
}
