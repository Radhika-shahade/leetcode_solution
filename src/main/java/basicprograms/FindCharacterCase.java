package basicprograms;

//The input character is lowercase, so our answer is 0.
//The input character is uppercase, so our answer is 1.
//The input character is not an alphabet, so our answer is -1.

public class FindCharacterCase {
    public int findCharacterCase(char ch)
    {
        int a=ch;
        if(a>=65 && a<=96)
        {
            return 1;
        }
        if(a>=97 && a<=122)
        {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        FindCharacterCase ch= new FindCharacterCase();
        System.out.println(ch.findCharacterCase('4'));
    }

}
