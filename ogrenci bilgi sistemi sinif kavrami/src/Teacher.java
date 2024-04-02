public class Teacher {
    String name;
    String branch;
    String phNo;

    Teacher(String name, String branch, String phNo){
        this.name = name;
        this.branch = branch;
        this.phNo = phNo;
    }

    void print(){
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
        System.out.println("phNo : " + this.phNo);
    }

}
