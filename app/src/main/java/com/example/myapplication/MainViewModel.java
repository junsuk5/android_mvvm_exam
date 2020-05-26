package com.example.myapplication;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private int count;

    public MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public void increase() {
        count++;
        countLiveData.setValue(count);
    }

    public void decrease() {
        count--;
        countLiveData.setValue(count);
    }
}
