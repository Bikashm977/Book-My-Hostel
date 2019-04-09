package com.bookmyhostel;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Toolbar toolbar;
    AppCompatEditText email, password;
    RelativeLayout relativeLayout;
    TextInputLayout userlayoutemail, userlayoutpassword;
    AppCompatButton btnLogin;
    AppCompatTextView createAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        toolbar =(Toolbar)findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        email = (AppCompatEditText)findViewById(R.id.email_EditText);
        userlayoutemail=(TextInputLayout)findViewById(R.id.email_textinputlayout);
        password = (AppCompatEditText)findViewById(R.id.password_EditText);
        userlayoutpassword=(TextInputLayout)findViewById(R.id.password_textinputlayout);

        btnLogin=(AppCompatButton)findViewById(R.id.btn_login);
        createAccount=(AppCompatTextView)findViewById(R.id.textView_createAccount);

        relativeLayout = (RelativeLayout)findViewById(R.id.login_activity);
        relativeLayout.setOnClickListener(null);

        email.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (email.getText().toString().isEmpty()){
                    userlayoutemail.setErrorEnabled(true);
                    userlayoutemail.setError("Plese enter your Email !");
                }else {
                    userlayoutemail.setErrorEnabled(false);
                }
            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (email.getText().toString().isEmpty()){
                    userlayoutemail.setErrorEnabled(true);
                    userlayoutemail.setError("Plese enter your Email !");
                }else {
                    userlayoutemail.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "You are Logged In", Toast.LENGTH_SHORT).show();
            }
        });

        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeintent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(homeintent);
                finish();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
