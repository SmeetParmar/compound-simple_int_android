package com.au.option;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText noy,rai,pa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        noy=findViewById(R.id.noy);
        rai=findViewById(R.id.rai);
        pa=findViewById(R.id.pa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu,menu);
       return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        double p=Double.parseDouble(pa.getText().toString());
        double n=Double.parseDouble(noy.getText().toString());
        double r=Double.parseDouble(rai.getText().toString());
        double ci=p* Math.pow(1+(r/100),n)-p;
        double si=p*r*n;
        switch (item.getItemId())
        {
            case R.id.comi:
                Toast.makeText(this, "Answer = "+ci, Toast.LENGTH_LONG).show();
                break;

            case R.id.simi:
                Toast.makeText(this, "Answer = "+si, Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}