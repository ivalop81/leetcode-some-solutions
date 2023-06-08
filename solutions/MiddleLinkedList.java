package solutions;

import java.util.LinkedList;
import java.util.ListIterator;

public class MiddleLinkedList {

    private LinkedList<Integer> getMiddleOfALinkedList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> secondMedianList = new LinkedList<>();
        int upperMedian, initial, end;
        initial = linkedList.indexOf(linkedList.getFirst());
        end = linkedList.indexOf(linkedList.getLast());
        // even
        /*if (linkedList.size() % 2 == 0)
            upperMedian = ((initial + end) / 2) + 1;
        else // odd
            upperMedian =  (initial + end) / 2; */

        upperMedian = (linkedList.size() % 2 == 0) ? ((initial + end) / 2) + 1 : (initial + end) / 2;

        ListIterator<Integer> listIterator = linkedList.listIterator(upperMedian);
        while (listIterator.hasNext())
            secondMedianList.add(listIterator.next());

        return secondMedianList;
    }

    public static void main(String[] args) {
        MiddleLinkedList middleLinkedList = new MiddleLinkedList();
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> middleList;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // print original list
        System.out.println(list);
        middleList = middleLinkedList.getMiddleOfALinkedList(list);
        // print second media list
        System.out.println(middleList);
    }
}
