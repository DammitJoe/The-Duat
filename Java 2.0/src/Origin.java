import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Origin {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		names.push("Joe");
		names.push("Caleb");
		names.push("Sally");
		
		Iterator<String> cycle = names.iterator();
		
		for(String s: names ) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
	}
}
