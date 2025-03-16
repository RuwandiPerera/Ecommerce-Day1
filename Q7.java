public class seven {
     public static void main(String[] args) {
 
         Library library = new Library(5);
 
         library.addBook(new Printedbook("J.K. Rowling", "Harry Potter and the Sorcerer", 1997, 371));
         library.addBook(new Ebook("Dan Brown", "The Da Vinci Code", 2003,5000));
         library.addBook(new Audiobook("Malala Yousafzai", "I Am Malala", 2013, 12));
 
         library.displayBooks();
     }
 }