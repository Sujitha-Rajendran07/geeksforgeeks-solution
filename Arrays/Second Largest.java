class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int seclargest = -1;
        for(int num : arr){
            if(num > largest){
                seclargest = largest;
                largest = num;
            }
            else if(num > seclargest && num != largest){
                seclargest = num;
            }
        }
        return seclargest;
    }
}
