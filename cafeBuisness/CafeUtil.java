import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for(int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for(int i = 0; i < prices.length; i++) {
            sum += prices[i];
        } 
        return sum;
    }

    void displayMenu(ArrayList<String> menuItems) { 
        String name = "";
        for(int i = 0; i < menuItems.size(); i++){
            name = menuItems.get(i);
            System.out.println(i + " " + name);
        }
    }

    void addCustomer(ArrayList<String> customerWait) {
        System.out.println("Please enter your name:");

        String userName = System.console().readLine();

        customerWait.add(userName);

        int num = customerWait.size()-1;

        String greeting = String.format("Hello, %s! There are %s people in front of you.", userName, num); 
        System.out.println(greeting);
        System.out.println(customerWait);

    }
}