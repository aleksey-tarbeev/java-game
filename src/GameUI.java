import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUI {
    private JFrame frame;
    private JPanel characterPanel;
    private JPanel inventoryPanel;
    private JPanel movementPanel;
    private JLabel healthLabel;
    private JLabel manaLabel;
    private JTextArea gameLog;
    private JButton createCharacterButton;
    private JButton inventoryButton;
    private JButton moveNorthButton;
    private JButton moveSouthButton;
    private JButton moveEastButton;
    private JButton moveWestButton;

    public GameUI() {
        // Создание основного окна
        frame = new JFrame("RPG Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Панель для создания персонажа
        characterPanel = new JPanel();
        createCharacterButton = new JButton("Create Character");
        characterPanel.add(createCharacterButton);

        // Панель для инвентаря
        inventoryPanel = new JPanel();
        inventoryButton = new JButton("Inventory");
        inventoryPanel.add(inventoryButton);

        // Панель для передвижения
        movementPanel = new JPanel();
        movementPanel.setLayout(new GridLayout(2, 3));
        moveNorthButton = new JButton("North");
        moveSouthButton = new JButton("South");
        moveEastButton = new JButton("East");
        moveWestButton = new JButton("West");
        movementPanel.add(new JLabel("")); // Заполнитель
        movementPanel.add(moveNorthButton);
        movementPanel.add(new JLabel("")); // Заполнитель
        movementPanel.add(moveWestButton);
        movementPanel.add(new JLabel("")); // Заполнитель
        movementPanel.add(moveEastButton);
        movementPanel.add(moveSouthButton);

        // Добавление панелей на основное окно
        frame.add(characterPanel, BorderLayout.NORTH);
        frame.add(inventoryPanel, BorderLayout.EAST);
        frame.add(movementPanel, BorderLayout.SOUTH);

        // Обработчики событий для кнопок
        createCharacterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Код для создания персонажа
            }
        });

        inventoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Код для отображения инвентаря
            }
        });

        moveNorthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Код для движения на север
            }
        });

        // Аналогичные обработчики для других кнопок передвижения

        // Отображение окна
        frame.setVisible(true);
    }

    // Методы для обновления интерфейса
    // ...
}