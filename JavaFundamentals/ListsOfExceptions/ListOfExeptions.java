import java.util.ArrayList;

public class ListOfExeptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");


        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);    
                System.out.println(castedValue);
            } catch (ClassCastException e ) {
                System.out.println(e);
            }
        }
    } 
}
// It is just returning 48.. It should return all as an Integer.