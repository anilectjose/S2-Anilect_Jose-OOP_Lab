import java.util.*;
class HashMap {
    public static void main(String args[])
    {
        Map<String, Integer> hm
            = new HashMap<String, Integer>();
  
        hm.put("a", new Integer(15));
        hm.put("b", new Integer(26));
        hm.put("c", new Integer(37));
        hm.put("d", new Integer(48));
  
        
        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}