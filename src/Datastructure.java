import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Datastructure {

    public static void main(String[] args) {

        ArrayList <String> arrayList= new ArrayList<>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add(0,"6");

//        for (String s:arrayList) {
//            System.out.println(s);
//        }



       // arrayList.remove("6");

        arrayList.remove(2);

        arrayList.set(1,"set10");


        arrayList.forEach(System.out::println);

        boolean list_bool = arrayList.contains("set10");
        boolean list_bool2 = arrayList.contains("set12");

        System.out.println(list_bool);
        System.out.println(list_bool2);

        System.out.println(arrayList.size());

        HashMap<Integer,String> id_name = new HashMap<>();

        String [] name = {"张三","李四","李五","赵六"};

        for (int i=0;i<name.length;i++)
        {
            id_name.put((i+1),name[i]);
        }

        String name_2 = id_name.get(2);
        //String name_2 = id_name.get(0);

        System.out.println("key值为2对应的value值为:"+name_2);

        for (Integer id:id_name.keySet())
        {
            System.out.println("id="+id+",name="+id_name.get(id));
        }
        System.out.println("-----------------------------------");

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();

            System.out.println(next);
        }









    }
}
