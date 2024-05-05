import javax.swing.*;

class GameWindow extends JFrame {
    public GameWindow(Character character) {
        setTitle("Game Window");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Имя: " + character.getName() + " Здровье:" + character.getHealth() + " Сила атаки:" +character.getAttakPower());
        panel.add(nameLabel);

        add(panel);
    }
}