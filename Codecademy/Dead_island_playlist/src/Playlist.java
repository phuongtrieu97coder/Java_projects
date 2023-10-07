import java.util.ArrayList;

public class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    desertIslandPlaylist.add("Hurt");
    desertIslandPlaylist.add("Somewhere I belong");
    desertIslandPlaylist.add("One time");
    desertIslandPlaylist.add("Replay");
    desertIslandPlaylist.add("Faint");
    desertIslandPlaylist.add("Stand by me");

    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove("One time");
    System.out.println(desertIslandPlaylist.size());

    int indexSong_a = desertIslandPlaylist.indexOf("Somewhere I belong");
    int indexSong_b = desertIslandPlaylist.indexOf("Faint");

    System.out.println("Index song_a: "+indexSong_a);
    System.out.println("Index song_b "+indexSong_b);

    String tempA = "Somewhere I belong";
    String tempB = "Faint";

    desertIslandPlaylist.set(indexSong_a,tempB);

     desertIslandPlaylist.set(indexSong_b,tempA);

    System.out.println(desertIslandPlaylist);

  }
  
}