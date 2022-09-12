package two_sum;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println("Welcome to Two sum solution");
        int data[]= {2,7,10,3,3};
        System.out.println("Enter the target value");
        int target = new Scanner(System.in).nextInt();
        findIndices(data,target);
    }
    private static void findIndices(int[] data, int target) {
        for(int i = 0 ; i <data.length-1; i++){
            for(int j=i+1;j<data.length-1;j++){
                if(data[i]+ data[j] == target){
                    System.out.println("Indices of tagrget is "+ i + "---"+ j);
                    break;
                }
            }
        }
    }
}
