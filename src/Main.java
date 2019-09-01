import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String com = scanner.nextLine();
        String s = scanner.nextLine();
        int l = scanner.nextInt();
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
