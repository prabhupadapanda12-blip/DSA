public class RersedArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int left=0;
        int right=arr.length-1;
        int temp;
        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
             left++;
             right--;
        }
        System.out.println("revrse array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
