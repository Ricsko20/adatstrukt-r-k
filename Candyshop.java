import java.util.*;

public class Candyshop {
    public static void main(String... args) {

        ArrayList<Object> sweets = new ArrayList<>();
        sweets.add("Cupcake");
        sweets.add(2);
        sweets.add("Brownie");
        sweets.add(false);

        System.out.println(repairSweetList(sweets));
    }

    public static ArrayList<Object> repairSweetList(ArrayList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(2)) {
                list.set(i, "Croissant");
            } else if (list.get(i).equals(false)) {
                list.set(i, "Ice cream");
            }
        }
        return list;
    }
}