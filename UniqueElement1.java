public class UniqueElement1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,5,3};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            temp=temp^arr[i];

        }
        System.out.println("Unique element in an array : " +temp);
    }
    
}
