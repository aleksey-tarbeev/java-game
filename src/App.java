public class App {
    public static void main(String[] args) throws Exception {
        Human player = new Human("Педик", 80);
        player.display();
        Elf npcElf = new Elf("Трахомир", 75);
        npcElf.display();
    }
}
