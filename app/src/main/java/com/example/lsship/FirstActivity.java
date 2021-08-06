package com.example.lsship;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    //Menu菜单的使用
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return  true;
        //return super.onCreateOptionsMenu(menu);
    }

    //定义菜单响应事件
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
            Toast.makeText(this, "你点击了添加",
                    Toast.LENGTH_SHORT).show();
            break;
            case R.id.remove_item:
                Toast.makeText(this, "你点击了移除",
                        Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
        //return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast的使用
        Button button4 = (Button) findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(FirstActivity.this, "注意身体",
                        Toast.LENGTH_SHORT).show();
                //finish();   //销毁当前活动
            }
        });

        //intent的用法
        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //显式intent
                //Intent intent = new Intent(FirstActivity.this,
                        //SecondActivity.class);
                //隐式intent
                Intent intent = new Intent("com.example.lsship.ACTION START");
                intent.addCategory("com.example.lsship.MY CATEGORY");
                startActivity(intent);
            }
        });

        //intent的用法
        Button button5 = (Button) findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //打开网页
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://cdnjson.com/images/2021/08/04/39ada99629ae737b7.png"));
                startActivity(intent);
            }
        });
    }

}


