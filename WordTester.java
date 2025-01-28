public class WordTester
{
    public static void main (String[] args)
    {
        Word word = new Word("word");

        System.out.println(word);
        System.out.println("Num of Vowels = " + word.getNumVowels());
        System.out.println("Length = " + word.getLength());

        word.setWord("newWord");
        System.out.println(word);
        System.out.println("Num of Vowels = " + word.getNumVowels());
        System.out.println("Length = " + word.getLength());


        //More test cases
        Word firstWord = new Word("beetle");
        System.out.println(firstWord);
        System.out.println("Num of Vowels = " + firstWord.getNumVowels());
        System.out.println("Length = " + firstWord.getLength());

        Word secondWord = new Word("juice");
        System.out.println(secondWord);
        System.out.println("Num of Vowels = " + secondWord.getNumVowels());
        System.out.println("Length = " + secondWord.getLength());
    }
}