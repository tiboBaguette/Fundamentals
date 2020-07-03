package be.vdab.books;

public class Application {
    public static void main(String[] args) {
        Author author1 = new Author("Frank", "frank@hotmail.com", 'm');
        Book book1 = new Book("booktitel", author1, 19.99, 54);

        System.out.println("Bookname: " + book1.getName());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("Quantity: " + book1.getQty());
        System.out.println("Email: " + author1.getEmail());
        System.out.println("Gender: " + author1.getGender());
        System.out.println("Authorname: " + author1.getName());

        System.out.println(book1.toString());
        book1.setPrice(24.99);
        book1.setQty(39);
        author1.setEmail("frank@gmail.com");
        System.out.println(book1.toString());
    }
}
