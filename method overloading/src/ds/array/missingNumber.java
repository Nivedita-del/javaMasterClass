package ds.array;

public class missingNumber {
    public static int missingNumber(int[] arr){
        int n=arr.length+1;
        int sum = n*(n+1)/2;
        int count=0;
        for (int i=0; i< arr.length; i++){
            count += arr[i];
        }
        int missingNumber = sum-count;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr1={4,5,6,7,8,1};
        int[] arr2={5,4,6,7,2,1,3};
        int name = missingNumber(arr1);
        int name2 = missingNumber(arr2);
        System.out.println(name);
        System.out.println(name2);
    }
}
