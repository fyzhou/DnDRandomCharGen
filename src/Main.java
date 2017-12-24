import data.Character;
import gen.PCharMiscGen;

import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        Console console = System.console();
        if (console == null && !GraphicsEnvironment.isHeadless() && !runningFromIntelliJ()) {
            String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6).replace("%20", " ");
            Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start", "cmd", "/k", "java -jar \"" + filename + "\""}).getOutputStream();
            System.exit(0);
        }

        char choice;
        Scanner in = new Scanner(System.in);
        /*choice = in.next().toUpperCase().charAt(0);
        while (!(choice == 'Y' || choice == 'N')) {
            System.out.println("Invalid Answer");
            System.out.println("Generate multiple Characters? [Y/N]:");
            choice = in.next().toUpperCase().charAt(0);
        }
        if (choice == 'Y') {
            System.out.println("How many?:");
            while (!in.hasNextInt()) {
                System.out.println("Invalid Answer");
                System.out.println("How many?:");
            }
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                saveToFile(new Character(System.out));
            }
            System.exit(0);
        }*/
        do {
            generateCharacter();

            System.out.println("Generate new Character? [Y/N]:");
            choice = in.next().toUpperCase().charAt(0);
            while (!(choice == 'Y' || choice == 'N')) {
                System.out.println("Invalid Answer");
                System.out.println("Generate new Character? [Y/N]:");
                choice = in.next().toUpperCase().charAt(0);
            }
        } while (choice == 'Y');
    }

    private static void generateCharacter() {
        Character c = new Character(System.out);
        c.printAll(System.out);

        char choice;
        System.out.println("Save to File? [Y/N]:");
        Scanner in = new Scanner(System.in);
        choice = in.next().toUpperCase().charAt(0);
        while (!(choice == 'Y' || choice == 'N')) {
            System.out.println("Invalid Answer");
            System.out.println("Save to File? [Y/N]:");
            choice = in.next().toUpperCase().charAt(0);
        }
        if (choice == 'Y') {
            saveToFile(c);
        }
    }

    private static boolean runningFromIntelliJ() {
        String classPath = System.getProperty("java.class.path");
        return classPath.contains("idea_rt.jar");
    }

    private static void saveToFile(Character c) {
        System.out.println("Saving to file...");
        String message = "";
        File f = new File(FileSystemView.getFileSystemView().getHomeDirectory().getAbsolutePath() + "\\" + c.getName() + ".txt");
        try (PrintStream p = new PrintStream(new FileOutputStream(f.getAbsolutePath()))) {
            c.printAll(p);
            message = "Character saved as: " + f.getAbsolutePath();
        } catch (FileNotFoundException e) {
            message = "Error while creating file";
        } finally {
            System.out.println(message);
        }
    }
}