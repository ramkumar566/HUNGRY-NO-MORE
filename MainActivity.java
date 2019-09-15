package com.example.hackthonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private EditText name,mail,number;
    private Button submit;
    DatabaseReference databaseReference;
    private Object MapsActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        name = (EditText) findViewById(R.id.name);
        mail = (EditText) findViewById (R.id.mail);
        number = (EditText) findViewById (R.id.number);
        submit = (Button) findViewById (R.id.submit);
        databaseReference = FirebaseDatabase.getInstance().getReference("details");
        submit.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View view) {
                addDetails();
            }
        } );
    }
    public void addDetails() {
        String username = name.getText().toString();
        String usermail = mail.getText().toString();
        String usernumber = number.getText().toString();
        if(!TextUtils.isEmpty(username) && !TextUtils.isEmpty(usermail)&&!TextUtils.isEmpty(usernumber)) {
            String id = databaseReference.push().getKey();
            Login login = new Login ( username, usermail, usernumber, id );
            databaseReference.child(id).setValue(login);
            name.setText("");
            mail.setText("");
            Intent intent = new Intent(this,MapsActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText (MainActivity.this,"please enter valid data",Toast.LENGTH_LONG).show();
        }
    }
}
