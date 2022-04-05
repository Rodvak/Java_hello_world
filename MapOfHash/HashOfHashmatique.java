// Import HashMap. HASHMAP are DICTIONARIES in Java.
import java.util.HashMap;
import java.util.Set;
// ALWAYS create  the class and name it the SAME as the file.
public class HashOfHashmatique {
    // Remember to always have public static void main(String[] args)
    public static void main(String[] args) {
        // HashMap has 2 Strings because between line 9 and 12, we are assigning 2 Strings, a KEY and a Value. USERMAP is just a variable to connect and call the class.
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("The Pretender", "Keep you in he dark...");
        userMap.put("Everlong", "Hello, I have waited here for you...");
        userMap.put("Learn To Fly", "Run and tell all of the angels...");
        userMap.put("My Hero", "Too alarming now to talk about...");
        // In line 14 and 15, we created a variable = keyValue because we want to get the value of the key "My Hero". Then, we access the key value with dot notation and our userMap variable.get.
        String keyValue = userMap.get("My Hero");
        System.out.println(String.format("My Hero Lyrics: %s", keyValue));
        // We use a for loop to get all the keys and values from our dictionary. We create a variable Key, we access our dictionary with userMap and .keySet. KEYSET method returns a set of all the keys in our map. Then, in our for-loop, we iterate over the set, print the keys, and get the value in our map with said key.
        Set<String> keys = userMap.keySet();
        for(String key : keys){
            System.out.println(String.format("Track: %s Lyrics: %s", key, userMap.get(key)));
        }
    }
}
