package kata2;

import java.util.ArrayList;

public class Kata2 {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < 100; i++) list.add((int) (Math.random()*80));
        
        for (Integer value : list) System.out.println(value);
        
        ArrayList<Integer> elderPeople = new ArrayList<Integer>();
        for (Integer value : list){
            if (value > 70) elderPeople.add(value);
        }
        
        list.removeAll(elderPeople);
        
        for (Integer value : list) System.out.println (value);
      
    }
}
