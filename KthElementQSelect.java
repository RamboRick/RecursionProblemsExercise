package basic08;
// kth Element using quick select
import java.util.*;
public class KthElementQSelect {
    public int[] ktheEle(int[] array, int k){
        helper(array, 0, array.length -1 , k);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = array[i];
        }
        return res;
    }
    private void helper(int[] array, int left, int right, int k){
        if(left >= right){
            return;
        }//base case
        int pivot = left + new Random().nextInt(right - left +1 );
        swap(array, pivot, right);
        int i = left;
        int j = right -1;
        while(i <=j) {
            if(array[i] < array[right] ){
                i++;
            }else {
                swap(array, i, j);
                j--;
            }
        }
        swap(array,i,right);
        if(i < k-1){
            helper(array,i+1, right,  k);
        }else if(i > k-1){
            helper(array, left, i-1, k);
        }
    }
    private void swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
