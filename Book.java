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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
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

    public void printAuthor() {
        System.out.println(this.author);
    }
    public void printTitle() {
        System.out.println(this.title);
    }

    public void printDetails() {
        System.out.println("Title: " + this.title + ", Author: " + this.author + ", Pages: " + this.pages);
    }

}
