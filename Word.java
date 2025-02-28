import java.util.List;
import java.util.ArrayList;

public class Word
{
	private String word;
	private static final String VOWELS = "AEIOUaeiou";   //static means only one


	public Word()
	{
		word = "";
	}

	public Word(String newWord)
	{
		setWord(newWord);
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{
		int count = 0;

		for(int i = 0; i < word.length(); i++)
		{
			if(VOWELS.indexOf(word.substring(i, i + 1)) > - 1)
			{
				count++;
			}
		}

		return count;
	}

	public int getLength()
	{
		return(word.length());
	}

	public String toString()
	{
	   return word;
	}
}