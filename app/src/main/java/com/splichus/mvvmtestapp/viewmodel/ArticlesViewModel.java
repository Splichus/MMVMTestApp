package com.splichus.mvvmtestapp.viewmodel;

import com.splichus.mvvmtestapp.model.Article;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ArticlesViewModel extends ViewModel {

    private MutableLiveData<List<Article>> articles;

    public LiveData<List<Article>> getArticles() {
        return articles;
    }

}
