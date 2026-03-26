
/**
 * Name: Au Sai Chun
 * Student ID: 21105253D
 */
public class VideoGame
{
    // instance variables - replace the example below with your own
    private String title;
    private boolean gotIt;
    private int playingTime;
    private String comment;
    private String platform;
    private int numberOfPlayers;
    private String own;

    /**
     * Constructor for objects of class VideoGame
     */
    public VideoGame(String a, int b,String c,int d)
    {
        title=a;
        gotIt=false;
        playingTime=b;
        comment="<no comment>";
        platform=c;
        numberOfPlayers=d;
    }
    public void setComment(String a)
    {
        comment=a;
    }
    public String getComment()
    {
        return comment;
    }
    public void setOwn(boolean a)
    {
        gotIt=a;
    }
    public String getOwn()
    {
        if(gotIt)
        {
            own="Yes";
        }
        else
        {
            own="No";
        }
        return own;
    }
    public void print()
    {
        System.out.println("VideoGame");
        System.out.println("Title: "+title);
        System.out.println("Got it: "+getOwn());
        System.out.println("Playing Time: "+playingTime);
        System.out.println("Comment: "+getComment());
        System.out.println("Platform: "+platform);
        System.out.println("No. of players: "+numberOfPlayers);
        
    }
}
