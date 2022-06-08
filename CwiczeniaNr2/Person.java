import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.ZoneId;

class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Book borrowedBook;
    private Address address;

    public Person() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the name: ");
        if(scanner.hasNextLine())
            name = scanner.nextLine();
        System.out.print("Input the surname: ");
        if(scanner.hasNextLine())
            surname = scanner.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Input the date of birth [dd-MM-yyyy]: ");
        String date = scanner.nextLine();
        dateOfBirth = LocalDate.parse(date, dateTimeFormatter);

        borrowedBook = null;
        address = new Address();
    }

    public Person(String name, String surname, LocalDate dateOfBirth, Book borrowedBook, Address address) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.borrowedBook = borrowedBook;
        this.address = address;
    }

    Book PublishBook() {
        String title;
        Genre genre = Genre.Adventure;
        Lang language = Lang.English;
        int choice;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the title of the book: ");
        title = scanner.nextLine();

        // Genre setting
        System.out.print("Choose a genre:\n1. Adventure\n2. Classic\n3. Comics\n4. Detective\n5. Fantasy\n6. Fiction\n >> ");
        choice = scanner.nextInt();
        while(choice < 1 || choice > 6) {
            System.out.print("Error. No such option has been found.\nChoose a genre:\n1. Adventure\n2. Classic\n3. Comics\n4. Detective\n5. Fantasy\n6. Fiction\n >> ");
            choice = scanner.nextInt();
        }

        switch(choice) {
            case 1: genre = Genre.Adventure;
                break;
            case 2: genre = Genre.Classic;
                break;
            case 3: genre = Genre.Comics;
                break;
            case 4: genre = Genre.Detective;
                break;
            case 5: genre = Genre.Fantasy;
                break;
            case 6: genre = Genre.Fiction;
                break;
            default: System.out.println("An error occurred."); System.exit(-1);
                break;
        }
        
        System.out.print("Choose a language:\n1. English\n2. Polish\n3. Japanese\n4. Ukrainian\n >> ");
        choice = scanner.nextInt();
        while(choice < 1 || choice > 4) {
            System.out.print("Error. No such option has been found.\nChoose a genre:\n1. English\n2. Polish\n3. Japanese\n4. Ukrainian\n >> ");
            choice = scanner.nextInt();
        }

        switch(choice) {
            case 1: language = Lang.English;
                break;
            case 2: language = Lang.Polish;
                break;
            case 3: language = Lang.Japanese;
                break;
            case 4: language = Lang.Ukrainian;
                break;
            default: System.out.println("An error occurred."); System.exit(-1);
                break;
        }
     //   scanner.close();
        return new Book(title, this.surname + " " + this.name, genre, language, LocalDate.now(ZoneId.systemDefault()));
    }

    public void setName(String name) throws RuntimeException {
        if(name.equals(""))
            throw new RuntimeException("The name cannot be empty.");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) throws RuntimeException  {
        if(surname.equals(""))
            throw new RuntimeException("The surname cannot be empty.");
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) throws RuntimeException  {
        if(dateOfBirth.equals(null))
            throw new RuntimeException("The date of birth cannot be null.");
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setAddress(Address address) throws RuntimeException  {
        if(address.equals(null))
            throw new RuntimeException("The address cannot be null.");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}