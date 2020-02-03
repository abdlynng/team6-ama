package com.example.suivi_eleve.ui.Photos_Evenements;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PhotoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PhotoViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("Photos");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
