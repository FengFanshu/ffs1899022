package com.example.a20200927.util;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import androidx.annotation.RequiresApi;

public class DisplayUtil {
    //获取屏幕宽度
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public static int getScreenWidth(Context ctx){
        WindowManager wm=(WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm=new DisplayMetrics();
        wm.getDefaultDisplay().getRealMetrics(dm);
        return dm.widthPixels;
    }

    //获取屏幕高度
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public static int getScreenHeight(Context ctx){
        WindowManager wm=(WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm=new DisplayMetrics();
        wm.getDefaultDisplay().getRealMetrics(dm);
        return dm.heightPixels;
    }

    //获取屏幕密度
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public static float getScreenDensity(Context ctx){
        WindowManager wm=(WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm=new DisplayMetrics();
        wm.getDefaultDisplay().getRealMetrics(dm);
        return dm.density;
    }
}
