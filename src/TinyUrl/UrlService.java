package TinyUrl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZXM on 11/12/15.
 */
public class UrlService {

    private Map<String, String> longToShort;
    private Map<String, String> shortToLong;
    private char[] charSet = new char[62];

    public UrlService() {
        longToShort = new HashMap<>();
        shortToLong = new HashMap<>();
        int j = 0;
        for (int i = 0; i < 26; i++) {
            charSet[j++] = (char) ('a' + i);

        }
        for (int i = 0; i < 26; i++) {
            charSet[j++] = (char)('A' + i);

        }
        for (int i = 0; i < 10; i++) {
            charSet[j++] = (char)('0' + i);
        }


    }

    public String shortenURL(String url) {
        if (longToShort.containsKey(url))
            return longToShort.get(url);
        String shortenedURL = generateShortURL(url);
        longToShort.put(url, shortenedURL);
        shortToLong.put(shortenedURL, url);

        return shortenedURL;
    }

    private String generateShortURL(String url) {

        int hash = url.hashCode();
        return convertToBase62(hash);
    }

    private String convertToBase62(int value) {
        StringBuilder sb = new StringBuilder();
        value = Math.abs(value);
        while (value != 0) {
            int index = value % 62;
            sb.append(charSet[index]);
            value /= 62;
        }

        return sb.toString();
    }

    public String redirect(String shortURL) {
        if (! shortToLong.containsKey(shortURL))
            throw new IllegalArgumentException("The url does not exist");
        return shortToLong.get(shortURL);
    }


}
