package com.csdi.ati.fhapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.tml.sharethem.demo.DemoActivity;

public class Dashboard extends AppCompatActivity {

    ImageButton bi1,bi2,bi3,bi4,bi5,bi6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        bi1=(ImageButton)findViewById(R.id.imgB1);
        bi2=(ImageButton)findViewById(R.id.imgB2);
        bi3=(ImageButton)findViewById(R.id.imgB3);
        bi4=(ImageButton)findViewById(R.id.imgB4);
        bi5=(ImageButton)findViewById(R.id.imgB5);
        bi6=(ImageButton)findViewById(R.id.imgB6);

        bi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),Chat.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Chat",Toast.LENGTH_SHORT).show();
            }
        });
        bi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),DemoActivity.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Lan transfer",Toast.LENGTH_SHORT).show();
            }
        });
        bi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),Alert.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Alert",Toast.LENGTH_SHORT).show();
            }
        });
        bi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),Gallery.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Gallery",Toast.LENGTH_SHORT).show();
            }
        });
        bi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),video.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Video",Toast.LENGTH_SHORT).show();
            }
        });
        bi6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplication(),welcomeabout.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"About",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dash, menu);
        return true;
    }
    public void onProfile(MenuItem mi)
    {
        startActivity(new Intent(Dashboard.this, MainActivity.class));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        {
            startActivity(new Intent(Dashboard.this, welcomeabout.class));
        }
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}