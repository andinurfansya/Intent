package com.example.intent;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import static com.example.intent.R.id.email_login_form;


public class LoginActivity extends AppCompatActivity {
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private Button mLogin,mKembali;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_login);

        mKembali=(Button)findViewById(R.id.btn_back);
        mLogin=(Button)findViewById(R.id.email_sign_in_button);
        mLogin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"belum ada isi",Toast.LENGTH_LONG).show();
            }
        });
        mKembali.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iKembali = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(iKembali);
                finish();
            }
        });
    }


}
