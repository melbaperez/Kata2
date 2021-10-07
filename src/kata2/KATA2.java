
package kata2;

import java.util.HashMap;
import java.util.Map;

public class KATA2 {

    public static void main(String[] args) {
        int[] data = {1,2,14,4,5,14,4,4,9,4,1,2,3,14,5};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();   
        for (int i = 0; i < data.length; i++) {            
            if (histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+ 1);
            }
            else{
                histogram.put(data[i], 1);
            }
        }
        if (!histogram.isEmpty()){
            for(Map.Entry<Integer, Integer> entry: histogram.entrySet()){ //conjunto de entradas
                System.out.println(entry.getKey() + " ==> " + entry.getValue());

            }
        }
    }
        
    
}
