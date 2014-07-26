package com.fr4gus.android.savenotes;

import android.content.Context;
import android.provider.Settings;

/**
 * Created by fr4gus on 7/25/14.
 */
public class DeviceUtil {
    public static String getDeviceId(Context context) {
        return Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ANDROID_ID);
    }
}
