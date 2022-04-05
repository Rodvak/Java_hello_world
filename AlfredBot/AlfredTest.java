public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();

        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "morning");

        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );

        String alfredTest = alfredBot.respondBeforeAlexis(
            "Beth Kane", "evening");
        
        String myTest = alfredBot.myMethod("Beth", "evening");
        // Print the greetings to test.
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        // NINJA BONUS
        System.out.println(alfredTest);
        // NINJA BONUS
        System.out.println(myTest.toUpperCase());
    }
}
