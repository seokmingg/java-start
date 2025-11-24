package construct;

public class ConstructMain {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit("홍길동", 20, 3);
        MemberInit member2 = new MemberInit("김철수", 22, 4);
        MemberInit member3 = new MemberInit("김길동", 24);


        MemberInit[] members = {member1, member2,member3};
        for (MemberInit member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 학년: " + member.grade);
        }
    }
}
