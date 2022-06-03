public class App {
    public static void main(String[] args) {
        var twitter = new Twitter();
        twitter.addFollower(new UserBrazil());
        twitter.addFollower(new UserUSA());

        var tweet = new Tweet("Elon Musk", "Hello World!");
        var tweetA = new Tweet("Elon Musk", "Well...");

        twitter.tweetPosted(tweet);
        twitter.tweetPosted(tweetA);
    }
}
