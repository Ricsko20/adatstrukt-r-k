import java.util.Arrays;
import java.util.LinkedList;

public class QueueService {

    public static void main(String[] args) {

        LinkedList<Integer> customers = new LinkedList<>(Arrays.asList(101, 201, 701));
        System.out.println(customers);

        addCustomer(customers, 102);
        System.out.println(customers);

        Integer customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        addCustomer(customers, 702);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);

        customer = nextCustomer(customers);
        removeCustomer(customers, customer);
        System.out.println(customers);
    }

    /**
     * @param queue
     * @param number
     */
    public static void addCustomer(LinkedList<Integer> queue, Integer number) {
        queue.addLast(number);
    }

    /**
     * @param queue
     * @return
     */
    public static Integer nextCustomer(LinkedList<Integer> queue) {
        for (Integer customer : queue) {
            if (customer.toString().startsWith("7")) {
                return customer;
            }
        }
        return queue.peekFirst();
    }

    /**
     * @param queue
     * @param number
     */
    public static void removeCustomer(LinkedList<Integer> queue, Integer number) {
        queue.remove(number);
    }
}

