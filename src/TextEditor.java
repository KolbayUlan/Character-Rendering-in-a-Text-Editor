import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<CharacterPosition> characters = new ArrayList<>();
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }

    private class CharacterPosition {
        Character character;
        int x;
        int y;

        public CharacterPosition(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }
    }

    public void insertCharacter(char value, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(value, font, size);
        characters.add(new CharacterPosition(character, x, y));
    }

    public void renderDocument() {
        for (CharacterPosition cp : characters) {
            cp.character.render(cp.x, cp.y);
        }
    }
}
