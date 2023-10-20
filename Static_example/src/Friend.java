import java.util.Stack;

public class Friend
{
    String name;
    static int numberOfFriends;
    Friend(String name)
    {
        numberOfFriends+=1;
        this.name=name;
    }

    static void display_friends()
    {
        System.out.println("you have "+numberOfFriends+" Friends");
    }
}
