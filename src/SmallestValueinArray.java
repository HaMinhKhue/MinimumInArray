import java.util.Scanner;
public class SmallestValueinArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size=scanner.nextInt();
        while (size<0){
            System.out.print("Enter size again: ");
            size=scanner.nextInt();
        }
        int[]array=new int[size];
        int min=0;
        for(int i=0;i<size;i++){
            System.out.print("Enter array ["+i+"]: ");
            array[i]=scanner.nextInt();
            min=array[0];
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("The minimum of array is "+min);
    }
}
