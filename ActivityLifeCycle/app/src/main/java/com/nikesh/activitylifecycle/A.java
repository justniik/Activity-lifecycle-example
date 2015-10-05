package com.nikesh.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class A extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        showMessage("onCreate Called");
        print("onCreate Called");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_a, menu);
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

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart Called");
        print("onStart Called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showMessage("onStop Called");
        print("onStop Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        showMessage("onRestart Called");
        print("onReStart Called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        showMessage("onPause Called");
        print("onPause Called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        showMessage("onResume Called");
        print("onResume Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showMessage("onDestory Called");
        print("onDestory Called");
    }

    public void showMessage(String message)
    {
        if(message !=null)
            Toast.makeText(A.this, "Actvity A :-"+message, Toast.LENGTH_LONG).show();
    }

    public void print(String message)
    {
        System.out.println("Actvity A :-"+message);
    }
}
