import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

    public static void main(String[] args) {

        System.out.println(containsNearbyDuplicateHashMap(new int[]{1,2,3,1,2,3}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        int e = 0, d = e + 1;

        while (true) {

            if(Math.abs(e - d) > k || d >= nums.length){

                e ++;
                d = e + 1;

                if(e >= nums.length -1 ){
                    return false;
                }
            }

            if( nums[e] == nums[d]){

                if(Math.abs(e - d) <= k){
                    return true;
                }

            }

            d ++;


        }

    }

    public static boolean containsNearbyDuplicateHashMap(int[] nums, int k) {
        Map<Integer,Integer> book = new HashMap<>();


        for(int i = 0, valor; i< nums.length; i++){
            valor = nums[i];
            if(book.containsKey(valor) && (i - book.get(valor)) <= k){
                return true;
            }
            book.put(valor, i);
        }

        return false;

    }
}
