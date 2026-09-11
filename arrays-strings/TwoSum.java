public class TwoSum {

    public static void twoSum(int nums[],int target){
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    System.out.println(i+" "+j);

                }
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        int target = 9;
        twoSum(nums,target);
    }
}