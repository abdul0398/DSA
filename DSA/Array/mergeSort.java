public class mergeSort {
    static int[] merge(int[] num, int lo, int hi){
        if(lo == hi){
            int[] br = new int[1];
            br[0] = num[lo];
            return br;
        }
        
        int mid = (lo + hi) / 2;
        int[] fh = merge(num, lo, mid);
        int[] sh = merge(num, mid + 1, hi);
        int [] merges = mergeSoort(fh, sh);
        return merges;

    }

    static int[] mergeSoort(int[] nums1, int[] nums2){
        int[] res = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                res[k] = nums1[i];
                k++;
                i++;
            }else if(nums1[i] > nums2[j]){
                res[k] = nums2[j];
                j++;
                k++;
            }else{
                res[k] = nums1[i];
                i++;
                k++;
            }
        }
       
            while(j < nums2.length){
                res[k++] = nums2[j++];
            }
            while(i < nums1.length){
                res[k++] = nums1[i++];
            }
        
        return res;
    }
    public static void main (String args[]) {
        int[] arr1 = {1,2,3,6,4,5,6,7,42,4,5};
        int[] res = merge(arr1,0,arr1.length - 1);
        for(int i : res){
            System.out.println(i);
        }
        
    }
}

