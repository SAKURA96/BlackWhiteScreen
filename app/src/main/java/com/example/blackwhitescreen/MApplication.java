package com.example.blackwhitescreen;

import android.app.Application;

public class MApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//        //代码初始化
//        try {
//            //休眠3秒钟
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //初始化 网络框架访问 懒加载
        new Thread() {
            //将初始化的代码全部丢到线程中
            //初始化数据库，sdk等
        };
    }
}
