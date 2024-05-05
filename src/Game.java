import javax.swing.SwingUtilities;

public class Game {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CharacterCreationUI ui = new CharacterCreationUI();
                ui.setVisible(true);
            }
        });
    }

}
