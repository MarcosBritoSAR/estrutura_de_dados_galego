public class ContainsNearbyDuplicate {
    public static void main(String[] args) {}

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int e = 0, d = nums.length -1;

        while(e != nums.length -1){

            if(e <= d){
                e++;
                d = nums.length -1;
            }

            if(nums[e] == nums[d]){
                if(Math.abs(e-d) <= k){
                    return true;
                }
            }

            d --;

        }

        return false;

    }
}
}
