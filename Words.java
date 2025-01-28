import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{
		wordList = new ArrayList<Word>();
	}

	public Words(String s)
	{
		wordList = new ArrayList<Word>();

		setWords(s);
	}

	public void setWords(String s)
	{
		wordList.clear();

		//Create a Scanner for the list of words in the string "s"
		Scanner breaker = new Scanner(s);

		//While loop that breaks up the string into multiple words
		while(breaker.hasNext())
		{
			wordList.add(new Word(breaker.next()));
		}
	}

	public int countWordsWithXChars(int size)
	{
		int count = 0;

		for(Word i: wordList)
		{
			if(i.getLength() == size)
			{
				count++;
			}
		}

		return count;
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;

		for(int i = wordList.size() - 1; i >= 0; i--)
		{

			if(wordList.get(i).getLength() == size)
			{
				vowelCount += wordList.get(i).getNumVowels();
				wordList.remove(i);
			}
		}

		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count = 0;
		int vowels = 0;

		for(Word i: wordList)
		{
			vowels = i.getNumVowels();
			if(vowels == numVowels)
			{
				count++;
			}
		}


		return count;
	}

	public String toString()
	{
	   return "" + wordList;
	}
}