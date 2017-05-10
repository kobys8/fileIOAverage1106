/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fileioaverage1106;

/**
 *
 * @author kms080
 */
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class FileIOAverage1106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in;
        int[] nums;
        int num = 0;
        try {
            File f = new File("numbers.txt");
            in = new Scanner(f);
            nums = new int[(int)f.length() - 1];
            int i = 0;
            while(in.hasNext()) {
                nums[i] = in.nextInt();
                i++;
                num++;
            }  
            double total = 0;
            try {
                for(i = 0; i <= nums.length - 1; i++) {
                    total += nums[i]; 
                }
            }
            catch(ArrayIndexOutOfBoundsException a) {
                System.out.print("ERROR: " + a.getMessage());
            }
            System.out.print("The total of these numbers is " + total + ". " + "The average of this sum is " + (total / num) + ".");
        }
        catch(IOException i) {
            System.out.print("ERROR: " + i.getMessage());
        }
    }
}
