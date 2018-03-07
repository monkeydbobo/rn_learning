package com.getui.toastmodule;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

/**
 * Created by wanghaobo on 2018/3/6.
 */

public class ToastModule extends ReactContextBaseJavaModule {

    private static final String DURATION_SHORT_KEY="SHORT";
    private static final String DURATION_LONG_KEY="LONG";

    public ToastModule(ReactApplicationContext reactContext){
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ToastExample";
    }

    @Nullable
    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constant = new HashMap<>();
        constant.put(DURATION_SHORT_KEY,Toast.LENGTH_SHORT);
        constant.put(DURATION_LONG_KEY,Toast.LENGTH_LONG);
        return constant;
        /**/
    }

    @ReactMethod
    public void show(String message,int duration) {
        Toast.makeText(getReactApplicationContext(), message, duration).show();
    }

}
