package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV5 {

    public static void main(String[] args) {

        //숫자사용필터
        List<Integer>numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer>evenNumbers=GenericFilter.filter(numbers,n->n%2==0);
        List<Integer>oddNumbers=GenericFilter.filter(numbers,n->n%2==1);
        System.out.println("oddNumbers = " + oddNumbers);
        System.out.println("evenNumbers = " + evenNumbers);


        


    }

}
