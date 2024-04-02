public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH","12345");
        Teacher t2 = new Teacher("Graham","FZK","5678");
        Teacher t3 = new Teacher("Külyutmaz","BIO","1468");

        Course tarih = new Course("Tarih", "TRH","101");

        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","FZK","101");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","BIO","101");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","1",tarih,fizik,biyo);
        s1.addBulkExamNote(100,70,80);
        s1.printNote();




    }
}