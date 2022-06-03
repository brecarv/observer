public class UserBrazil implements TwitterObserver{
    @Override
    public void update(Tweet tweet) {
        System.out.println("Um novo tweet foi postado por " + tweet.getUser() + " : " + tweet.getContent());
    }
}
