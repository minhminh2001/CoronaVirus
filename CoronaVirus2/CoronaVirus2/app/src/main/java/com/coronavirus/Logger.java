package com.coronavirus;

import android.util.Log;

import static com.coronavirus.AppConstants.IS_LOGGABLE;

public final class Logger {

    private Logger() {
    }

    public static void v(String content) {
        if (Log.isLoggable(AppConstants.LOG_PREFIX, Log.VERBOSE)) {
            Log.v(AppConstants.LOG_PREFIX, content == null ? "null" : content);
        }
    }

    public static void i(String tag, String content) {
        if (Log.isLoggable(tag, Log.INFO)) {
            Log.i(tag, content == null ? "null" : content);
        }
    }

    public static void v(String tag, String content) {
        if (Log.isLoggable(tag, Log.VERBOSE)) {
            Log.v(tag, content == null ? "null" : content);
        }
    }

    public static void w(String tag, String content) {
        if (Log.isLoggable(tag, Log.WARN)) {
            Log.w(tag, content == null ? "null" : content);
        }
    }

    public static void d(Object object, String content) {
        if (IS_LOGGABLE) {
            Log.d(AppConstants.LOG_PREFIX + object.getClass().getSimpleName(), content == null
                    ? "null" : content);
        }
    }

    public static void logE(Object object, String content) {
        if (IS_LOGGABLE) {
            Log.e(AppConstants.LOG_PREFIX + object.getClass().getSimpleName(), content == null
                    ? "null" : content);
        }
    }

    public static void d(String tag, String content) {
        if (IS_LOGGABLE) {
            Log.d(AppConstants.LOG_PREFIX + tag, content == null ? "null" : content);
        }
    }

    public static void e(String tag, String content) {
        if (Log.isLoggable(tag, Log.ERROR)) {
            Log.e(tag, content == null ? "null" : content);
        }
    }
}
