public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={10,30,20,40,60,50};
        int max1=arr[0];
        int max2=arr[1];
        if(max1>max2){
            max1=max2;
            max2=max1;
        }
        else{
            max1=max2;
            max2=max1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
                max2=max1;
            }
            else{
                max2=arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
