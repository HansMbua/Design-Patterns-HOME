import java.util.Arrays;

public class toCamelCase {

    private String thewords;

    public toCamelCase() {


    }


    public String getWords() {
        return thewords;
    }
    //"the-stealth-warrior" gets converted to "theStealthWarrior"
    public void setWords(String words) {
        // put the sentence into words
        String sentence  = "";
        //replace the "-" with space
        // capitalize the first letter of the word
        if (words.contains("-")){
         sentence =  words.replace("-"," ");
        }
       String[] theSentence = sentence.split(" ",3);

        String secondWord = theSentence[1].substring(0,1).toUpperCase();
        String thirdWord = theSentence[2].substring(0,1).toUpperCase();

        String res =theSentence[0]+secondWord + theSentence[1].substring(1) + thirdWord + theSentence[2].substring(1);
         thewords = res;

    }
}
