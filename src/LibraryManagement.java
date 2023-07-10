class Library_tem{
   private int id;
    String title;
    int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void book_details(){
    System.out.println(id+" "+title+" "+year);
}
}
class book extends Library_tem{
    String author;
    public void author_det(){
        System.out.println("the name of author is :"+author);

    }
}

class Magazine extends Library_tem{
    int issue;
    public void issue(){
        System.out.println("the issue level is :"+issue);

    }

}
public class LibraryManagement {
    public static void main(String[] args) {

        Magazine magazine=new Magazine();
        book b=new book();
        //magazine.id=101;
        magazine.setId(101);
        magazine.title="Java Programming";
        magazine.year=2010;
        magazine.issue=0;
        b.author="CV Raman";
        magazine.book_details();
        b.author_det();
        magazine.issue();
       // b.author_det();

    }
}