import java.util.Scanner;
public class While1 {
	public static void main(String[]args){
		
		boolean running =true;
		int counter = 0;
		String jawab ;
		Scanner scan = new Scanner(System.in);
		while(running);{
			System.out.println("apakah anda ingin keluar?");
			System.out.print("jawab(ya/tidak)");
			jawab = scan.Nextline();
		IF(jawab.equalsignorecase("ya"));{
		running = false;
			}
		counter ++;
		}
		System.out.println("anda sudah melakukan perulangan sebanyak"+counter+"kali");
	}
}