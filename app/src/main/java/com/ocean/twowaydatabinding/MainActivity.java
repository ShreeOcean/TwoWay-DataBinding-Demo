package com.ocean.twowaydatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.ocean.twowaydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    TwoWayViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        viewModel =new ViewModelProvider(this).get(TwoWayViewModel.class);

        binding.setTwoWayDataBinding(viewModel);
        binding.setLifecycleOwner(this);
    }
}