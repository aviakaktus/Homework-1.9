// Домашка 1.9 Объекты и классы
/*Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.*/

public class Book{
    private String title;
    private Author author;
    private int year;

    public Book (String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear (int year){
        this.year = year;}
}