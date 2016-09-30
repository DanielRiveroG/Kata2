package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        //Integer[] array = {1,4,7,1,1,8,4,1,4,9};
        //Double[] array = {1.1,4.3,7.4,1.1,1.2,8.2,4.4,1.2,4.3,9.5};
        String[] array = {"Pepe", "Juan", "Pepe", "Dani", "Pepe"};
        
        Histogram histo = new Histogram(array);
        
        HashMap <Object,Integer> histogram = histo.getHistogram();
        
        for(Object key: histogram.keySet()){
            System.out.println(key + "->" + histogram.get(key));
        }
    }
}
