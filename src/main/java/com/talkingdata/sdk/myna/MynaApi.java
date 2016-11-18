package com.talkingdata.sdk.myna;

import android.content.Context;

public class MynaApi {

    /**
     * Indicator to use implementation from TalkingData
     */
    public static int  TALKINGDATA= 1;

    /**
     * Indicator to use implementation from Google Awareness API
     */
    public static int GOOGLE = 2;

    /**
     * Initialize Myna
     * @param context Application context
     * @param initCallback Callback to handle the result of initialization
     * @param mode Indicator of user choice of implementation.
     *             Available values:
     *             <code>TALKINGDATA</code>,
     *             <code>GOOGLE</code>
     */
    public static void init(Context context, MynaInitCallback initCallback, MynaResultCallback resultCallback, int mode){
        MynaHelper.init(context, initCallback, resultCallback, mode);
    }

    /**
     * Stop all background tasks
     */
    public static void stop(){
        MynaHelper.stop();
    }

    /**
     * Start to recognize
     */
    public static void start(){
        MynaHelper.start();
    }

    /**
     * Get the status of Myna initialization
     */
    public static boolean isInitialized(){
        return MynaHelper.isInitialized();
    }

//    /**
//     * Add a new recognition configuration to be executed later
//     */
//    public static void addConfig(RecognizerConfig config){
//        myBinder.addRecognizerConfig(config);
//    }

//    /**
//     * Clean Myna env
//     */
//    public static void cleanUp(Context ctx){
//        stop();
//        myBinder.cleanUp();
//        ctx.unbindService(connection);
//    }
//    /**
//     * Remove a new recognition configuration to be executed later
//     */
//    public static void removeConfig(int configId){
//        myBinder.removeRecognizerConfig(configId);
//    }



}
