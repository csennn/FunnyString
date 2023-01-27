import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static String funnyString(String s) {
            
    ArrayList<Integer> liste = new ArrayList<Integer>();
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        int asciiValue = (int) c;
        liste.add(asciiValue);
    }
    
    List<Integer> reversedList = new ArrayList<>(liste);
    
    Collections.reverse(reversedList);
    
    for(int i = 1; i < liste.size(); i++){
        int difference1 = Math.abs(liste.get(i) - liste.get(i-1));
        int difference2 = Math.abs(reversedList.get(i) - reversedList.get(i-1));
        if (difference1 == difference2){
            
        }else{
            return "Not Funny";
        }
    }

    return "Funny";    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.funnyString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
