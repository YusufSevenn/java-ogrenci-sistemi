public class Course {
    Teacher teacher;
    String name;
    String prefix;
    String code;
    int note;

    Course(String name, String prefix, String code){
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacher();
        }
        else{
            System.out.println("ogretmen ve ders uyusmuyor");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }

}
