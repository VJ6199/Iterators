import java.util.LinkedList;
import java.util.Spliterator;

public class Splititerator {
    public static void main(String[] args) {
        LinkedList<String> mm = new LinkedList<>();
        mm.add("moblie");
        mm.add("laptop");
        mm.add("tablet");
        mm.add("notepad");
        mm.add("ipad");
        mm.add("notebook");
        mm.add("moblie");
        System.out.println(mm);
        Spliterator<String> nn = mm.spliterator();
        System.out.println("Exact size : "+nn.getExactSizeIfKnown());
        System.out.println("Estimated size :"+nn.estimateSize());
        System.out.println("Characterstics :"+nn.characteristics());
        System.out.println("Characterstics :"+nn.hasCharacteristics(nn.characteristics()));
        System.out.println("Equals :"+nn.equals(nn));
        Spliterator<String> vv = mm.spliterator();
        Spliterator<String> vvs = vv.trySplit();
        vvs.forEachRemaining(System.out::println);
    }
}
