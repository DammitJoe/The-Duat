import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Origin {

	public static void main(String[] args) throws Exception {
		
		
		
		Scanner in = new Scanner(new File("C:\\\\Users\\\\Josep\\\\Documents\\\\text.txt\\"));
		
		List<String> stuff = new ArrayList<String>();
		

		while (in.hasNextLine()) {
			stuff.add(in.nextLine());
			
		}
		
		for(int i = 0; i < stuff.size(); i++) {
			System.out.println(stuff.get(i));
		}
		in.close();
	}
}
