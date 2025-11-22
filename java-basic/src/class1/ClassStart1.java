package class1;



public class ClassStart1 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        student1.name     = "학생1";
        student1.age      = 20;
        student1.grade    = 90;

        Student student2 = new Student();
        student2.name     = "학생2";
        student2.age      = 22;
        student2.grade    = 85;


        Student[] students = {  student1, student2};

       for (Student student : students) {
              System.out.println("이름: " + student.name+", 나이: " + student.age + ", 점수: " + student.grade);
       }



    }
}
