package com.fischer.collections;

import java.util.Map;

public class HashMap {

    public static void main(String[] args) {

        Map<String, Integer> notes = new java.util.HashMap<>(); // key/value collection
        notes.put("Note 1", 1);
        notes.put("Note 4", 4);

        int note1 = notes.get("Note 1");

        for (Map.Entry<String, Integer> entry :notes.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
        }
    }

}
