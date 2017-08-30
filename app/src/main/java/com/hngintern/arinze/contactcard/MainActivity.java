package com.hngintern.arinze.contactcard;

import android.media.Image;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView git,slack,mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView bio = (TextView) findViewById(R.id.bio);
        bio.setMovementMethod(new ScrollingMovementMethod());
        mail = (ImageView)findViewById(R.id.mail);
        git = (ImageView)findViewById(R.id.git);
        slack = (ImageView)findViewById(R.id.slack);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMarkerDetails("");

            }
        });
    }

    public void showMarkerDetails(String Title) {
        FragmentManager fm = getSupportFragmentManager();
        EmailFragment emailFragment = EmailFragment.newInstance(Title);
        emailFragment.show(fm, "fragment_edit_name");

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
}
