package com.akilisoft.tech.demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.akilisoft.tech.demo.util.TableSQLiteController;

import java.util.Map;

public class LoginActivity extends Activity {
    private Button b1,b2;
    private EditText ed1,ed2;

    private TextView tx1;
    private int counter = 3;
    private TableSQLiteController tableSQLiteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tableSQLiteController = new TableSQLiteController(this);
        b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);

        b2 = (Button)findViewById(R.id.button2);
        tx1 = (TextView)findViewById(R.id.textView3);
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //login(ed1.getText().toString(),ed2.getText().toString());

                if(ed1.getText().toString().equals("admin") &&
                        ed2.getText().toString().equals("admin")) {
                    //Toast.makeText(getApplicationContext(),"Redirecting...",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getBaseContext(), MainActivity.class));
                }else{
                    Toast.makeText(getApplicationContext(), "Indentifiants invalides",Toast.LENGTH_SHORT).show();
                    //insertUser("test","test","78232322","M","test","test",  "test","test","burkina");

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void login(String email,String password)
    {
        boolean isAuth = tableSQLiteController.auth(email,password);
        if(isAuth){

            Intent i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        }else {
            final AlertDialog.Builder alertDialog = new AlertDialog.Builder(LoginActivity.this);
            alertDialog.setTitle("Note d'information");
            alertDialog.setMessage("Donneés incorrect");

            alertDialog.setPositiveButton("OK",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int whichButton)
                {
                    //finish();
                }});
            alertDialog.create();
            alertDialog.show();
        }

    }

    public void insertUser(String nom,String prenom,String phone,String sexe,String email,String password, String role,String country,String city)
    {

        if(!(email.isEmpty()  || password.isEmpty() || role.isEmpty())){

            try {

                tableSQLiteController.userCreate(nom,prenom,phone,sexe,email,password,role,country,city,"");
                Toast.makeText(getApplicationContext(), "user created",Toast.LENGTH_SHORT).show();

            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            Toast.makeText(getApplicationContext(), "user not created",Toast.LENGTH_SHORT).show();
            //requireMessage();
        }


    }

}
