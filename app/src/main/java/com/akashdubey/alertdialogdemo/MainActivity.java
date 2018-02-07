package com.akashdubey.alertdialogdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show=(Button)findViewById(R.id.launchBtn);
        final AlertDialog.Builder builder= new AlertDialog.Builder(this);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                builder.setTitle("Confirm Delete")
                        .setIcon(R.drawable.delete)
                        .setMessage("Are you sure you want to delete this ?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                Toast.makeText(MainActivity.this, "You clicked YES", Toast.LENGTH_LONG).show();
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this, "You clicked NO", Toast.LENGTH_LONG).show();
                                dialogInterface.dismiss();
                            }
                        });
                builder.create();
                builder.show();
            }
        });
    }
}
