public class CheckSorted{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int left=0;
        int right=1;
        boolean accending=true;
        boolean deccending=true;
        while (left<arr.length) {
            if(arr[left]>arr[right]){
                accending=false;
                break;
            }
            if(arr[left]<arr[right]){
                deccending=false;
                break;
            }
            
        }
        if(accending){
            System.out.println("accending sorted");
        }
        else{
            System.out.println("decending sorted");
        }
    
    }
}