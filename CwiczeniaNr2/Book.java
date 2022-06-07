import java.time.LocalDate;

class Book {
    static Long ID = 1l;
    String name;
    String author;
    Genre genre;
    Lang language;
    LocalDate publishDate;
    int borrowCount;
    boolean isAvailable;

    public Book(String name, String author, Genre genre, Lang language, LocalDate publishDate) {
        ID++;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.language = language;
        this.publishDate = publishDate;
        borrowCount = 0;
        isAvailable = true;
    }

    public void BorrowBook(Person person) {
        if(person.getBorrowedBook() == null && isAvailable) {
            person.setBorrowedBook(this);
            borrowCount++;
            isAvailable = false;
        } else {
            System.out.println("The book can't be borrowed.");
        }
    }

    public void PlaceBack() {
        if(isAvailable == true) {
            System.out.println("The book is already in place.");
        } else {
            isAvailable = true;
        }
    }
}