public class UserUSA implements TwitterObserver{
    @Override
    public void update(Tweet tweet) {
        System.out.println("A new tweet has been posted by " + tweet.getUser() + " : " + tweet.getContent());
    }
}
