package com.example.bazookastwitter.displayTweet;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;

public interface TweetViewModelInterface {
    @NonNull
    String getHeaderText();
    void setHeaderText(@NonNull final String headerText);
    @NonNull
    String getBodyText();
    void setBodyText(@NonNull final String bodyText);
    @NonNull
    String getDateText();
    void setDateText(@NonNull final String dateText);

    public Bitmap getImg(); // TODO kinda optional no? maybe make a second interface?
    public void setImg(@NonNull String imgUrl);
}
