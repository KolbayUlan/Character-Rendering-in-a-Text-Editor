import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<String, Character> characterPool = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + font + size;
        Character character = characterPool.get(key);

        if (character == null) {
            character = new Character(value, font, size);
            characterPool.put(key, character);
        }
        return character;
    }

    public int getCharacterPoolSize() {
        return characterPool.size();
    }
}
