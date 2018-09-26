package com.csdi.ati.fhapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Chat extends AppCompatActivity {
    private Button btnchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        btnchat = (Button) findViewById(R.id.btn_chat);
        btnchat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {

                Intent intent = getPackageManager().getLaunchIntentForPackage("com.csdichat.inderjeet.cchat");
                if (intent != null) {

                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);

                } else {

                    onGoToAnotherInAppStore(intent, "com.csdichat.inderjeet.cchat");

                }



        }

            private void onGoToAnotherInAppStore(Intent intent, String s) {

                try {

                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.setData(Uri.parse("market://details?id=" + "com.csdichat.inderjeet.cchat"));
                    startActivity(intent);

                } catch (android.content.ActivityNotFoundException anfe) {

                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.setData(Uri.parse("http://play.google.com/store/apps/details?id=" + "com.csdichat.inderjeet.cchat"));
                    startActivity(intent);

                }
            }
            });



    }
}

