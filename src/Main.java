// Домашка 1.9 Объекты и классы
/* Thinking in Java written by Bruce Eckel and first published in 1998.
Java: The Complete Reference written by Herbert Schildt and first published in 2004 */

public class Main
{
    public static String printSeparator(){
        return " - ";

    }
    public static void main(String[] args) {

        Author bruceEckel = new Author ("Bruce", "Eckel");
        Author herbertSchildt = new Author ("Herbert", "Schildt");

        Book thinkingInJava = new Book ("Thinking in Java", bruceEckel, 1998);
        Book completeReference = new Book ("Java: The Complete Reference", herbertSchildt, 2000);

        System.out.println(thinkingInJava.getTitle() + printSeparator() + thinkingInJava.getAuthor()+ printSeparator() + thinkingInJava.getYear());
        System.out.println(completeReference.getTitle() + printSeparator() + completeReference.getAuthor()+ printSeparator() + completeReference.getYear());

        completeReference.setYear(2004);
        System.out.println(completeReference.getTitle() + printSeparator() + completeReference.getAuthor()+ printSeparator() + completeReference.getYear());

    }
}
