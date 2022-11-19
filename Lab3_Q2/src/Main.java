public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Head first java", "Bert Bates", 12, 200.0);
        Book b2 = new Book("Introduction to Algorithms", "Thomas H. Cormen", 8, 355.5);
        Reader r1 = new Reader("Omar","0129073891264");
        r1.purchaseBook(b1);
        r1.printAuthorBooks("Bert Bates");
        r1.printTotalPrice();



    }
}