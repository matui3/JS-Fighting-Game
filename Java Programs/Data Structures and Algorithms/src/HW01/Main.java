package HW01;

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
//        System.out.println(List.size());
        List.addToFront(0);
//        System.out.println(Arrays.toString(List.getBackingArray()));
        List.addToFront(1);
        List.addToFront(3);
        List.addToFront(4);
        List.addToFront(5);
        List.addToFront(8);
        List.addToFront(9);
        List.addToFront(10);
        List.addToFront(12);
        List.addToFront(20);
//        List.addToFront(13);
        System.out.println(Arrays.toString(List.getBackingArray()));

    }
}
