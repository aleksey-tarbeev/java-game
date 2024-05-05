import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow {
    private JFrame frame;
    private JTextArea gameTextArea;
    private JButton openInventoryButton;
    private JLabel nameLabel;
    private JLabel healthLabel;
    private JLabel attackPowerLabel;
    private JButton moveButton;

    public GameWindow() {
        // Создание основного окна
        frame = new JFrame("Игровое Окно");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Текстовое поле для игры
        gameTextArea = new JTextArea("Текст игры...");
        frame.add(new JScrollPane(gameTextArea), BorderLayout.CENTER);

        // Панель для вывода информации о персонаже
        JPanel characterInfoPanel = new JPanel();
        characterInfoPanel.setLayout(new BoxLayout(characterInfoPanel, BoxLayout.Y_AXIS));
        nameLabel = new JLabel("Имя: ");
        healthLabel = new JLabel("Здоровье: ");
        attackPowerLabel = new JLabel("Сила Атаки: ");
        characterInfoPanel.add(nameLabel);
        characterInfoPanel.add(healthLabel);
        characterInfoPanel.add(attackPowerLabel);
        frame.add(characterInfoPanel, BorderLayout.WEST);

        // Кнопка для открытия инвентаря
        openInventoryButton = new JButton("Инвентарь");
        frame.add(openInventoryButton, BorderLayout.EAST);

        // Кнопка для продвижения в игре
        moveButton = new JButton("Двигаться");
        frame.add(moveButton, BorderLayout.SOUTH);

        // Обработчики событий
        openInventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Код для открытия инвентаря
            }
        });

        moveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Код для продвижения в игре
            }
        });

        // Отображение окна
        frame.setVisible(true);
    }

    // Методы для обновления информации о персонаже
    public void updateCharacterInfo(String name, int health, int attackPower) {
        nameLabel.setText("Имя: " + name);
        healthLabel.setText("Здоровье: " + health);
        attackPowerLabel.setText("Сила Атаки: " + attackPower);
    }
}