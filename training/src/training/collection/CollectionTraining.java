package training.collection;

import java.util.*;

/**
 * @author Ashish Patel
 */
public class CollectionTraining {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList();
        a.add("Ashish");
        a.add("Bhavik");
        a.add("Hardik");
        a.add("Vivek");
        System.out.println("Before ADD" + a);
        a.add(1, "Vinita");
        System.out.println("After add " + a);


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(a);

        System.out.println(linkedList.getFirst());

        System.out.println(linkedList);

        HashSet<Double> hashSet = new HashSet<>();
        hashSet.add(2.4);
        hashSet.add(3.4444);
        hashSet.add(4.78);
        hashSet.add(5.00);
        hashSet.add(1.00);

        System.out.println("Hasset" + hashSet);


        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);
        System.out.println("TreeSet" + treeSet);

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ashish", 2276568);
        hashMap.put("Bahavik", 2276567);
        hashMap.put("Vinita", 2276569);


        System.out.println(hashMap);

//Forward direction
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // hash code 123654
        //compute index from hash code- 8 Linkedlist

        System.out.println("______________________");

        ListIterator<String> listIterator = a.listIterator(a.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }



    }


}
