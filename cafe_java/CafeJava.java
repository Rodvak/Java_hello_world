public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = " Your total is $";
        String sorryMessage = " We are sorry, you still owe $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 5.5;
        double latteCoffeePrice = 6.5;
        double cappuccinoCoffeePrice = 4.5;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Noah";
        String customer3 = "Sam";
        String customer4 = "Jimmy";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); 
        if (isReadyOrder1){
            System.out.println(customer1 + readyMessage + displayTotalMessage + mochaPrice);
        }
        else {
            System.out.println(customer1 + pendingMessage);
        }
        
        System.out.println(generalGreeting + customer2); 
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage + displayTotalMessage + cappuccinoCoffeePrice);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage + displayTotalMessage + (latteCoffeePrice * 2));
        }
        else {
            System.out.println(customer3 + pendingMessage);
        }

        System.out.println(generalGreeting + customer4); 
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage + displayTotalMessage + mochaPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        System.out.println(customer4 + sorryMessage + (latteCoffeePrice - mochaPrice));


    }
}
