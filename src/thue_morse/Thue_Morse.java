/**
    * Displays any n-th order Thue-Morse sequence.
    * Based on this reddit daily challenge:
    * http://goo.gl/w7GQDC
    * 
    * WARNING! Long build times for n>20
    * At least 1 min build time for n=19
 */

package thue_morse;
import java.util.Scanner;

/**
 * @author todyerutz@plainintricacy.wordpress.com
 */
public class Thue_Morse {
    
    public static void main(String[] args) {
        
        System.out.println("Please enter the order of the sequence you wish to generate:");
        Scanner input = new Scanner(System.in);
        int in = (int) input.nextInt();
        input.close();
        System.out.println();
        System.out.println("Thue-Morse sequence of order " + in +":");
        System.out.println();
        System.out.println(calcTM(in, "0"));
        
    }
    
    public static String calcTM(int q, String s){
        while(q>0){
            String temp="";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='0'){
                    temp+="1";
                }
                if(s.charAt(i)=='1'){
                    temp+="0";
                }
            }
            s+=temp;
            q--;
        }
        return s;
    }
    
}
