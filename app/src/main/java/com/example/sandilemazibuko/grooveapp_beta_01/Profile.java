package com.example.sandilemazibuko.grooveapp_beta_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    //LocalStorage userDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);




        LocalStorage userDatabase = new LocalStorage(this);


        String first_name = userDatabase.sharedPreferences.getString("user_name","N/A");
        String last_name = userDatabase.sharedPreferences.getString("user_surname","N/A");
        String email = userDatabase.sharedPreferences.getString("user_email","N/A");
        String dob = userDatabase.sharedPreferences.getString("user_dob","N/A");
        String membership_type = userDatabase.sharedPreferences.getString("user_name","N/A");

        String full_names = first_name + " " + last_name;


        TextView txtfullnames = (TextView) findViewById(R.id.txtfullnames);
        TextView txtemail = (TextView) findViewById(R.id.txtemail);
        TextView txtdob = (TextView) findViewById(R.id.txtdob);
        TextView txtmembertype = (TextView) findViewById(R.id.txttype);

        txtfullnames.setText(full_names);
        txtemail.setText(email);
        txtdob.setText(dob);
        txtmembertype.setText(membership_type);

        /**
         * go to map fragment
         * */
        Button goToMap = (Button) findViewById(R.id.btnMap);
        goToMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, MapsActivity.class);
                startActivity(intent);
            }
        });

    }
}
