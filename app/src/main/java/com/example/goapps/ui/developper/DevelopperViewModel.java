package com.example.goapps.ui.developper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DevelopperViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DevelopperViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is developper fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}