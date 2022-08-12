import java.util.LinkedList;
import java.util.ListIterator;

public class Iteratorarraylist {
    public static void main(String[] args){
        LinkedList<Character> gg = new LinkedList<>();
        gg.add('m');
        gg.add('a');
        gg.add('d');
        gg.add('a');
        gg.add('m');
        gg.add('o');
        gg.add('f');
        System.out.println(gg);
        ListIterator<Character> hh = gg.listIterator();
        while(hh.hasNext()){
            System.out.println(hh.next());
        }
        System.out.println("vijay");
        while(hh.hasPrevious()){
           System.out.println(hh.previous());
        }
      hh.remove();
        System.out.println(gg);
    }
}
