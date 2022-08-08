// Домашка 1.9 Объекты и классы
public class Author{
    private String firstName;
    private String lastName;

    public Author (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //@Override
    public String toString(){
        return firstName + " " + lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
}