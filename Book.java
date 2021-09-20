/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Kenny Castro-Monroy
 * @version 09.19.2021
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
    }

    // Add the methods here ...
    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getRefNumber() {
        return this.refNumber;
    }

    public void setRefNumber(String ref) {
        this.refNumber =  ref;
    }

    public void printAuthor() {
        System.out.println(this.author);
    }
    public void printTitle() {
        System.out.println(this.title);
    }

    public void printDetails() {
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages + ", Ref Number: " + (this.refNumber.length() > 0 ? this.refNumber : "ZZZ"));
    }

}
