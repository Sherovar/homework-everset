package src.randomTask;

import java.util.HashMap;
import java.util.Map;

public class UniqeCharacter {

    public static void main(String[] args) {
        UniqeCharacter uniqeCharacter = new UniqeCharacter("Hello Java!");
        uniqeCharacter.calculate();
        System.out.println(uniqeCharacter.getMap());
    }
    private HashMap<Character, Integer> map;
    private String text;

    public UniqeCharacter(String text) {
        this.text = text;
        this.map = new HashMap<>();
    }

    public HashMap<Character, Integer> getMap() {
        return map;
    }

    public void setMap(HashMap<Character, Integer> map) {
        this.map = map;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void calculate(){
        for (int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))){
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            } else {
                map.put(text.charAt(i), 1);
            }
        }
    }
}
