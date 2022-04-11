import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        // YOUR CODE HERE
        // Date is an OBJECT allows to show the current date, you can return it with %s or with aa + sign.
        // String Format allows us to print just strings.
        Date date = new Date();
        return String.format("Hello, lovely to see you. How are you? %s. ", date);
    }

    public String guestGreeting(String name, String timeOfTheDay) {
        // YOUR CODE HERE
        // The function has 2 parameters that are provided in the Test document line 13.
        Date date = new Date();
        return String.format("Good %s, %s. Lovely to see you. %s. ", timeOfTheDay, name, date);
    }

    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return String.format("It is currently %s.", date);
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        // .indexOf let us find letters or words with integers. It tells you the index location of what you are looking for. In this case, since we  want to find Alexis and Alfred, we use > -1 because we just want to see if Alexis or Alfred are found in the conversation parameter. We do not want to know the index, we wan to know if it exists.
        if (conversation.indexOf("Alexis") > -1) {
            return String.format("Right away, sir.");
        }

        else if (conversation.indexOf("Alfred") > -1) {
            return String.format("At your service.");
        }

        else {
            return String.format("I do not know you.");
        }
    }
    // NINJA BONUS use method OVERLOADING (it is when you name two methods the same thing) It allows us to rehuse the same method. you just HAVE to provide different signatures/parameters in order to work.
    public String respondBeforeAlexis(String name, String timeOftheDay){
        return String.format("Good %s, %s. Lovely to see you.", timeOftheDay, name);
    }
    // SENSEI BONUS
    public String myMethod(String name, String timeOfTheDay){
        return String.format(" %s, I already told you the event will be in the %s!", name, timeOfTheDay);
    }
}
// Write your own AlfredQuote method using any of the String methods you have
// learned!
