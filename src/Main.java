public class Main {

    public static void main(String[] args){

        Student sally = new Student("Sally", 'E', 1);
        Student tracy = new Student("Tracy", 'A', 2);
        System.out.println("My name is " + sally.getName() + ". My grade is " + sally.getGrade()+".");
        sally.setUpgrade();
        System.out.println(sally.getName() + " appealed the grade. New grade is " + sally.getGrade()+".");
        System.out.println("My name is " + tracy.getName() + ". My grade is " + tracy.getGrade()+".");
        tracy.setDowngrade();
        System.out.println(tracy.getName() + " appealed the grade. New grade is " + tracy.getGrade()+".");
    }
}
