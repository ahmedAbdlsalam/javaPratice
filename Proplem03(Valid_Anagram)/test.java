import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class test {
    

    public static void main(String[] args) {
        // myClass c1 = new myClass();

        Hashtable<Character, Integer> occurrence = new Hashtable<>();
        occurrence.put('a', 1);
        occurrence.put('b', 1);
        occurrence.put('c', 1);

        Set<Character> a = new HashSet<Character>();
        a = occurrence.keySet();
        Object[] arr = a.toArray();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
        // System.out.println(arr);
        char[] JavaCharArray = {'r', 's', 't', 'u', 'v'};

        System.out.println(occurrence.get('a'));
        occurrence.replace('a', occurrence.get('a')+1);
        System.out.println(occurrence.get('a'));

    }
}




