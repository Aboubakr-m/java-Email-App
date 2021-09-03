package emailapp;

public class EmailApp {
    public static void main (String[] args){
        Email em1 = new Email("firstName", "lastMame");
        System.out.println(em1.showInfo());
    }
}
