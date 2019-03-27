package Medium.EncodeAndDecodeTinyURL;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

public class Solution {
    HashMap<String, String> map = new HashMap<>();
    Random random = new Random();

    @Test
    void main() {
        String input = "https://leetcode.com/problems/design-tinyurl";
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String base = "http://tinyurl.com/";
        String uuid = random.nextInt(200000) + 10000 + "";
        map.put(uuid, longUrl);
        return base + uuid;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String[] split = shortUrl.split("/");
        return map.get(split[split.length-1]);
    }

}
