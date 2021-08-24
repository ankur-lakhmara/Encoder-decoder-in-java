package Basic_project;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class Encoder_decoder {
    public static void main(String[]args){
        System.out.println("Please enter your message");
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();
        String encodedInput = Base64.getEncoder().encodeToString(input.getBytes(StandardCharsets.UTF_8));
        System.out.println("Encode: "+encodedInput);

        System.out.println(" do you wanna decode this enter Y or N");
        char response = sc.next().charAt(0);

        if(response=='Y'){
            byte[] output = Base64.getDecoder().decode(encodedInput);
            String decodedResult = new String(output);
            System.out.println("Decoded Output: "+decodedResult);
        }
        else{
            System.out.println("Thanks for using Encoder");
        }
    }
}
