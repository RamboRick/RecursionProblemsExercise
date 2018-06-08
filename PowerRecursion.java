package basic08;
//Using recursion to solve a^b
import java.util.*;
//time complexity: O(logn)
//space complexity:O(logn)
public class PowerRecursion {
    public long power(int a, int b ){
        if(a==0){
            return 0;
        }
        if(b == 0){
            return 1;
        }
        Long halfPower = power(a, b/2);
        return a%2 == 0 ? halfPower*halfPower : halfPower*halfPower*a;
    }
}
