import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        int b= scanner.nextInt();
        System.out.println(occurence(array,b));
    }

    static int occurence(int[] array, int b) {
        int counter=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==b){
                counter++;
            }
        }
        return counter;
    }

}
