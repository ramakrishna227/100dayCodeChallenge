package sprint2024.day1;

//Bubble sort
class SortingDay1{
    public static void main(String[] args){
//        int[] arr ={64,34,25,12,22,11,90};
        int[] arr ={1,2,3,4,5};
        boolean swapped=false; //To exit loop if array is already sorted
        for(int i=0; i<arr.length-1;i++){
            swapped=false;
            for(int j=0;j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            printArray(arr);
            if(!swapped){
                break;
            }
        }
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}