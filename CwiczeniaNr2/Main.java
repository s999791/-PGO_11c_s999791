import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) { 
        // Test the class created
        Person p1 = new Person();
        Book b1 = new Book("Gra szklanych paciorkow", "Herman Hesse", Genre.Classic, Lang.Polish, LocalDate.parse("1943-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        Book b2 = null;
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = 0;
            while(true) {
                System.out.print("Choose an option:\n1. Publish a book\n2. Borrow a book\n3. Place back a book\n4. Exit\n >> ");
                if(scanner.hasNextInt())
                    choice = scanner.nextInt();
                switch(choice) {
                    case 1: b2 = p1.PublishBook();
                        break;
                    case 2: b1.BorrowBook(p1);
                        break;
                    case 3: b1.PlaceBack();
                            p1.setBorrowedBook(null);
                        break;
                    case 4: System.out.println("Goodbye!");
                        System.exit(0);
                    default:
                        System.exit(0);
                }
            }
        }
    }
}