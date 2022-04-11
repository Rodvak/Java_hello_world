import java.util.ArrayList;

public class CafeUtil{
    // Write a method that sums together every consecutive integer from 1 to 10 and returns the sum. In other words, add 1 + 2 + 3.. and so on up to 10 and return the result. NINJA BONU:  Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.
    public int getStreakGoal(Integer numWeeks){
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++) {
            sum = sum + i;
        }
        return sum;
    }
    // Given an array of item prices from an order, sum all of the prices in the array and return the total. 
    public double getOrderTotal(double[]prices){
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
        }
        return sum;
    }
    // Given an ArrayList of menu items (strings), print out each index and menu item. 
    // Sample output given an  ArrayList with the items "drip coffee",  "cappuccino",  "latte" and  "mocha"
    public void displayMenu(ArrayList<String>menuItems){
        for (int i = 0; i < menuItems.size(); i++) {
            String showMenu = menuItems.get(i);
            System.out.println(i + " " + showMenu);
        }
    }
    //Print this string to the console: "Please enter your name:"
    // Then add this line of code to get user input from the terminal and store it in the variable  userName: 
    // String userName = System.console().readLine();copy
    // Next print the userName to the console, saying "Hello, [user name here]!"
    // Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
    // Then, add the customer's name to the given customers list. And print the list.
    // No need to return anything.
    public void addCustomer(ArrayList<String>customers) {
        System.out.println("Please enter your name");
        // line 38 lets us make the user write their name in the console.
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}