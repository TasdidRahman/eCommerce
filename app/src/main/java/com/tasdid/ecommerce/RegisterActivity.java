package com.tasdid.ecommerce;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.register_applogo)
    ImageView registerApplogo;
    @BindView(R.id.register_username_input)
    EditText registerUsernameInput;
    @BindView(R.id.register_phone_number_input)
    EditText registerPhoneNumberInput;
    @BindView(R.id.register_password_input)
    EditText registerPasswordInput;
    @BindView(R.id.register_btn)
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.register_btn)
    public void onViewClicked() {


    }
}
