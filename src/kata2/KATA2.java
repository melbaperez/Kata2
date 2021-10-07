
package kata2;

import java.util.HashMap;
import java.util.Map;

public class KATA2 {

    public static void main(String[] args) {
        int[] data = {1,2,14,4,5,14,4,4,9,4,1,2,3,14,5};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();   
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
          
        if (!histogram.isEmpty()){
            for(Map.Entry<Integer, Integer> entry: histogram.entrySet()){ //conjunto de entradas
                System.out.println(entry.getKey() + " ==> " + entry.getValue());

            }
        }
    }
        
    
}
