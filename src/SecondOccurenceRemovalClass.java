import java.util.ArrayList;
import java.util.List;

public class SecondOccurenceRemovalClass {
    public static void main(String[] args) {
        String str = "A bird in the air";
        List<Character> characterList = new ArrayList<>();
        for(char ch: str.toCharArray()){
            characterList.add(ch);
        }
        System.out.println("List before removal " + characterList);
        for(int i = 0; i < characterList.size(); i ++){
            for(int j = i + 1; j < characterList.size(); j ++){
                if(characterList.get(i).toString().equalsIgnoreCase(characterList.get(j).toString())){
                    characterList.remove(j);
                }
            }
        }
        System.out.println("List after removal " +characterList);
    }
}
