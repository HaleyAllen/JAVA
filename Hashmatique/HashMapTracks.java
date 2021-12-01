import java.util.HashMap;
import java.util.Set;

public class HashMapTracks {
    public static void main(String[] args) {
        HashMap<String, String> track = new HashMap<String, String>();

        // put method to insert
        track.put("Daisy", "Ashnikko");
        track.put("Party Favor", "Billie Eilish");
        track.put("NASA", "Ariana Grande");
        track.put("Positions", "Ariana Grande");

        // get value with the key
        String name = track.get("NASA");
        System.out.println("The artist is: " + name);
        
        // get the keys by using the keySet method
        Set<String> keys = track.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(track.get(key));
        }
    }
}