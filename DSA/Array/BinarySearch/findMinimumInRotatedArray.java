/*   
 Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.
 */


package BinarySearch;
public class findMinimumInRotatedArray{
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4,5,1};
        int index = rotatedArray(nums);
        System.out.println(index);
    }
 public static int rotatedArray(int nums[]){
    int start = 0;
    int end = nums.length - 1;
    int mid = start + (end -start) / 2;
     // If the list has just one element then return that element.
     // if the last element is greater than the first element then there is no
        // rotation.
        // e.g. 1 < 2 < 3 < 4 < 5 < 7. Already sorted array.
        // Hence the smallest element is first element. A[0]
    if(nums.length == 1 || nums[0] < nums[nums.length - 1]){
        return nums[0];
    }
    while(start <= end ){
// if the mid element is lesser than its previous element then mid element is
// the smallest
        mid = start + (end -start) / 2;
        if(mid-1 >= 0 && nums[mid] < nums[mid-1]){
            return nums[mid];
// if the mid element is greater than its next element then mid+1 element is the
// smallest
// This point would be the point of change. From higher to lower value.
        }if (mid+1 < nums.length  && nums[mid] > nums[mid + 1]){
            return nums[mid + 1];
// if the mid elements value is greater than the 0th element this means
// the least value is still somewhere to the right as we are still dealing with
// elements
// greater than nums[0]
        }if (nums[0] < nums[mid]){
            start = mid + 1;
        }
// if nums[0] is greater than the mid value then this means the smallest value
// is somewhere to
// the left
        else{
            end = mid - 1;
        }
 }
 return -1;
}
}
// time omplexity is O(log n)