//-	Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers i.e. 100 97 94 91 88 85 82 79. . . 22 19 16 13 10 7 4 1
package loop;

public class loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i>=0;i--) {
			System.out.println(i);
			i=i-2;
		}
	}

}

