public class LinearSearch {
    static int  Search(int arr[] , int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    
    }
    public static void main (String []args){
int arr[]={12,34,5,6,87,98};
int target=87;
 int result = Search(arr, target);
 if(result!=-1){
    System.out.println("element is found at index:" +result);
 }
 else{
    System.out.println("element not found");
 }
}
}
