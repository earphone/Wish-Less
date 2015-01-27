package com.parse.starter;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.view.View;


public class SignUpActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText signup_username = (EditText)findViewById(R.id.signup_username);
        EditText signup_email = (EditText)findViewById(R.id.signup_email);
        EditText signup_password = (EditText)findViewById(R.id.signup_password);
        EditText signup_password_again = (EditText)findViewById(R.id.signup_password_again);
        Button signup_button = (Button)findViewById(R.id.signup_button);
        Button signup_return_to_login = (Button)findViewById(R.id.signup_return_to_login);


        signup_return_to_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Send user to sign up activity
                        Intent intent = new Intent(getBaseContext(), ParseStarterProjectActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sign_up, menu);
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
}
