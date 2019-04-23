package com.bookmyhostel;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class RegisterActivity extends AppCompatActivity {
    private Toolbar toolbar;
    AppCompatEditText name,emailaddress,password,mobile,address;
    TextInputLayout namelayout,emaillayout,passwordlayout,mobilelayout,addresslayout;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        toolbar =(Toolbar)findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        name=(AppCompatEditText)findViewById(R.id.Name_EditText);
        emailaddress=(AppCompatEditText)findViewById(R.id.Email_EditText);
        password=(AppCompatEditText)findViewById(R.id.password_EditText);
        mobile=(AppCompatEditText)findViewById(R.id.Mobile_EditText);
        address=(AppCompatEditText)findViewById(R.id.Address_EditText);

        namelayout=(TextInputLayout)findViewById(R.id.name_textinputlayout);
        emaillayout=(TextInputLayout)findViewById(R.id.email_textinputlayout);
        passwordlayout=(TextInputLayout)findViewById(R.id.password_textinputlayout);
        mobilelayout=(TextInputLayout)findViewById(R.id.mobile_textinputlayout);
        addresslayout=(TextInputLayout)findViewById(R.id.address_textinputlayout);

        relativeLayout = (RelativeLayout)findViewById(R.id.Register_Activity);
        relativeLayout.setOnClickListener(null);

//        name.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (name.getText().toString().isEmpty()){
//                    namelayout.setErrorEnabled(true);
//                    namelayout.setError("Plese enter your Name !");
//                }else {
//                    namelayout.setErrorEnabled(false);
//                }
//            }
//        });
//
//        name.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (name.getText().toString().isEmpty()){
//                    namelayout.setErrorEnabled(true);
//                    namelayout.setError("Plese enter your Name !");
//                }else {
//                    namelayout.setErrorEnabled(false);
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//
//        mobile.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (mobile.getText().toString().isEmpty()){
//                    mobilelayout.setErrorEnabled(true);
//                    mobilelayout.setError("Plese enter your Mobile No !");
//                }else {
//                    mobilelayout.setErrorEnabled(false);
//                }
//            }
//        });
//
//        mobile.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (mobile.getText().toString().isEmpty()){
//                    mobilelayout.setErrorEnabled(true);
//                    mobilelayout.setError("Plese enter your Mobile No !");
//                }else {
//                    mobilelayout.setErrorEnabled(false);
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });
//
//        address.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View v, boolean hasFocus) {
//                if (address.getText().toString().isEmpty()){
//                    addresslayout.setErrorEnabled(true);
//                    addresslayout.setError("Plese enter your Address !");
//                }else {
//                    addresslayout.setErrorEnabled(false);
//                }
//            }
//        });
//
//        address.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (address.getText().toString().isEmpty()){
//                    addresslayout.setErrorEnabled(true);
//                    addresslayout.setError("Plese enter your Address !");
//                }else {
//                    addresslayout.setErrorEnabled(false);
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//        });

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==android.R.id.home){
            Intent homeintent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(homeintent);
        }
        return super.onOptionsItemSelected(item);
    }
}
