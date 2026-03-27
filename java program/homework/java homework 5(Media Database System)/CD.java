public class CD extends Item
{
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }
    
    @Override
    public void print()
    {
        System.out.println("CD");
        System.out.println("Title: " + getTitle());
        if(getOwn()) {
            System.out.println("Got it: Yes");
        } else {
            System.out.println("Got it: No");
        }
        System.out.println("Playing time: " + getPlayingTime());
        System.out.println("Comment: " + getComment());
        System.out.println("Artist: " + artist);
        System.out.println("No. of tracks: " + numberOfTracks);
    }
}