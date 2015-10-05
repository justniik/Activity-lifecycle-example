package com.nikesh.activitylifecycle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button btnA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMessage("onCreate Called");
        System.out.println("onCreate Called");

        btnA = (Button) findViewById(R.id.btnA);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,A.class);
                startActivity(intent);
            }
        });
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

            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Delete entry")
                    .setMessage("Are you sure you want to delete this entry?")
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })
                    .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // do nothing
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart Called");
        System.out.println("onStart Called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        showMessage("onStop Called");
        System.out.println("onStop Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        showMessage("onRestart Called");
        System.out.println("onReStart Called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        showMessage("onPause Called");
        System.out.println("onPause Called");
    }

    @Override
    protected void onResume() {
        super.onResume();

        showMessage("onResume Called");
        System.out.println("onResume Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showMessage("onDestory Called");
        System.out.println("onDestory Called");
    }

    public void showMessage(String message)
    {
        if(message !=null)
        Toast.makeText(MainActivity.this,message,Toast.LENGTH_LONG).show();
    }
}
