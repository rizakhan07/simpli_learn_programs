package self_learning_7;
import java.util.*;
public class mapusers {
	 public static void main(String[] args) {
	        
         HashMap<Integer,String> hm=new HashMap<Integer,String>();      
          hm.put(1,"riza");    
          hm.put(2,"muqthar");    
          hm.put(3,"ajmal");   
           
          System.out.println("\nThe elements of Hashmap are ");  
          for(Map.Entry m:hm.entrySet()){    
           System.out.println(m.getKey()+" "+m.getValue());    
          }
              
          Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
          ht.put(4,"single");  
          ht.put(5,"dual");  
          ht.put(6,"team");  
          ht.put(7,"tournament");  

          System.out.println("\nThe elements of HashTable are ");  
          for(Map.Entry n:ht.entrySet()){    
           System.out.println(n.getKey()+" "+n.getValue());    
          }
          
          TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
          map.put(8,"miramar");    
          map.put(9,"short game");    
          map.put(10,"arena");       
          
          System.out.println("\nThe elements of TreeMap are ");  
          for(Map.Entry l:map.entrySet()){    
           System.out.println(l.getKey()+" "+l.getValue());    
          }    
          
       }  
}


