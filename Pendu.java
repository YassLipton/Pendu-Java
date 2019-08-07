package test2;

import java.util.Scanner;

public class Dele {
	
	public static char v[] = {'_', '_', '_', '_', '_'};
	
	public static char t[] = { 't', 'a', 'b', 'l', 'e' };
	
	public static Scanner input = new Scanner(System.in);
	
	public static char c = input.next().charAt(0);
	
	public static boolean juste[] = {false, false, false, false, false};
	
	public static int error = 0;
	
	public static void Test() {
		
		if (c == t[0]) {
			juste[0] = true;
			//System.out.println(t[0]);
			v[0]= t[0];
			Fe();
		}
		else if (c == t[1]) {
			juste[1] = true;
			//System.out.print(t[1]);
			v[1]= t[1];
			Fe();
		}
		else if (c == t[2]) {
			juste[2] = true;
			//System.out.print(t[2]);
			v[2]= t[2];
			Fe();
		}
		else if (c == t[3]) {
			juste[3] = true;
			//System.out.print(t[3]);
			v[3]= t[3];
			Fe();
		}
		else if (c == t[4]) {
			juste[4] = true;
			//System.out.print(t[4]);
			v[4]= t[4];
			Fe();
		}
		else {
			error++;
			System.out.print("Nombre d'erreur : " + error + "\r\n");
			Fe();
		}
	  }
	
public static void Fe() {
		if (juste[0] == true && juste[1] == true && juste[2] == true && juste[3] == true && juste[4] == true) {
			System.out.println("Gagné !");
			System.exit(0);
		}
		if (error >= 5) {
			System.out.println("Perdu !");
			System.exit(0);
		}
	  }

	public static void main(String[] args) {
		int[] vars = new int[10];

		for(int i = 0; i < vars.length; i++) {
			c = input.next().charAt(0);
			Test();
			System.out.println(v);
			if (i == 15) {
				System.out.print("Perdu !");
			}
		}
	}

}
