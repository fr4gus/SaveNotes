package com.fr4gus.backend.savenotes;

import java.util.Date;

/**
 * Created by fr4gus on 7/24/14.
 */
public class Note {

    private Long mId;
    private String mContent;
    private Long mUserId;
    private Date mDate;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public Long getUserId() {
        return mUserId;
    }

    public void setUserId(Long userId) {
        mUserId = userId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
