package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int az =0;
        az=az+1;
        System.out.println("az="+az);
        az=az+1;
        System.out.println("az="+az);


        //증감연산자
        ++az;
        System.out.println("az="+az);
        ++az;
        System.out.println("az="+az);
        --az;
        System.out.println("az="+az);

        //전위증감연산자
        int a=1;
        int b=0;

        b=++a; //a의값을 먼저 증가시키고 ,그결과를 b에대입
        System.out.println("a    = " + a +",b    = " + b   );



        //전위증감연산자
         a=1;
         b=0;

        b=a++; //a의값을 먼저 증가시키고 ,그결과를 b에대입
        System.out.println("a    = " + a +",b    = " + b   );
    }
}
