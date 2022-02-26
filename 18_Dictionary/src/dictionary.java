import java.util.Collection;
import java.util.HashMap;

public class dictionary {
    public static void main(String[] args) {
        HashMap<String, String> wordList = new HashMap<String, String>();
        addAWord("Hello", "Hallo", wordList);
        addAWord("New", "Neu", wordList);
       // addAWord("English", "Deutsch", wordList);


        System.out.println(search("Neu", wordList));

    }

    public static void addAWord(String englishWord, String germanWord, HashMap wholeList) {
        wholeList.put(englishWord, germanWord);
    }

    public static String search(String englishOrGermanWord, HashMap wholeList) {
        String english = null;
        String german = null;
        String translation = null;

//German Word
        if (wholeList.containsValue(englishOrGermanWord)) {
            german = englishOrGermanWord;

            for (Object i : wholeList.keySet()) {
                if (wholeList.get(i).equals(englishOrGermanWord)){
                    english = (String)i;
                }
            }

            System.out.println("deutsches Wort gefunden");

//English Word
        } else if (wholeList.containsKey(englishOrGermanWord)) {
            english = englishOrGermanWord;
            german = (String) wholeList.get(englishOrGermanWord);
            System.out.println("englisches Wort gefunden");


        } else {
            translation = "Keine Übersetzung gefunden!";
        }


        if (!(english == null && german == null)) {
            translation = "Das Englische Wort heißt: " + english + " und das Deutsche Wort heißt: " + german;
        }

        return translation;
    }
}
