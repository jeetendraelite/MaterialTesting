package com.example.jeetendraachtani.materialtesting;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SnackBar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Snackbar snackbar = Snackbar
                .make(findViewById(android.R.id.content), "Welcome to Elite InfoWorld", Snackbar.LENGTH_LONG)
                .setAction("Retry", new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Toast.makeText(SnackBar.this, "Yes SnackBar is Clicked", Toast.LENGTH_SHORT).show();
                    }
                });

        snackbar.show();
    }
}
