package hbcu.stay.ready.algor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Solution {

    public Boolean harmlessRansomNote(String message, String magazineText) {

        String[] messageArray = message.split(" ");
        String[] magazineTextArray = magazineText.split(" ");
        HashMap<String, Integer> magazineTextMap = new HashMap<>();
        HashMap<String, Integer> messageMap = new HashMap<>();

        for (String word : magazineTextArray) {
            if (magazineTextMap.containsKey(word)) {
                magazineTextMap.put(word, magazineTextMap.get(word) + 1);
            } else {
                magazineTextMap.put(word, 1);
            }
        }
        for (String word : messageArray) {
            if (messageMap.containsKey(word)) {
                messageMap.put(word, messageMap.get(word) + 1);
            } else {
                messageMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> finalMessage : messageMap.entrySet()) {
            String key = finalMessage.getKey();
            int value = finalMessage.getValue();
            if (value > magazineTextMap.get(key) || !magazineTextMap.containsKey(key)) {
                return false;
            }

        }
        return true;
    }

}
