public class Student {
    private String name;
    private char grade;
    private int group;
    private String secretNickName;

    public Student(String name, char grade, int group){
        this.setName(name);
        this.setGrade(grade);
        this.setGroup(group);
        secretNickName = "MySecretNickName";
    }

    public char getGrade(){
        return grade;
    }

    public String getName(){
        return name;
    }

    public void setUpgrade(){
        if (grade > 'A' && grade <='F'){ //If the grade is already an A, it cannot be upgraded
            setGrade(--grade);
        }
    }

    public void setDowngrade() {
        if (grade >= 'A' && grade <'F'){ //If the grade is already a F, it cannot be downgraded
            setGrade(++grade);
        }
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
