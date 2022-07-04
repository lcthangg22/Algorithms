package Practice;

public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] a) {
//        int n = a.length;
//        boolean bIsIncreasing = true;
//
//        if (n<3) {
//            return false;
//        }
//        for (int i = 0; (i+1) < n; i++) {
//            int j = i+1; // Phần tử phía sau
//            if (a[i] > a[j]) { // Dãy giảm
//                if (bIsIncreasing == false) {
//                    // normal
//                } else
//                { // bIsIncreasing = true
//                    if (i == 0) {
//                        return false;
//                    }
//                    bIsIncreasing = false;
//                }
//            } else if (a[i] < a[j]) { // Dãy tăng
//                if (bIsIncreasing == true) {
//                    // normal
//                } else { // bIsIncreasing == false : Dãy đang xét là dãy giảm
//                    return false;
//                }
//            } else { // a[i] = a[j]
//                return false;
//            }
//        }
//
//        if (bIsIncreasing == false) // Dãy đang xết cuối cùng là dãy giảm
//        {
//            return true;
//        }
//        return false;
//        int n = a.length;
//        if(n<3) return false;
//        int count = 0;
//        int k=0;
//        for (int i = 1; i < n-1; i++){
//            if(a[i] > a[i+1] && a[i-1] < a[i]){
//                count++;
//                k++;
//            }else if(a[i] <= a[i+1] && a[i-1] >= a[i]){
//                count--;
//                k++;
//            }
//        }
//        return count == 1 && k == count;
        int n=a.length;
        if(n==1 || a[0]>a[1])return false;
        boolean x=false;
        for(int i=0;i+1<n;i++){
            int j=i+1;
            if(a[i]>a[j]){
                x=true;
            }
            else if(a[i]<a[j]){
                if(x==true)
                    return false;
            }
            else{
                return false;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
}
