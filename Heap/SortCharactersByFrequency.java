package Heap;

import java.util.*;

public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        String result = "";
        char max = '\0';
        while(!map.isEmpty()){
            int value = (Collections.max(map.values()));
            for(Map.Entry<Character, Integer> entry : map.entrySet()){
                if(entry.getValue() == value){
                    max = entry.getKey();
                    while(value > 0) {
                        result += entry.getKey();
                        value--;
                    }
                    break;
                }
            }
            map.remove(max);
        }
        return result;
    }

    public static void main(String[] args){
        SortCharactersByFrequency s = new SortCharactersByFrequency();
        String str = "Aabb";
        System.out.println("res : "+s.frequencySort(str));
    }
}
