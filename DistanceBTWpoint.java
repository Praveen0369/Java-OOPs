package distanceBTWpointspack;
import java.io.*;

public class DistanceBTWpoint {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Cordinates Of A :"+"as 'x_1 y_1'");
		String coordA=br.readLine();
		System.out.println("Enter The Cordinates Of B :"+"as 'x_2 y_2'");
		String coordB=br.readLine();
		String [] parts=coordA.split(" ");
		int X1=Integer.parseInt(parts[0]);
		int Y1=Integer.parseInt(parts[1]);
		String [] part=coordB.split(" ");
		int X2=Integer.parseInt(part[0]);
		int Y2=Integer.parseInt(part[1]);
		double e=(X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1);
		double dist=Math.sqrt(e);
		System.out.println(dist);
	}

}
