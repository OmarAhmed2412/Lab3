public class Reader {
    private String name;
    private String phoneNumber;
    private Book[] purchasedBooks = new Book[5];
    private int numberOfPurchasedBooks = 0;

    public Reader(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Book[] getPurchasedBooks() {
        return purchasedBooks;
    }

    public void setPurchasedBooks(Book[] purchasedBooks) {
        this.purchasedBooks = purchasedBooks;
    }

    public int getNumberOfPurchasedBooks() {
        return numberOfPurchasedBooks;
    }

    public void setNumberOfPurchasedBooks(int numberOfPurchasedBooks) {
        this.numberOfPurchasedBooks = numberOfPurchasedBooks;
    }
    public void purchaseBook(Book b){
        if(numberOfPurchasedBooks < 5)
        {
            for (int i = 0 ; i < 5 ; i++)
            {
                if(purchasedBooks[i] == b)
                    System.out.println("Wow,you love "+purchasedBooks[i].getName()+" so much");
                break;
            }
            purchasedBooks[numberOfPurchasedBooks] = b;
            numberOfPurchasedBooks++;
        }
        else
            System.out.println("You have reached the maximum limit");
    }
    public void printPurchasedBooks(){
        for (int i = 0 ; i<numberOfPurchasedBooks ; i++)
            System.out.println("Book "+(i+1)+":"+purchasedBooks[i].getName()+","+purchasedBooks[i].getAuthor()+","+purchasedBooks[i].getId()+","+purchasedBooks[i].getPrice());
    }
    public void printTotalPrice(){
        double sum = 0;
        for (int i = 0 ; i<numberOfPurchasedBooks ; i++)
            sum += purchasedBooks[i].getPrice();
        System.out.println("Total amount to be paid is " + sum);
    }
    public void printAuthorBooks(String a)
    {
        boolean c = false;
        for (int i = 0 ; i<numberOfPurchasedBooks ; i++)
        {
            if(purchasedBooks[i].getAuthor().equals(a)) {
                System.out.println("Book " + (i + 1) + ":" + purchasedBooks[i].getName() + "," + purchasedBooks[i].getAuthor() + "," + purchasedBooks[i].getPrice());
                c = true;
            }

        }
        if (c == false)
            System.out.println("No books for this author");
    }
}
