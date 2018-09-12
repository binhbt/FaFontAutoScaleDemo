package com.androiddeft.recyclerviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.androiddeft.recyclerviewdemo.font.FontHelper;
import com.vn.fa.font.FontAutoScale;
import com.vn.fa.font.FontManager;

public class TestActivity extends AppCompatActivity {
    @FontAutoScale
    public TextView tvGreeting1;
    @FontAutoScale
    public TextView tvGreeting2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        tvGreeting1 = (TextView) findViewById(R.id.tv_greeting1);
        tvGreeting2 = (TextView) findViewById(R.id.tv_greeting2);
        FontManager.bind(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.font_small:
                FontHelper.scaleFont(TestActivity.this, 0);
                break;
            case R.id.font_big:
                FontHelper.scaleFont(TestActivity.this, 1);

                break;
            case R.id.font_huge:
                FontHelper.scaleFont(TestActivity.this, 2);
                break;
        }
        FontManager.bind(this);
        return super.onOptionsItemSelected(item);
    }
}
