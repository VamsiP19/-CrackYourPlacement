class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int i = 0;
        while(i<arr.length) {
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct] ) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else {
                i++;
            }
        }
        for(int j =0; j < arr.length; j++) {
            if(arr[j] != j+1) {
                return j+1;
            }
        }
        return arr.length+1;
    }
}
