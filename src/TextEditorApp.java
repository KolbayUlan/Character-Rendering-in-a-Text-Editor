public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        TextEditor editor = new TextEditor(factory);

        editor.insertCharacter('H', "Arial", 12, 0, 0);
        editor.insertCharacter('e', "Arial", 12, 10, 0);
        editor.insertCharacter('l', "Arial", 12, 20, 0);
        editor.insertCharacter('l', "Arial", 12, 30, 0);  // Reuse 'l'
        editor.insertCharacter('o', "Arial", 12, 40, 0);
        editor.insertCharacter('!', "Arial", 12, 50, 0);
        editor.insertCharacter('e', "Arial", 12, 0, 20);  // Reuse 'H'

        editor.renderDocument();

        System.out.println("\nUnique character objects created: " + factory.getCharacterPoolSize());
    }
}
