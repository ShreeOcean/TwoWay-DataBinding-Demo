package com.ocean.twowaydatabinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TwoWayViewModel extends ViewModel {

    public MutableLiveData<String> word =new MutableLiveData<>();

    public TwoWayViewModel() {
        word =new MutableLiveData<String>("DataBinding");
    }
}
