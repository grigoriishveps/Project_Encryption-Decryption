import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = scanner.nextInt();
        for(char x : s.toCharArray()){
            if('a'<=x && x<='z') {
                int a = (x - 'a' + l) % 26;
                System.out.print((char) (a + 'a'));
            }
            else
                System.out.print(x);
        }
    }
}
