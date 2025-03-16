public class Printedbook extends Book {
    private int popularpage;

    public Printedbook(String title, String author, int publish_year, int popularpage) {
        super(title, author, publish_year);
        this.popularpage = popularpage;
    }

    public int getPopularpage() {
        return popularpage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Printed Book: " + getTitle() + " by " + getAuthor() + 
                           ", Year: " + getPublicationYear() + ", Popular Pages: " + popularpage);
    }
}