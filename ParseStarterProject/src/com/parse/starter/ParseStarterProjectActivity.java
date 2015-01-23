package com.parse.starter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import android.util.Log;
import android.widget.Toast;

import com.parse.LogInCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseUser;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpenedInBackground(getIntent());

        final EditText login_username = (EditText)findViewById(R.id.login_username);
        final EditText login_password = (EditText)findViewById(R.id.login_password);
        CheckBox login_keep_logged_in = (CheckBox)findViewById(R.id.login_keep_logged_in);
        Button login_button = (Button)findViewById(R.id.login_button);
        Button login_sign_up = (Button)findViewById(R.id.login_sign_up);

        login_button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Get username and password
                        String username = login_username.getText().toString();
                        String password = login_password.getText().toString();
                        Log.v("Login Username", username);
                        Log.v("Login Password", password);

                        // Try to login as user
                        // Otherwise stay here and show error
                        ParseUser.logInInBackground(username, password, new LogInCallback() {
                            @Override
                            public void done(ParseUser user, ParseException e) {
                                if(user != null) {
                                    // User logged in successfully
                                    Toast.makeText(getApplicationContext(), "Congratulations on Logging In", Toast.LENGTH_LONG).show();
                                }
                                else {
                                    // User failed to login
                                    Toast.makeText(getApplicationContext(), "I'm sorry, but you have entered the wrong credentials", Toast.LENGTH_LONG).show();
                                }
                            }
                        });

                    }
                }
        );

        login_sign_up.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Send user to sign up activity
                        Intent intent = new Intent(this, SignUpActivity.class);
                        startActivity(intent);
                    }
                }
        );
	}
}
