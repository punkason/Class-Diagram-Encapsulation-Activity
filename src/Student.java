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
        if (grade > 'A' && grade <='F'){ //A cannot be upgrade and other than ABCDEF is ignored
            setGrade(--grade);
        }
    }

    public void setDowngrade() {
        if (grade >= 'A' && grade <'F'){ //F cannot be downgrade and other than ABCDEF is ignored
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
