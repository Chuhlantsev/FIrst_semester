package lr6.Task3;

public class Task3 {
    static void Method(int[] nums){
        int max = nums[0], min = nums[0], score = nums[0];
        float mid;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            } if (nums[i] < min){
                min = nums[i];
            }
            score += nums[i];
        }
        mid = (float) score / nums.length;
        System.out.println("\nmaximum = " + max);
        System.out.println("minimum = " + min);
        System.out.println("average = " + mid);
    }
}
