package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               TextView text = findViewById(R.id.te);
                EditText name = findViewById(R.id.username);
                EditText pwd = findViewById(R.id.pwd);
                String names = name.getText().toString();
                String pwds = pwd.getText().toString();
                if (names.equals("zhangsan")&& pwds.equals("1234")){
                    text.setText("登录成功");
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    startActivity(intent);
                }else{
                    text.setText("登录失败");
                    Toast tas =  Toast.makeText(MainActivity.this,"你是猪吗",Toast.LENGTH_SHORT);
                    tas.show();
                }


            }
        });

    }
    public void  test(View view){
        Toast.makeText(MainActivity.this,R.string.msd,Toast.LENGTH_SHORT).show();

    }

}


