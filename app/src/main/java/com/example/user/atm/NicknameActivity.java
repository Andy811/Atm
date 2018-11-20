package com.example.user.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
    }
    public void next(View view){
        EditText nickname = findViewById(R.id.ed_nick);
        String nick = nickname.getText().toString();
        getSharedPreferences("user",MODE_PRIVATE)
                .edit()
                .putString("NICKNAME",nick)
                .apply();
        Intent age = new Intent(this,AgeActivity.class);
        startActivity(age);
    }


}
