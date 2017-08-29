package com.example.db.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button brow, mkcall, econtact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        brow = (Button) findViewById(R.id.brws);
        mkcall = (Button) findViewById(R.id.mkcall);
        econtact = (Button) findViewById(R.id.econtact);
        brow.setOnClickListener(this);
        mkcall.setOnClickListener(this);
        econtact.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.brws)
        {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
            startActivity(i);
        }
        else if(v.getId() == R.id.mkcall)
        {
            Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:1234567890"));
            startActivity(i);
        }
        else if(v.getId() == R.id.econtact)
        {
            Intent i = new Intent(Intent.ACTION_EDIT,Uri.parse("content://contacts/people/1"));
            startActivity(i);
        }

    }
}
