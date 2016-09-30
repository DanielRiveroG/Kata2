package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] array = {1,4,7,1,1,8,4,1,4,9};
        HashMap<Integer,Integer> histogram = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            if(!histogram.containsKey(j)){
                histogram.put(j, 1);
            }else{
                histogram.put(j,histogram.get(j)+1);
            }
            
        }
        for(int key: histogram.keySet()){
            System.out.println(key + "->" + histogram.get(key));
        }
    }
}
