package com.logic.random;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class TextActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        final Random random = new Random();

        final Button add = (Button)findViewById(R.id.button_add);
        final Button rnd = (Button)findViewById(R.id.button_rnd);

        final TextView t = (TextView)findViewById(R.id.textView);

        final EditText text = (EditText)findViewById(R.id.editText);

        final ListView list = (ListView)findViewById(R.id.random_list);

        final ArrayList<String> names = new ArrayList<String>();

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
        list.setAdapter(adapter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                names.add(0, text.getText().toString());
                adapter.notifyDataSetChanged();
                text.setText("");

            }
        });

        rnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int s = random.nextInt(Integer.valueOf(names.size()));
                t.setText(String.valueOf(list.getAdapter().getItem(s)));

            }
        });

    }

}
