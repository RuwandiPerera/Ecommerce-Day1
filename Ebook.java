public class Ebook extends Book {
    private int price;
   

    public Ebook(String title, String author, int publish_year, int price) {
        super(title, author, publish_year);
        this.price = price;
        
    }

    public int getPrice() {
        return price;
    }

    

    @Override
    public void displayDetails() {
        System.out.println("E-Book: " + getTitle() + " by " + getAuthor() + 
                           ", Year: " + getPublicationYear() + ", Price: " + price );
    }
}