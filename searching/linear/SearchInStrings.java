package searching.linear;

public class SearchInStrings {
    public static void main(String[] args) {

        String str = "Priyanshu";
        char ch = 'P';

        System.out.println(searchInStrings(str,ch));

    }
    static boolean searchInStrings(String str, char target){

        for(char ch: str.toCharArray()){                    //using for each loop (enhanced for)
            if (ch == target){
                return true;
            }
        }
//        return false;

        for (int i = 0; i < str.length() ; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
