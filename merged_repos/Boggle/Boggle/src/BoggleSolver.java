import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BoggleSolver
{
	// Initializes the data structure using the given array of strings as the dictionary.
	// (You can assume each word in the dictionary contains only the uppercase letters A - Z.)
	
	HashSet<String> words = new HashSet<String>();
	Iterable<String> wordy;
	boolean[][] isVisted;
	
	public BoggleSolver(String dictionaryName)
	{
		File myObj = new File(dictionaryName);
	    Scanner myReader;
		try {
			myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
			       String data = myReader.nextLine();
			       words.add(data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

	// Returns the set of all valid words in the given Boggle board, as an Iterable object
	public Iterable<String> getAllValidWords(BoggleBoard board)
	{
		ArrayList<String> str = new ArrayList<String>();
		isVisted = new boolean[board.rows()][board.cols()];
		getAllValidWordsHelper(board, "", 0,0, str);
		return str;
	}
	public void getAllValidWordsHelper(BoggleBoard board, String curr, int X, int Y, ArrayList<String> str){
		if(X > board.cols()) {return ;}
		if(Y > board.rows()) {return ;}
		if(X < board.cols()) {return ;}
		if(Y < board.rows()) {return ;}
		if(isVisted[X][Y] == true) {
			return ;
		}
		if(words.contains(curr)) {
			str.add(curr);
		}
		isVisted[X][Y] = true;
		getAllValidWordsHelper(board, curr, X + 1,Y, str); 
		getAllValidWordsHelper(board, curr, X,Y + 1 , str);
		getAllValidWordsHelper(board, curr, X + 1,Y + 1, str);
		getAllValidWordsHelper(board, curr, X - 1,Y - 1, str);
		getAllValidWordsHelper(board, curr, X - 1,Y , str);
		getAllValidWordsHelper(board, curr, X,Y - 1, str);
		isVisted[X][Y] = false;
		
	}
	
	public static <T> Iterable<T> 
    getIterableFromIterator(Iterator<T> iterator) 
    { 
        return new Iterable<T>() { 
            @Override
            public Iterator<T> iterator() 
            { 
                return iterator; 
            } 
        }; 
    } 
	

	// Returns the score of the given word if it is in the dictionary, zero otherwise.
	// (You can assume the word contains only the uppercase letters A - Z.)
	public int scoreOf(String word)
	{
		if(word.length() >= 0 && word.length() <= 2) {
			return 0;
		}
		if(word.length() >= 3 && word.length() <= 4) {
			return 1;
		}
		if(word.length() == 5) {
			return 2;
		}
		if(word.length() == 6) {
			return 3;
		}
		if(word.length() == 7) {
			return 5;
		}
		if(word.length() >= 8) {
			return 11;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("WORKING");

		final String PATH   = "./data/";
		BoggleBoard  board  = new BoggleBoard(PATH + "board-q.txt");
		BoggleSolver solver = new BoggleSolver(PATH + "dictionary-algs4.txt");

		int totalPoints = 0;

		for (String s : solver.getAllValidWords(board)) {
			System.out.println(s);
			System.out.println(s + ", points = " + solver.scoreOf(s));
			totalPoints += solver.scoreOf(s);
		}

		System.out.println("Score = " + totalPoints); //should print 84

		//new BoggleGame(4, 4);
	}

}
