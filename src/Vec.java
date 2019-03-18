import java.util.Iterator;
import java.util.Vector;

public class Vec {
    public static void main(String[] args) {
        Vector vec = new Vector();
        Integer i = new Integer(1);

        vec.addElement("one");
        vec.addElement(i);
        vec.addElement(i);
        vec.addElement("two");
        vec.add(new Integer(2));
        vec.addElement(i);
        vec.addElement(i);

        Iterator<Integer> iterator =vec.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
