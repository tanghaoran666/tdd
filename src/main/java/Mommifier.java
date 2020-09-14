public class Mommifier {
    public String convert(String strings) {
        int vowelsLength = 0;
        String vowels = "aeiou";
        for(int i=0;i<strings.length();i++){
            if(vowels.contains(strings.substring(i,i+1))){
                vowelsLength++;
            };
        }
        System.out.println("vowelsLength====" + vowelsLength);
        if(vowelsLength>strings.length()*0.3){
            StringBuffer result = new StringBuffer(strings);
            for(int i=strings.length()-1;i>0;i--){
                if(vowels.contains(strings.substring(i,i+1))&&vowels.contains(strings.substring(i-1,i))){
                    result.insert(i,"mommy");
                };
            }
            System.out.println("StringBuffer=====" + result);
            return  result.toString();
        }else return strings;




    }
}
