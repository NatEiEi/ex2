import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Ex2 {
    public static final int MAX = 5;
    public static void main(String[] args) {
            
        display(sorting(receiveInput()));

    }
    
    public static List<Integer> receiveInput() {
        System.out.println("Welcome to the Application!");
            
        Scanner inp = new Scanner(System.in);
            
        List<Integer> nums = new ArrayList<>();
            
        System.out.println("Enter 5 valid integers in the range [0, 10]");
            
        while(nums.size() < MAX) {
                
            String s = inp.nextLine();

            if (checkType(s)) {

                int num = Integer.parseInt(s);
                
                if (checkRange(num)) {
                    nums.add(num);
                }

            } else continue;


        }
        inp.close();
        return nums;
    }

    public static boolean checkType(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
        return true;
    }

    public static boolean checkRange(int num) {

        if(num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    public static List<Integer> sorting(List<Integer> nums) {
        Collections.sort(nums);
        return nums;
    }

    public static void display(List<Integer> nums){
        for(int num : nums)
            System.out.print(num+" ");
    }
}