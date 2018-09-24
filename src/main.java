import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * fake shuffle with FIsher Yates to a playlist of songs, seed 0
 */

/**
 * @author Zhijie
 *
 */
public class main {
	/**
	 * 
	 * @param aList input a list that need to shuffle
	 * @return shuffled playlist
	 */
	static LinkedList<String> fisherYates(LinkedList<String> aList) {
		Random rand = new java.util.Random(0);				//new random generator with seed 20
		
		LinkedList<String> referList = aList;				//a copy of the original list
		int rua = 0;								//random integer value
		for(int i = referList.size()-1; i != 0; i--) {		//loop
			rua = rand.nextInt(i);	//assign random value to rua
			Collections.swap(referList, i, rua);		//swap location
			//newList.add(referList.get(rua));
			//referList.remove(rua);
		}
		return (LinkedList<String>) referList;					
	}
	
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception{
		File file = new File("Playlist.txt");				//read the file
		Scanner input = new Scanner(new FileReader(file));		//scan the file
		BufferedWriter output = new BufferedWriter(new FileWriter("out.txt"));
		LinkedList<String> pl = new LinkedList<String>();					//write strings into a linkedlist
		String song = new String();							
		int saiz = 0;
		
		while(input.hasNextLine())
		{
			song = input.nextLine();
			pl.add(song);
		}
		pl = fisherYates(pl);								//shuffle
		saiz = pl.size();
		
		for(int i =0; i < saiz; i++) {						//test by printin out
			System.out.println(pl.get(i));
			output.write(pl.get(i));
			output.newLine();
		}
		input.close();
		output.close();
	}

}

