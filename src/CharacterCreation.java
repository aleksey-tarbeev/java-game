import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterCreation {
    private JFrame frame;
    private JTextField nameField;
    private JComboBox<String> classSelector;
    private JButton createButton;

    public CharacterCreation() {
        // Создание окна
        frame = new JFrame("Создание Персонажа");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        // Поле для ввода имени
        frame.add(new JLabel("Имя:"));
        nameField = new JTextField();
        frame.add(nameField);

        // Выпадающий список для выбора класса
        frame.add(new JLabel("Раса:"));
        String[] classes = {"Человек", "Эльф", "Орк"};
        classSelector = new JComboBox<>(classes);
        frame.add(classSelector);

        // Кнопка для создания персонажа
        createButton = new JButton("Создать");
        frame.add(createButton);

        // Обработчик нажатия кнопки
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String characterClass = (String) classSelector.getSelectedItem();
                if (characterClass == "Человек") {
                    Human player = new Human(name);
                } else if (characterClass == "Орк") {
                    Orc player = new Orc(name);
                } else if (characterClass == "Эльф") {  
                    Elf player = new Elf(name);
                }
                JOptionPane.showMessageDialog(frame, "Персонаж " + name + " рассы " + characterClass + " создан!");
            }
        });

        // Отображение окна
        frame.setVisible(true);
    }
}
