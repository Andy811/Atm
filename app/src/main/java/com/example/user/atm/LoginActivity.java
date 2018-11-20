package com.example.user.atm;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      EditText  edUserid = findViewById(R.id.ed_userid);
    String uid = getSharedPreferences("ATM",MODE_PRIVATE).getString("USERID","");
    edUserid.setText(uid);
    }
    public void login (View v) {
        EditText  edUserid = findViewById(R.id.ed_userid);
        EditText   edPasswd = findViewById(R.id.ed_password);
        String uid = edUserid.getText().toString();
        String pw = edPasswd.getText().toString();
        if (uid.equals("Andy") && pw.equals("666")) { //登入成功
            Toast.makeText(this, "登入成功", Toast.LENGTH_LONG).show();
            getIntent().putExtra("LOGIN_USERID", uid);
            getIntent().putExtra("LOGIN_PASSWD", pw);
            setResult(RESULT_OK, getIntent());
Intent toNickName = new Intent(this,NicknameActivity.class);
            startActivity(toNickName);
       getSharedPreferences("ATM",MODE_PRIVATE)
               .edit()
               .putString("USERID",uid)
               .apply();
            finish();
        } else { //登入失敗
            new AlertDialog.Builder(this)
                    .setTitle("Atm")
                    .setMessage("登入失敗")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }


}

