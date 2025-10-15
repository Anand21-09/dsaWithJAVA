public class searchRotatedArray {
    public static void main(String[]args){
        int arr[] = {2,3,4,5,7,0,1,2};
        int result = binarySearch(arr,0);
        System.out.println("result = "+result);
    }
    public static int binarySearch(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==target){
                ans = mid;
                break;
            }
            if(arr[start]<=arr[mid]){
            if(arr[start]<=target&&target<=arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        else{
            if(arr[mid]<=target && target<=arr[end]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
    }
    return ans;
}
}
