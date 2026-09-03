import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

        System.out.println("Be ready to complete this phrase!");
        System.out.println("\nHello ladies and gentleman, i am " + "?????" + ", and i'm here to represent " + "?????" + ".\nIf i had to describe "
                + "?????" + " with one word, it would be " + "?????" + "!\nSince i've joined " + "?????" +
                ", i had increased a lot of my abilities, but the thing i had grown the most was my "
                + "?????" + ".\nAnd that's why i can say the time i've been affiliated with our project was consistently " + "?????" + ".\n");

        System.out.println("\nType the first space!");
        String noun1 = leitor.nextLine();
        System.out.println("Type the second/third/fifth space!");
        String noun2 = leitor.nextLine();
        System.out.println("Type the fourth space!");
        String adjective1 = leitor.nextLine();
        System.out.println("Type the sixth space!");
        String adjective2 = leitor.nextLine();
        System.out.println("Type the seventh space!");
        String verb = leitor.nextLine();

        System.out.print("\nHello ladies and gentleman, i am " + noun1 + ", and i'm here to represent " + noun2 + ".\nIf i had to describe "
            + noun2 + " with one word, it would be " + adjective1 + "!\nSince i've joined " + noun2 +
            ", i had increased a lot of my abilities, but the thing i had grown the most was my "
                + adjective2 + ".\nAnd that's why i can say the time i've been affiliated with our project was consistently " + verb + ".");

    leitor.close();
    }
}