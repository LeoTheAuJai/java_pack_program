/**
 * Name: Au Sai Chun
 * Student ID: 21105253D
 */
public class TestDatabase
{
    public static void main(String args[]) 
    {
        Database db = new Database();
        CD cd1 = new CD("Joey & Joey", "Joey Yung", 11, 60);
        Video video1 = new Video("Matrix", "Wachowski Brothers", 137);
        VideoGame vg1=new VideoGame("Final Fantasy",30,"Windows",2);
        // uncomment it after you create the class VideoGame and modify the class Database
        // VideoGame videoGame1 = new VideoGame("Final Fantasy", "Windows", 2, 30);
        
        db.addCD(cd1);
        db.addVideo(video1);
        db.addVideoGame(vg1);
        // uncomment it after you create the class VideoGame and modify the class Database
        // db.addVideoGame(videoGame1);
        
        cd1.setComment("My favorite album");
        video1.setComment("My favorite movie");
        vg1.setComment("My favorite VideoGame");
        // uncomment it after you create the class VideoGame and modify the class Database
        // videoGame1.setComment("My favorite VideoGame");
        
        cd1.setOwn(true);
        video1.setOwn(true);
        vg1.setOwn(false);
        
        // uncomment it after you create the class VideoGame and modify the class Database
        // videoGame1.setOwn(false);
        
        db.list();
    }
}