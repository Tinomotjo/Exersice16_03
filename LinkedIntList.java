package Exersice16_1;

public class LinkedIntList {
    private ListNode front;

    public LinkedIntList() {
        front = null;
    }

    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    // tilføjer på det bagerste index.
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // tilføjer til et spsifickt index.
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = new ListNode(value, current.next);
        }
    }

    // Fjerner et index
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
    }

    public int indexOf(int value) {
        int index = 0;
        ListNode current = front;
        while (current != null) {
            if (current.data == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    public int get(int index) {
        return nodeAt(index).data;
    }

    private ListNode nodeAt(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    /*
    // Exersice_a_16_1
    public void set (int index, int value){
        nodeAt(index).data = value;
    }
    */
    /*
    // Exersice_a_16_2
    public int max(){

        // Smider en exception hvis listen = null
        if (front == null) {
            throw new NoSuchElementException();
        } else {

            ListNode current = front;
            int max = front.data;

            //Tjekker om det næste node data er større end den nuværende.
            while (current.next != null){
                if (current.data > max) {
                    max = current.data;
                }
                current = current.next;
            }
            return max;
        }
    }
    */

    //Exersice_16_3
    public boolean isSorted (){

        ListNode current = front;
        boolean nondecreasing = false;

        // Metoden kan kun bruges hvis der er 1+ elementer.
        if (front != null){
            // Ryger til den bagerste node.
            while (current.next != null){
                current = current.next;
                nondecreasing = true;
            }
            current.next = new ListNode(front.data);
            front = front.next;

        }
        return nondecreasing;
    }

}