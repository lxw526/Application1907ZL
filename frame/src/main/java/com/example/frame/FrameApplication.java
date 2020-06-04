package com.example.frame;

import android.content.Context;
import android.text.TextUtils;


import com.example.data.Device;
import com.example.data.LoginInfo;
import com.example.data.SpecialtyChooseEntity;
import com.example.utils.UtilsApplication;

public class FrameApplication extends UtilsApplication {
    private static FrameApplication application;
    private Device mDeviceInfo;
    private LoginInfo mLoginInfo;
    private String cookie;
    private  SpecialtyChooseEntity.DataBean selectedInfo;
    private Context applicationContext;

    public SpecialtyChooseEntity.DataBean getSelectedInfo() {
        return selectedInfo;
    }

    public void setSelectedInfo(SpecialtyChooseEntity.DataBean pSelectedInfo) {
        selectedInfo = pSelectedInfo;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public LoginInfo getLoginInfo() {
        return mLoginInfo;
    }

    public boolean isLogin(){
        return mLoginInfo != null && !TextUtils.isEmpty(mLoginInfo.getUid());
    }

    public void setLoginInfo(LoginInfo mLoginInfo) {
        this.mLoginInfo = mLoginInfo;
    }

    public Device getDeviceInfo() {
        return mDeviceInfo;
    }

    public void setDeviceInfo(Device mDeviceInfo) {
        this.mDeviceInfo = mDeviceInfo;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
    }

    public static FrameApplication getFrameApplication(){
        return application;
    }

    public static Context getFrameApplicationContext(){
        return application.getApplicationContext();
    }

    public Context getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(Context applicationContext) {
        this.applicationContext = applicationContext;
    }
}
