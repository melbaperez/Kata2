
package kata2;

import java.util.Map;

public class KATA2 {

    public static void main(String[] args) {
        Integer[] data = {1,2,14,4,5,14,4,4,9,4,1,2,3,14,5};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        if (!histogr.isEmpty()){
            for(Map.Entry<Integer, Integer> entry: histogr.entrySet()){ 
                System.out.println(entry.getKey() + " ==> " + entry.getValue());

            }
        }
    }
        
    
}
