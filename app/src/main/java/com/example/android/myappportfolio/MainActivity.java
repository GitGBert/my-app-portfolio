package com.example.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    public void goToSpotify (View v){
        Log.i(TAG, "the SPOTIFY button pushed");
        Toast toastSpotify = Toast.makeText(getApplicationContext(), "SPOTIFY SELECTED", Toast.LENGTH_LONG);
        toastSpotify.show();
    }

    public void goToScores (View v){
        Log.i(TAG,"the SCORES button pushed");
        Toast toastScores = Toast.makeText(getApplicationContext(), "SCORES SELECTED", Toast.LENGTH_LONG);
        toastScores.show();
    }

    public void goToLibrary (View v){
        Log.i(TAG,"the LIBRARY button pushed");
        Toast toastLibrary = Toast.makeText(getApplicationContext(), "LIBRARY SELECTED", Toast.LENGTH_LONG);
        toastLibrary.show();
    }

    public void goToBuildIt (View v){
        Log.i(TAG,"the BUILD IT BIG button pushed");
        Toast toastBuildItBig = Toast.makeText(getApplicationContext(), "BUILD IT SELECTED", Toast.LENGTH_LONG);
        toastBuildItBig.show();
    }

    public void goToXYZReader (View v){
        Log.i(TAG,"the XYZ READER button pushed");
        Toast toastXYZReader = Toast.makeText(getApplicationContext(), "XYZ READER SELECTED", Toast.LENGTH_LONG);
        toastXYZReader.show();
    }

    public void goToCapstone (View v){
        Log.i(TAG,"the CAPTSONE button pushed");
        Toast toastCapstone = Toast.makeText(getApplicationContext(), "CAPSTONE SELECTED", Toast.LENGTH_LONG);
        toastCapstone.show();
    }

}
