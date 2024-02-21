package queue;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserMainCode {
        
        public static Map<Integer,String>getMedals(Map<Integer,Integer> map)
        {
                Map medalMap=null;
                medalMap=new HashMap<Integer,String>();
                //Getting a set of all the keys from the map
                Set<Integer>keys=map.keySet();
                String medalType=null;
                for(int key:keys)
                {
                        //Obtaining the value corresponding to the key
                        int marks=map.get(key);
                        if(marks>=80)
                                medalType="Gold";
                        else if(marks>=60)
                                medalType="Silver";
                        else if(marks>=40)
                                medalType="Bronze";
                        else
                                medalType="No medal Awarded";
                        medalMap.put(key, medalType);
                }
                return medalMap;
        }
        
        public static void main(String[] s)
        {
                Map<Integer,Integer>map=new HashMap<Integer,Integer>();
                map.put(1, 92);
                map.put(2, 77);
                map.put(3, 55);
                map.put(4, 88);
                map.put(5, 32);
                
                Map<Integer,String>medalMap=getMedals(map);
                System.out.println(medalMap);
        }

}

