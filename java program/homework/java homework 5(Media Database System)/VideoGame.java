public class VideoGame extends Item
{
    private String platform;
    private int numberOfPlayers;

    /**
     * Constructor for objects of class VideoGame
     */
    public VideoGame(String title, int playingTime, String platform, int numberOfPlayers)
    {
        super(title, playingTime);
        this.platform = platform;
        this.numberOfPlayers = numberOfPlayers;
    }
    
    @Override
    public void print()
    {
        System.out.println("VideoGame");
        System.out.println("Title: " + getTitle());
        if(getOwn()) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + getPlayingTime());
        System.out.println("Comment: " + getComment());
        System.out.println("Platform: " + platform);
        System.out.println("No. of players: " + numberOfPlayers);
    }
}