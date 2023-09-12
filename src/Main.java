public class Main {

}

// 2 pointer
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}




//brute force O(n^2).
//class Solution {
//    public int maxArea(int[] height) {
//        int maxStorage = 0;
//        for(int i = 0; i <height.length-1; i++){
//            int j = i+1;
//            while (j<height.length){
//                int temp = Math.min(height[i],height[j]) * (j-i);
//                if (temp > maxStorage){
//                    maxStorage = temp;
//                }
//                j++;
//            }
//        }
//        return maxStorage;
//    }
//}