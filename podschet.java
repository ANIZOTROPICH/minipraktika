
import java.util.Scanner;
 
public class podschet {
 
        public static void main(String[] args) {
 
            Scanner sc = new Scanner(System.in);
            System.out.println("Vvedite stroku");
            String stroka = sc.nextLine();
            String[] Mas=stroka.split(" ");
            System.out.println(Mas.length);
            
        }}