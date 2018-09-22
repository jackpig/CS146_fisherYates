import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Zhijie
 *
 */
public class main {
	/**
	 * 
	 * @param aList
	 * @return
	 */
	static LinkedList fisherYates(LinkedList aList) {
		Random rand = new Random(0);
		LinkedList newList = new LinkedList();
		LinkedList referList = aList;	
		int rua = 0;
		for(int i = 0; i < aList.size(); i++) {
			rua = rand.nextInt(referList.size());
			Collections.swap(aList, i, rua);
			//newList.add(referList.get(rua));
			//referList.remove(rua);
		}
		return (LinkedList) aList;
	}
	
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		File file = new File("Playlist.txt");
		Scanner in = new Scanner(new FileReader(file));
		
		LinkedList pl = new LinkedList();
		String song = new String();
		int pointer = 0;
		int saiz = 0;
		
		while(in.hasNextLine())
		{
			song = in.nextLine();
			pl.add(song);
		}
		pl = fisherYates(pl);
		saiz = pl.size();
		
		for(int i =0; i < saiz; i++) {
			System.out.println(pl.get(i));
		}
	}

}

