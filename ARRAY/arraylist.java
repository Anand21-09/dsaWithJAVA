
import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> arraylist1 = new ArrayList<>();
        //insertion
        arraylist1.add(5);
        arraylist1.add(10);
        System.out.println("element : " + arraylist1.get(0));

        for (int i = 0; i < arraylist1.size(); i++) {
            System.out.println("element at " + i + " index is " + arraylist1.get(i));
        }

        //update
        arraylist1.set(1, 20);
        for (int i = 0; i < arraylist1.size(); i++) {
            System.out.println("after update element at " + i + " index is " + arraylist1.get(i));
        }

        //remove
        arraylist1.remove(1);
        for (int i = 0; i < arraylist1.size(); i++) {
            System.out.println("after delete element at " + i + " index is " + arraylist1.get(i));
        }

    }
}
