package zadanie_3;

public class Book {
    private String author;
    private String name;
    private int year;

    Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public void setAuthor(String a) { this.author = a; }
    public String getAuthor() {
        return author;
    }

    public void setName(String n) { this.name = n; }
    public String getName() {
        return name;
    }

    public void setYear(int y) { this.year = y; }
    public int getYear() {
        return year;
    }

}
