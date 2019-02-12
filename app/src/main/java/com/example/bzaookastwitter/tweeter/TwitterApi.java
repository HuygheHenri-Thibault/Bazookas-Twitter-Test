package com.example.bzaookastwitter.tweeter;

import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterApi implements Tweeter {
    private Twitter twitter;

    public TwitterApi() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("consumer key")
                .setOAuthConsumerSecret("consumer secret")
                .setOAuthAccessToken("access token")
                .setOAuthAccessTokenSecret("access token secret");
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();
    }

    @Override
    public List<Status> getTweetsFromUser(String user) {
        List<Status> statuses = null;
        try {
            statuses = twitter.getUserTimeline(user);
            
        } catch (TwitterException ex) {
            ex.printStackTrace();
            System.out.println("Failed to get @" + user + "'s tweets");
        }
        return statuses;
    }

    @Override
    public List<Status> getTweetsWithHashtag(String hashtag) {
        return null;
    }
}
