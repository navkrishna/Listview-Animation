package com.intelligrape.listviewanimation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Random;


public class MyActivity extends ActionBarActivity {

    String items[] = new String[50];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        for(int i=0;i<50;i++) {
            items[i] = "Random Item: " + new Random().nextInt();
        }


        ListView lv = (ListView) findViewById(R.id.lvList);
        lv.setAdapter(new MyAdapter(MyActivity.this, items));
    }

}
