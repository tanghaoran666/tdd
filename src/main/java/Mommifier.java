public class Mommifier {
    public String convert(String strings) {
        if(isEnoughVowels(strings)){
            StringBuffer result = new StringBuffer(strings);
            insertMommyInContinuousVowels(strings,result);
            return  result.toString();
        }else return strings;

    }

    private boolean isEnoughVowels(String strings) {
        int vowelsLength = 0;
        for(int i=0;i<strings.length();i++){
            if(isVowels(strings, i)){
                vowelsLength++;
            }
        }
        return vowelsLength > strings.length()*0.3;
    }

    private void insertMommyInContinuousVowels(String strings, StringBuffer result) {
        for(int i=strings.length()-1;i>0;i--){
            if(isVowels(strings, i) && isVowels(strings, i -1)){
                result.insert(i,"mommy");
            }
        }

    }

    private boolean isVowels(String strings,  int i) {
        String vowels = "aeiou";
        return vowels.contains(strings.substring(i, i+1));
    }
}
