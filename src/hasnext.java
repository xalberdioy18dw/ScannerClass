import java.util.Scanner;
public class hasnext {

	public static void main(String[] args) {
		String str = "10 20 30  40    50    60 70";
        int i = 0;
        
        Scanner instr = new Scanner(str);
        
        while(instr.hasNextInt())
        {
            i = instr.nextInt();
            System.out.println("Integer i = "+i);
        }
        instr.close();
    }
}

