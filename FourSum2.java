import java.util.HashMap;

public class FourSum2 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0;j<nums2.length; j++){
                int sum = nums1[i]+nums2[j];
                map.put(sum, map.getOrDefault(sum,0)+1);
            }
        }
        int count = 0;
        for(int k=0;k<nums3.length; k++){
            for(int l=0; l<nums4.length; l++){
                int currSum = nums3[k]+ nums4[l];
                int targetSum =- currSum;
                count+=map.getOrDefault(targetSum,0);
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(args[0]);
        FourSum2 obj = new FourSum2();

        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        int result = obj.fourSumCount(nums1, nums2, nums3, nums4);

        System.out.println("Number of tuples: " + result);
    }
}
