package com.example.user.atm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
    }

    public void next(View view) {
        EditText edNickname = findViewById(R.id.ed_nickname);
        String nickname = edNickname.getText().toString();
        user.setNickname(nickname);
        Intent age = new Intent(this, AgeActivity.class);
        startActivity(age);
    }
}
