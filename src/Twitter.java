import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private final List<TwitterObserver> followers;
    private final List<Tweet> tweets;

    public Twitter() {
        this.followers = new ArrayList<>();
        this.tweets = new ArrayList<>();
    }

    public void addFollower(TwitterObserver follower){
        followers.add(follower);
    }

    public void removeFollower(TwitterObserver follower){
        followers.remove(follower);
    }

    public void tweetPosted(Tweet tweet){
        tweets.add(tweet);
        System.out.println(tweet.getUser() + ": " + tweet.getContent());
        notifyFollowers();
    }

    private void notifyFollowers(){
        for(var follower : followers) {
            follower.update(tweets.get(tweets.size()-1));
        }
    }

}
