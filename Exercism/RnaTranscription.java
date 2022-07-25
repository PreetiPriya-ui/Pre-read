import java.util.*;
class RnaTranscription {

    public static final Map<Character,Character> complements = new HashMap<Character,Character>(){{put('C','G');put('G','C');put('T','A');put('A','U');}};



    String transcribe(String dnaStrand) {
        String rnaTranscription = "";
        for(char ch: dnaStrand.toCharArray()){
            rnaTranscription+=complements.get(ch);
        }
        return rnaTranscription;

    }
    public static void main(String [] args)
    {
        RnaTranscription rnaTranscription = new RnaTranscription();
        System.out.println(rnaTranscription.transcribe("TGCA"));
    }


}
