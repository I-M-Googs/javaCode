import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Book> directory = new HashMap<>();

        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        Library library = new Library();
        library.addBook(senseAndSensibility);
        library.addBook(prideAndPrejudice);

        
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);
        /*
        long start = System.nanoTime();
        Book book = directory.get("Persuasion");
        System.out.println(book);
        System.out.println();
        book = directory.get("Pride and Prejudice");
        System.out.println(book);
        long end = System.nanoTime();
        double durationInMilliseconds = 1.0 * (end - start) / 1000000;
        System.out.println("The book search took " + durationInMilliseconds + " milliseconds.");
        */
        System.out.println(library.getBook("pride and prejudice"));
        System.out.println();
        
        System.out.println(library.getBook("PRIDE AND PREJUDICE"));
        System.out.println();
        
        System.out.println(library.getBook("SENSE"));
        System.out.println();
        System.out.println(directory.size());
    }
}
