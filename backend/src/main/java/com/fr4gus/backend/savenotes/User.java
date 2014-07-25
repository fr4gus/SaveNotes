package com.fr4gus.backend.savenotes;

/**
 * Created by fr4gus on 7/24/14.
 */
public class User {
    private Long mId;
    private String mDeviceId;

    public Long getId() {
        return mId;
    }

    public void setId(Long mid) {
        this.mId = mid;
    }

    public String getDeviceId() {
        return mDeviceId;
    }

    public void setDeviceId(String deviceId) {
        mDeviceId = deviceId;
    }
}
