package com.splichus.mvvmtestapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.splichus.mvvmtestapp.BuildConfig;
import com.splichus.mvvmtestapp.R;
import com.splichus.mvvmtestapp.adapter.ArticleAdapter;
import com.splichus.mvvmtestapp.model.Article;

public class MainActivity extends AppCompatActivity implements ArticleAdapter.ListClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onListClicked(Article article) {

    }
}
