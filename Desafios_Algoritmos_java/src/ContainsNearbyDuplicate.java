public class ContainsNearbyDuplicate {

    public static void main(String[] args) {

        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        int e = 0,d = nums.length -1, alvo = nums[e] , meio;

        int old_e = e;


        while (e != nums.length - 1) {


            meio = e + ((e - d) / 2); //Meu problema está aqui, ele não calcula o meior entre os valores corretament =


            if(nums[meio] == alvo && e != meio) {

                if(Math.abs(e-d) <= k){

                    return true;

                }

            }

            if(nums[meio] < alvo){

                e = meio + 1;

            }else if(nums[meio] > alvo){

                d = meio - 1;

            }

            if(e == meio){

                e = old_e + 1;
                alvo = nums[e];
                old_e++;
                d = nums.length -1;

            }


        }

        return false;

    }

}
