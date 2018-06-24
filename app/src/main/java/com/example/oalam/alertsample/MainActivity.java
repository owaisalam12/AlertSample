package com.example.oalam.alertsample;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder=new AlertDialog.Builder(this);
        // Set the dialog title.
        myAlertBuilder.setTitle("Alert");
        // Set the dialog message.
        myAlertBuilder.setMessage("Click OK to continue, or Cancel to stop:");
        // Add the buttons.
        myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // User clicked OK button.
                Toast.makeText(MainActivity.this, "Pressed OK!", Toast.LENGTH_SHORT).show();
            }
        });
        myAlertBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // User cancelled the dialog.
                Toast.makeText(MainActivity.this, "Pressed Cancel", Toast.LENGTH_SHORT).show();
            }
        });
        //to prevent alert from closing when tap anywhere
        myAlertBuilder.setCancelable(false);
        // Create and show the AlertDialog.
        myAlertBuilder.show();
    }
}
