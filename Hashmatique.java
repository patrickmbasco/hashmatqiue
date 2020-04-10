import java.util.HashMap;
import java.util.Set;


public class Hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("song1", "Hi how you doing");
        trackList.put("song2", "Good how are you");
        trackList.put("song3", "Fine thank you");
        trackList.put("song4", "fuck u");

        String song = trackList.get("song4");
        System.out.println("The song is: " + song);

        Set<String> keys = trackList.keySet();
        for(String key: keys){
            System.out.println(key);
            System.out.println(trackList.get(key));

        }        
    }
}
