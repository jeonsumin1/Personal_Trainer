package com.example.Personal_Trainer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;



public class NoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
    }

    // 이전 화면 (설정 페이지)
//    public void noticeBtn(View view){
//        Intent intent=new Intent(getApplicationContext(), MypageActivity.class);
//        startActivityForResult(intent, 0);
//    }
}
