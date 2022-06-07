import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) { 
        // Test the class created
        Person p1 = new Person();
        Person p2 = new Person();
        Book b1 = new Book("Gra szklanych paciorkow", "Herman Hesse", Genre.Classic, Lang.Polish, LocalDate.parse("1943-01-01", DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        Book b2 = p1.PublishBook();
        b1.BorrowBook(p2);
        b1.BorrowBook(p1);
        b1.PlaceBack();
        p2.setBorrowedBook(null);
    }
}