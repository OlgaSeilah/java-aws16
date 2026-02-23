import java.util.*;

public class CollectionPerfomanceTests {
    static final int N = 1_000_000;

    //	Modify the methods so that they return the appropriate collections.
//	Add performance tests for:
//
//	searching for a single element,
//
//	searching for an array of elements,
//
//	removing an array of elements,
//
//	iterating over the collection.
    public static void main(String[] args) {
        int[] values = fillArray(N);
        System.out.println("========add============");
        List<Integer> arrayList = addArrayList(values);
        List<Integer> fullLinkedList = addLinkedList(values);
        Set<Integer> fullHashSet = addHashSet(values);
        Set<Integer> fullLinkedHashSet = addLinkedHashSet(values);
        Set<Integer> fullTreeSet = addTreeSet(values);


        System.out.println("========contains============");
        long start = System.nanoTime();
        arrayList.contains(1000);
        System.out.println("Time for contains in arrayList is " + (System.nanoTime() - start));

        start = System.nanoTime();
        fullLinkedList.contains(1000);
        System.out.println("Time for contains in LinkedList is " + (System.nanoTime() - start));

        start = System.nanoTime();
        fullHashSet.contains(1000);
        System.out.println("Time for contains in HashSet is " + (System.nanoTime() - start));

        start = System.nanoTime();
        fullLinkedHashSet.contains(1000);
        System.out.println("Time for contains in LinkedHashSet is " + (System.nanoTime() - start));

        start = System.nanoTime();
        fullTreeSet.contains(1000);
        System.out.println("Time for contains in TreeSet is " + (System.nanoTime() - start));

    }

    private static Set<Integer> addHashSet(int[] values) {
        Set<Integer> set = new HashSet<>(N);
        long start = System.currentTimeMillis();
        for (Integer i : values) {
            set.add(i);
        }
        System.out.println("Time for fill hash set is " + (System.currentTimeMillis() - start));
        return set;
    }

    private static Set<Integer> addLinkedHashSet(int[] values) {
        Set<Integer> set = new LinkedHashSet<>(N);
        long start = System.currentTimeMillis();
        for (Integer i : values) {
            set.add(i);
        }
        System.out.println("Time for fill linked hash set is " + (System.currentTimeMillis() - start));
        return set;
    }

    private static Set<Integer> addTreeSet(int[] values) {
        Set<Integer> set = new TreeSet<>();
        long start = System.currentTimeMillis();
        for (Integer i : values) {
            set.add(i);
        }
        System.out.println("Time for fill tree set is " + (System.currentTimeMillis() - start));
        return set;
    }

    private static List<Integer> addLinkedList(int[] values) {
        List<Integer> list = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (Integer i : values) {
            list.add(i);
        }
        System.out.println("Time for fill linked list is " + (System.currentTimeMillis() - start));
        return list;
    }

    private static List<Integer> addArrayList(int[] values) {
        List<Integer> list = new ArrayList<>(N);
        long start = System.currentTimeMillis();
        for (Integer i : values) {
            list.add(i);
        }
        System.out.println("Time for fill array list is " + (System.currentTimeMillis() - start));
        return list;
    }

    private static int[] fillArray(int n) {
        int[] arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(0, 100_000);
        }
        return arr;
    }

}
