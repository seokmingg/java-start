package construct;

public class MemberInit {
    String name;
    int age;
    int grade;



    MemberInit(String name, int age){
         this(name, age, 1);
        System.out.println("생성자호출1"+ name+", "+ age);
    }

    MemberInit(String name, int age, int grade){
        System.out.println("생성자호출2"+ name+", "+ age +", "+ grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    }

}
