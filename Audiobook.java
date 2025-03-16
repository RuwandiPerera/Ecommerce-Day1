public class Audiobook extends Book {
    private double duration;
    

    public Audiobook(String title, String author, int publicationYear, double duration) {
        super(title, author, publicationYear);
        this.duration = duration;
        
    }

    public double getDuration() {
        return duration;
    }

   

    @Override
    public void displayDetails() {
        System.out.println("Audio Book: " + getTitle() + " by " + getAuthor() + 
                           ", Year: " + getPublicationYear() + ", Duration: " + duration + " hours");
    }
}