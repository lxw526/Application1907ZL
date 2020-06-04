package com.example.application1907zl.view.activity;


import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.application1907zl.R;
import com.example.application1907zl.base.BaseMvpActivity;
import com.example.application1907zl.model.CommonHomeModel;


public class HomeActivity extends BaseMvpActivity<CommonHomeModel> {

    public NavController mProjectController;

    @Override
    public CommonHomeModel setModel() {
        return null;
    }

    @Override
    public int setLayoutId() {
        return R.layout.activity_home;
    }

    @Override
    public void setUpView() {
        mProjectController = Navigation.findNavController(this, R.id.project_fragment_control);
    }

    @Override
    public void setUpData() {

    }

    @Override
    public void netSuccess(int whichApi, Object[] pD) {

    }
}
