import javax.swing.*;
import java.awt.event.*;

public class CharacterCreationUI extends JFrame {
    private JComboBox<String> raceComboBox;
    private JTextField nameTextField;

    public CharacterCreationUI() {
        setTitle("Создание персонажа");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel nameLabel = new JLabel("Введите имя:");
        nameTextField = new JTextField(15);
        JLabel raceLabel = new JLabel("Выберите расу:");
        String[] races = {"Орк", "Эльф", "Человек", "Гном"};
        raceComboBox = new JComboBox<>(races);
        JButton createButton = new JButton("Создать");

        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String selectedRace = (String) raceComboBox.getSelectedItem();
                if (!name.isEmpty()) {
                    // Создание персонажа
                    Character character = createCharacter(name, selectedRace);
                    // Переход в игровое окно
                    GameWindow gameWindow = new GameWindow(character);
                    gameWindow.setVisible(true);
                    dispose(); // Закрытие окна создания персонажа
                } else {
                    JOptionPane.showMessageDialog(CharacterCreationUI.this, "Введите имя пероснажа.", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(raceLabel);
        panel.add(raceComboBox);
        panel.add(createButton);

        add(panel);
    }

    private Character createCharacter(String name, String race) {
        // В зависимости от выбранной расы, создать экземпляр соответствующего класса персонажа
        switch (race) {
            case "Орк":
                return new Orc(name);
            case "Эльф":
                return new Elf(name);
            case "Человек":
                return new Human(name);
            case "Гном":
                return new Dwarf(name);
            default:
                return null;
        }
    }
}