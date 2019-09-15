package com.example.hackthonproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Activity2 extends AppCompatActivity {
    EditText name,phonenum;
    private static final int REQUEST_CALL = 1;
    String phonenumbers[] = {"1234656789","3637647864","2637915698","7624561895","3786427191","4281675234","4875178365","7142986518","6739347561","7677625112"};
    String trustnames[] = {"Kota Educational trust","Dayamayyi Venkayamma Educational trust","Jeevana Jyothi Educational Trust","TrendSetters Charitable trust","Krupa Sadhana trust","Missionaries of charity","Vizag Smiles","Bhagavatula Charitable trust","SOS Clidrens trust","mylabathula charitable trust"};
    Random r = new Random();
    Button b;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_2 );
        name = (EditText) findViewById (R.id.Trustname);
        phonenum = (EditText) findViewById (R.id.phone);
        int x = r.nextInt(10);
        name.setText(trustnames[x]);
        phonenum.setText(phonenumbers[x]);
        b = (Button) findViewById(R.id.btn);
        ImageView imgCall = findViewById (R.id.img_call);
        b.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                MainActivity m;
                Intent intent = new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
            }
        } );
        imgCall.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                makeCall();
            }
        } );
    }
    public void makeCall() {
        String number = name.getText().toString();
        if(number.trim().length()>0) {
            if(ContextCompat.checkSelfPermission(Activity2.this, Manifest.permission.CALL_PHONE )!= PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions ( Activity2.this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL );
            }
            else {
                String dial = "tel:"+number;
                startActivity(new Intent ( Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
        else {
            Toast.makeText (Activity2.this,"You have edited text",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
       if(requestCode==REQUEST_CALL) {
           if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED) {
               makeCall ();
           }
           else {
               Toast.makeText ( this, "PermissionDenied!!!", Toast.LENGTH_SHORT ).show ( );
           }
       }
    }
}
