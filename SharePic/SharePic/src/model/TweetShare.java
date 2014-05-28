package model;

import java.io.IOException;
import java.net.URL;
 
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
 
public class TweetShare {
 
       public static void main(String[] args) throws IOException, TwitterException {
 
              String consumerKey = "RD9aFCD3tKkzE7Qj5m3Vw";
              String consumerSecret = "Aj56Zlx8VNExDouKUy1FOXJukUYE1EgSgv3dplyxXQ";
              String accessToken = "2306781511-dNzi02YkteE2N8oYc0fQfVnvh9ZjIFTH4wmojgl";
              String accessTokenSecret = "maBB4gJPriG4zIJ8zpsidhXdwjDGG6a65NBmbNHCgy5dD";
 
              TwitterFactory twitterFactory = new TwitterFactory();
              Twitter twitter = twitterFactory.getInstance();
              twitter.setOAuthConsumer(consumerKey, consumerSecret);
              twitter.setOAuthAccessToken(new AccessToken(accessToken,accessTokenSecret));
 
              // tweet message
              StatusUpdate statusUpdate = new StatusUpdate("HighTail - the next big thing in file sharing");
              // attach image
              statusUpdate.setMedia("hightail rocks", new URL("http://127.0.0.1/tmp").openStream());
 
              // send tweet
              Status status = twitter.updateStatus(statusUpdate);
 
              // response from twitter server
              System.out.println("status.toString() = " + status.toString());
       }
 
}