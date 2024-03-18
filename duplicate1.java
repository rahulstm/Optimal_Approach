public class duplicate1 {
    public static int duplicate(int []arr){
        int n=arr.length;
        int sum=((n-2)*(n-1))/2;
        int sumofallelements=0;
        for(int i=0;i<n;i++){
            sumofallelements+=arr[i];
        }
        return (sumofallelements-sum);
    }
    public static void main(String[] args) {
        int arr[]={0,2,1,2,3,4};
        System.out.println(duplicate(arr));
        
           
        }
    }
    

