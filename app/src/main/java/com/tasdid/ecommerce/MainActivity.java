package com.tasdid.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.app_logo)
    ImageView appLogo;
    @BindView(R.id.app_slogan)
    TextView appSlogan;

    @BindView(R.id.main_join_now_btn)
    Button mainJoinNowBtn;
    @BindView(R.id.main_login_now_btn)
    Button mainLoginNowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.main_login_now_btn)
    public void onLoginClicked() {

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.main_join_now_btn)
    public void onJoinClicked() {

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}
