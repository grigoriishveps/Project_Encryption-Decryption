import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String com = "dec", s ;
        int l;
        if (args.length == 2 && args[0].equals("-mode"))
            com = args[1];
        if (args.length <= 2) {
            s = scanner.nextLine();
            l = scanner.nextInt();
        }
        else if(args.length == 4) {
            s = args[1];
            l = Integer.parseInt(args[3]);
        }
        else{
            s = args[3];
            l = Integer.parseInt(args[5]);
        }
        for(char x : s.toCharArray()){
                int a;
                if(com.equals("enc"))
                    a = (x + l) ;
                else
                    a = ((x  - l));
                System.out.print((char) (a ));
            }
        }

}
