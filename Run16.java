package Exersice16_1;

/*
  Write a method called isSorted that returns true if the list is in sorted (nondecreasing)
  order and returns false otherwise. An empty list is considered to be sorted.
 */

public class Run16 {

public static void main(String[] args)
{
    LinkedIntList list1 = new LinkedIntList();
    list1.add(1);
    list1.add(8);
    list1.add(2);
    list1.add(49);
    list1.add(5);

    System.out.println(list1.isSorted());
}
}