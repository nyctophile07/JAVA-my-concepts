package suvam;
import java.util.Scanner;
import java.util.Random;
import java.util.Objects;


public class games extends MAGIC_NUMBER{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~MAIN MENU~~~~~\nselect your game\n1.ROCK PAPER SCISSOR\n2.MAGIC NUMBER\n3.THE MAZE GAME");
        int choice=input.nextInt();
        switch(choice){
            case 1->RockPaperScissors.main(args);
            case 2->MAGIC_NUMBER.main(args);
            case 3->maze1.main(args);
            default-> System.out.println("XXXXXXXXXXX please make a valid choice XXXXXXXXXXX\n");
            //main(args);
            // break;
        }
        if (choice==1 || choice==2){
            System.out.println("do you want to play again ?\n1.YES\n2.NO");
            int ch=input.nextInt();
            if(ch==1){
                main(args);
            }
            else{
                System.out.println("THANK YOU FOR APPROCHING, SEE YOU LETTER :)");
            }
        }
        else
        {
            main(args);
        }
    }
}
class maze1 extends info{
    //info instruction;
    static int score = 0;

    static int DICE() {
        score++;
        info instruction = new info();
        Random ab = new Random();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (Objects.equals(input, "magicportal") || Objects.equals(input, "dreamymist") || Objects.equals(input, "cmdinfo")
                || Objects.equals(input, "chupakabra") || Objects.equals(input, "credit") || Objects.equals(input, "motivate")
                || Objects.equals(input, "619") || Objects.equals(input, "rst") || Objects.equals(input, "ext") || Objects.equals(input, "dice")
                || Objects.equals(input, "108") || Objects.equals(input, "srccmd")) {
            switch (input) {
                case "magicportal" -> {
                    info.magicportal();
                    System.out.println();
                }
                //return DICE();
                case "dreamymist" -> {
                    info.dreamyfist();
                    System.out.println();
                }
                case "cmdinfo" -> {
                    info.cmdinfo();
                    System.out.println();
                }
                case "chupakabra" -> {
                    info.chupakabra();
                    System.out.println();
                }
                case "credit" -> {
                    info.credit();
                    System.out.println();
                }
                case "motivate" -> {
                    info.motivate();
                    System.out.println();
                }
                case "srccmd" -> {
                    info.srccmd();
                }
                case "619" -> {
                    PLAYER = 100;
                }
                case "rst" -> {
                    System.out.println("restarting the game......");
                    restart = 10;
                }
                case "ext" -> {
                    System.exit(0);
                }
                case "dice" -> System.out.println("YOU HAVE ROLL THE DICE " + (score - 2) + " TIMES.");
                case "108" -> {
                    System.out.println("\n\n" +
                            "█▀▀  █▀█  █▄░█  █▀▀  █▀█  ▄▀█  ▀█▀  █▀  █\n" +
                            "█▄▄  █▄█  █░▀█  █▄█  █▀▄  █▀█  ░█░  ▄█  ▄\nYOU HAVE ESCAPED THIS MAZE ");
                    System.out.println("your score: " + (100 - score) * 9);
                    System.exit(0);
                }
                default -> {
                }
            }
            input = sc.nextLine();
        }
        return ab.nextInt(7);
    }

    static int magic_portal() {
        Random one = new Random();
        Random two = new Random();
        int o = one.nextInt(12);
        int t = two.nextInt(10);
        return o * t;
    }

    static int chupakabra_appearance() {     // chupakabra WILL APPEAR ANYWHERE BET 1-100
        Random chpkbra = new Random();
        return chpkbra.nextInt(5);
    }

    static int restart = 0;
    static int awake = 0;
    //static int awk=0;// used in Mist zone to wake up the player
    static int PLAYER = 0;    // PLAYER'S POSITION

    public static void main(String[] args) {
        //every_have_to_be_zero_after_restart:
        restart = 0;
        score = 0;
        PLAYER = 0;
        awake = 0;
        // awk=0;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" +
                "████████╗██╗░░██╗███████╗  ███╗░░░███╗░█████╗░███████╗███████╗  ░██████╗░░█████╗░███╗░░░███╗███████╗\n" +
                "╚══██╔══╝██║░░██║██╔════╝  ████╗░████║██╔══██╗╚════██║██╔════╝  ██╔════╝░██╔══██╗████╗░████║██╔════╝\n" +
                "░░░██║░░░███████║█████╗░░  ██╔████╔██║███████║░░███╔═╝█████╗░░  ██║░░██╗░███████║██╔████╔██║█████╗░░\n" +
                "░░░██║░░░██╔══██║██╔══╝░░  ██║╚██╔╝██║██╔══██║██╔══╝░░██╔══╝░░  ██║░░╚██╗██╔══██║██║╚██╔╝██║██╔══╝░░\n" +
                "░░░██║░░░██║░░██║███████╗  ██║░╚═╝░██║██║░░██║███████╗███████╗  ╚██████╔╝██║░░██║██║░╚═╝░██║███████╗\n" +
                "░░░╚═╝░░░╚═╝░░╚═╝╚══════╝  ╚═╝░░░░░╚═╝╚═╝░░╚═╝╚══════╝╚══════╝  ░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═╝╚══════╝");
        //       System.out.println("\n" +
        //               " MAIN MANU ̲");
        System.out.println("\nYou have entered a maze created by the devil himself, where every step is a battle. There can be many traps in your journey." +
                "\nYou have to make right choices to get through the twists and turns of this hellish maze." +
                "\nCan you escape from this hellish maze ? let's find out the answer...");
        String a = sc.nextLine();
        //INSTRUCTIONS:
        System.out.println("QUICK SHORTCUT : THERE WILL BE SHORTCUTS TO GET QUICKER ROUTE TO ESCAPE THIS MAZE\n" +
                "WRONG TURNS : IT MIGHT POSSIBLE THAT YOU CAN LOST YOUR TRACK AND GET BACK TO THE EARLY STEPS THAT YOU HAVE ALREADY PASSED");
        String aa = sc.nextLine();
        info.magicportal();
        String aaa = sc.nextLine();
        info.chupakabra();
        String aaaa = sc.nextLine();
        info.dreamyfist();
        String aaaaa=sc.nextLine();
        System.out.println("\nBefore the beginning, Player have to awake by '1' on dice.");
        String aaaaaa=sc.nextLine();
        System.out.println("\nPress [ENTER] to start the game");
        //JOptionPane.showMessageDialog(null,"Press ENTER to start the game");    popup a button to ENTER
        int dice = DICE();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nGIVE A NAME TO YOUR CHARACTER :");
        String nameN = sc.nextLine();
        String name = nameN.toUpperCase();
        System.out.println("\nGET....SET....\n══════ ROLL THE DICE ══════");
        System.out.println("\nPress [ENTER] to roll the dice");
        dice = DICE();
        //System.out.println("⚄");
        AWAKENING:
        // BEFORE GOING TO START HIS JOURNEY OUR PLAYER HAS TO WAKE UP

        while (awake == 0 && PLAYER == 0) {
            if (restart == 10) { // restart command
                main(args);
                break;
            }
            if (dice == 1) {
                System.out.println("  █...." + dice + "\n" + name + " IS READY TO START HIS JOURNEY");
                awake++;
                PLAYER += dice; // PLAYER WILL BE ON START
                System.out.println(name + "'S POSITION = " + PLAYER); //START POINT
            } else if (dice == 0) {
                System.out.print("the dice rolled out");
                dice = DICE();
            } else {
                System.out.print("  █...." + dice);
                dice = DICE();
            }
        }

        JOURNEY:
        //NOW THE PLAYER IS GOING TO FACE SOME OBSTACLES UNTIL HE REACHES HIS DESTINATION

        while (PLAYER <= 100) {
            if (restart == 10) {     //restart command
                main(args);
                System.exit(0);
            }
            int CHUPA = chupakabra_appearance();
            dice = DICE();
            if (PLAYER == 100) {     // CHEAT CODE: 619+ [ENTER] + [ENTER]
                // THERE WILL BE TWO DOORS AT THE END OF THE MAZE
                Random rd = new Random();
                int rad = rd.nextInt(3);
                if (PLAYER == 100) {     // CHEAT CODE: 619+ [ENTER] + [ENTER]
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("You have reached the end of this maze.\nTHERE IS ONLY TWO DOORS BETWEEN YOU AND THE OUTSIDE WORLD. " +
                            "ONE OF THEM WILL LET YOU ESCAPE THIS MAZE \nMEANWHILE ANOTHER WILL TAKE YOU THE STARTING POINT OF THE JOURNEY AGAIN\n" +
                            "NOW THIS IS UPTO YOU, SO CHOOSE WISELY");
                    //System.out.println("the random no is "+rad);
                    System.out.println("            ▄▄▄▄▄▄▄▄▄▄▄                ▄▄▄▄▄▄▄▄▄▄▄       \n" +
                            "            █ ▄▄▄▄▄▄▄ █                █ ▄▄▄▄▄▄▄ █       \n" +
                            "            █ █     █ █                █ █     █ █       \n" +
                            "            █ █     █ █                █ █     █ █       \n" +
                            "            █ █  1  █ █                █ █  2  █ █       \n" +
                            "            █ █     █ █                █ █     █ █       \n" +
                            "            █ █▄▄▄▄▄█ █                █ █▄▄▄▄▄█ █       \n" +
                            "            █▄▄▄▄▄▄▄▄▄█                █▄▄▄▄▄▄▄▄▄█       \n" +
                            "         ═══|═════════|═══          ═══|═════════|═══    \n" +
                            "     (══════════════════════)   (══════════════════════) ");

                    System.out.println("What will be your choice ?");
                    int input = sc.nextInt();
                        /*if(input==2){
                            input=0;
                        }*/
                    if (rad != 2) {
                        System.out.println("\n\n" +
                                "█▀▀  █▀█  █▄░█  █▀▀  █▀█  ▄▀█  ▀█▀  █▀  █\n" +
                                "█▄▄  █▄█  █░▀█  █▄█  █▀▄  █▀█  ░█░  ▄█  ▄\n" + name + " HAS ESCAPED THIS MAZE ");
                        if (PLAYER != 0) {
                            System.out.println("your score: " + (100 - score) * 9);
                        }
                        System.exit(0);
                    } else {
                        main(args);
                        System.exit(0);
                    }
                }
                // break;
            }
            if (100 - PLAYER >= dice) {
                PLAYER += dice;

                if (dice == 0) {
                    System.out.print("the dice rolled out");
                } else {
                    System.out.print("  █...." + dice + ", ");
                    if (PLAYER >= 100) {
                        Random rd = new Random();
                        int rad = rd.nextInt(3);
                        if (PLAYER == 100) {     // CHEAT CODE: 619+ [ENTER] + [ENTER]
                            // THERE WILL BE TWO DOORS AT THE END OF THE MAZE
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                            System.out.println("You have reached the end of this maze.\nTHERE IS ONLY TWO DOORS BETWEEN YOU AND THE OUTSIDE WORLD. " +
                                    "ONE OF THEM WILL LET YOU ESCAPE THIS MAZE \nMEANWHILE ANOTHER WILL TAKE YOU THE STARTING POINT OF THE JOURNEY AGAIN\n" +
                                    "NOW THIS IS UPTO YOU, SO CHOOSE WISELY");
                            //System.out.println("the random no is "+rad);
                            System.out.println("            ▄▄▄▄▄▄▄▄▄▄▄                ▄▄▄▄▄▄▄▄▄▄▄       \n" +
                                    "            █ ▄▄▄▄▄▄▄ █                █ ▄▄▄▄▄▄▄ █       \n" +
                                    "            █ █     █ █                █ █     █ █       \n" +
                                    "            █ █     █ █                █ █     █ █       \n" +
                                    "            █ █  1  █ █                █ █  2  █ █       \n" +
                                    "            █ █     █ █                █ █     █ █       \n" +
                                    "            █ █▄▄▄▄▄█ █                █ █▄▄▄▄▄█ █       \n" +
                                    "            █▄▄▄▄▄▄▄▄▄█                █▄▄▄▄▄▄▄▄▄█       \n" +
                                    "         ═══|═════════|═══          ═══|═════════|═══    \n" +
                                    "     (══════════════════════)   (══════════════════════) ");

                            System.out.println("What will be your choice ?");
                            int input = sc.nextInt();
                                /*if(input==2){
                                    input=0;
                                }*/
                            if (rad != 2) {
                                System.out.println("\n\n" +
                                        "█▀▀  █▀█  █▄░█  █▀▀  █▀█  ▄▀█  ▀█▀  █▀  █\n" +
                                        "█▄▄  █▄█  █░▀█  █▄█  █▀▄  █▀█  ░█░  ▄█  ▄\n" + name + " HAS ESCAPED THIS MAZE ");
                                if (PLAYER != 0) {
                                    System.out.println("your score: " + (100 - score) * 9);
                                }
                                System.exit(0);
                            } else {
                                main(args);
                                System.exit(0);
                            }
                        }
                        /// break;
                    }
                    //WRONG TURNS : IF PLAYER GOT INTO A WRONG TUNNEL, IT MIGHT POSSIBLE THAT HE WILL LOST HIS TRACK AND GET BACK TO EARLY STEPS
                    else if (PLAYER == 33 || PLAYER == 49 || PLAYER == 56 || PLAYER == 69 || PLAYER == 75 || PLAYER == 98) {
                        System.out.println("                          \n" +
                                "               ▄█▀▄           \n" +
                                "             ▄█    ▀▄         \n" +
                                "           ▄█    █   ▀▄       \n" +
                                "         ▄█      ▀     ▀▄     \n" +
                                "       ▄█        ▀       ▀▄   \n" +
                                "      ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀  ");
                        System.out.println("*****[Oops! you got a WRONG TURN]*****");
                        System.out.print("~~~~~~~> ");
                        switch (PLAYER) {
                            //case 76 -> PLAYER = 11;
                            case 33 -> PLAYER = 8;
                            //case 41 -> PLAYER = 23;
                            case 49 -> PLAYER = 21;
                            case 56 -> PLAYER = 37;
                            case 69 -> PLAYER = 50;
                            case 75 -> PLAYER = 44;
                            case 87 -> PLAYER = 63;
                            case 98 -> PLAYER = 71;
                        }
                    }
                    //QUICK SHORTCUT : IN THIS JOURNEY, PLAYER WILL GET SOME SHORTCUT TO GET QUICKER ROUTE TO HIS DESTINATION
                    else if (PLAYER == 7 || PLAYER == 15 || PLAYER == 24 || PLAYER == 36 ||
                            PLAYER == 43 || PLAYER == 52 || PLAYER == 60) {
                        System.out.println("\n               ████       \n" +
                                "            ▒████████▒▒   \n" +
                                "         ▒▒▓██      ██▓   \n" +
                                "         ▒▒██        ██▒▒ \n" +
                                "         ▒▒██        ██▒▒ \n" +
                                "         ▒▒██        ██▒▒ \n" +
                                "         ▒▒██        ██▒▒ \n" +
                                "         ▒▒██        ██▒▒ ");
                        System.out.print("═══════════════════════════════════\n...YOU HAVE GOT A QUICK SHORTCUT...\n ------>");
                        switch (PLAYER) {
                            case 7 -> PLAYER = 25;
                            case 15 -> PLAYER = 42;
                            case 24 -> PLAYER = 37;
                            case 36 -> PLAYER = 57;
                            case 43 -> PLAYER = 68;
                            case 52 -> PLAYER = 91;
                            case 60 -> PLAYER = 84;
                            //case 71-> PLAYER=96;
                        }
                    }
                    /*MAGIC PORTAL : MAGIC PORTAL APPEARS ANYWHERE BETWEEN YOUR JOURNEY. IT WILL TELEPORT TO ANYWHERE BETWEEN YOUR JOURNEY,
                                     WHEN YOU GOT A PORTAL YOU HAVE TWO CHOICE EITHER TO USE OR AVOID IT. THERE IS A RISK USING A MAGIC PORTAL THAT
                                     THERE IS A POSSIBILITY THAT YOU MIGHT BE TELEPORTED TO THE DEVIL'S KITCHEN   */
                    else if (PLAYER == 6 || PLAYER == 41 || PLAYER == 17 || PLAYER == 28 || PLAYER == 54 || PLAYER == 70) {
                        System.out.println("\n                 ██  ██            \n" +
                                "               ██▓▓██▓▓██          \n" +
                                "             ██▓▓██████            \n" +
                                "     ██    ██▓▓████████▒▒▒▒        \n" +
                                "   ▒▒██░░██████████████████████    \n" +
                                "   ▒▒▓▓▓▓████▓▓██████▓▓▓▓████▓▓██  \n" +
                                "   ▒▒██▓▓██████▓▓███ ██████████▓▓██\n" +
                                "     ██▓▓████████████████████████▓█\n" +
                                "     ▒▒██▓▓▓▓██▓▓██████▓▓▓▓████▓▓▓▓\n" +
                                "       ████████████▓▓██████▓▓██    \n" +
                                "       ▓▓██████████▓▓██████▓▓██    \n" +
                                "     ▒▒░░▓▓████████▓▓██████▓▓██▒▒  \n" +
                                "   ▒██  ██████▓▓██▓▓████████████   \n" +
                                "     ██████▓▓██▓▓██▓▓▓▓ ███████    \n" +
                                "       ██████████      ████▓▓▒▒    \n" +
                                "          ████        ██           ");
                        System.out.println("ATTENTION ! YOU HAVE GOT A ACCESS OF MAGIC PORTAL\n do you want to use it\n1.YES\n2.NO");
                        int inputs = sc.nextInt();
                        if (inputs == 1) {
                            PLAYER = magic_portal();
                            if (PLAYER == 0) {
                                System.out.println("YOU TELEPORTED TO THE DEVIL'S KITCHEN AND WILL BE DIE IN FEW MINUTES... :(" +
                                        "\n" +
                                        " ██████   █████  ███    ███ ███████    █████  ██    ██ ███████ ██████  \n" +
                                        "██       ██   ██ ████  ████ ██        ██   ██ ██    ██ ██      ██   ██ \n" +
                                        "██   ██  ███████ ██ ████ ██ █████     ██   ██  ██  ██  █████   ██████  \n" +
                                        "██    ██ ██   ██ ██  ██  ██ ██        ██   ██   ████   ██      ██   ██ \n" +
                                        " ██████  ██   ██ ██      ██ ███████    █████     ██    ███████ ██   ██ \n" +
                                        "                                                                       ");
                                System.exit(0);
                            } else if (PLAYER == 1) {
                                System.out.println("YOU CAME BACK TO THE START");
                            }
                        }
                    }
                    //CHUPAKABRA : IT'S A SUPERNATURAL CREATURE ALWAYS ON A HUNT OF FRESH HUMAN MEAT. THEY USUALLY HIDE IN THE CAVES. YOU WOULDN'T LIKE
                    //             TO SEE ONE OF THEM IN FRONT OF YOU.
                    //         in case you have accidentally encountered with a kabra, you should have maintain distance with it for your own safety.
                    //         But if you want you can pass through its blind spot by crawling, but it's not suggested. A chupakabra has very strong senses so it's
                    //         impossible to get through it without being unnoticed. there is merely 20% chance it can't notice you when you will be crawling but
                    //         it would be preferred that you step back and let it go in its way.
                    else if (CHUPA % 2 == 0) {
                        if (PLAYER == 13 || PLAYER == 46 || PLAYER == 58 || PLAYER == 97 || PLAYER == 77) {
                            System.out.println("\n                  ▄  ▒\n" +
                                    "                 ██▌  \n" +
                                    "             ▄▄███▀   \n" +
                                    "            █████ ▄█  \n" +
                                    "          ▄████████▀  \n" +
                                    "        ▄█████████    \n" +
                                    "         ▄███████▌    \n" +
                                    "       ▄█████████     \n" +
                                    "    ▄███████████▌     ");
                            System.out.println("there is a CHUPAKABRA in some distance");
                            System.out.println("1.AVOID IT! take back 5 steps backward and let it go in its way (RECOMMENDED)");
                            System.out.println("2.CRAWL BY IT: there is hardly 20% chance that you can crawl by it without being noticed");
                            int chp = sc.nextInt();
                            if (chp == 1) {
                                PLAYER = PLAYER - 5;
                                System.out.println("YOU ARE SAFE NOW!");
                            } else if (chp == 2) {
                                Random chpmood = new Random();
                                if (chpmood.nextInt(5) == 3) {
                                    System.out.println("GOSH! you just passed your death, MAN");
                                    PLAYER = PLAYER + 1;
                                } else {
                                    System.out.println("IT NOTICED YOU ! now you are dead");
                                    PLAYER = 0;
                                    System.out.println("\n" +
                                            "█▀▀  ▄▀█  █▀▄▀█  █▀▀     █▀█  █░█  █▀▀  █▀█\n" +
                                            "█▄█  █▀█  █░▀░█  ██▄     █▄█  ▀▄▀  ██▄  █▀▄");
                                    System.exit(0);
                                }
                            } else {
                                System.out.println("YOU SHOULD NOT DO THAT, IT NOTICED YOU.....RUN! ");
                                System.out.println("\n" +
                                        "░█▀▀█ ─█▀▀█ ░█▀▄▀█ ░█▀▀▀ 　 ░█▀▀▀█ ░█──░█ ░█▀▀▀ ░█▀▀█ \n" +
                                        "░█─▄▄ ░█▄▄█ ░█░█░█ ░█▀▀▀ 　 ░█──░█ ─░█░█─ ░█▀▀▀ ░█▄▄▀ \n" +
                                        "░█▄▄█ ░█─░█ ░█──░█ ░█▄▄▄ 　 ░█▄▄▄█ ──▀▄▀─ ░█▄▄▄ ░█─░█");
                                System.exit(0);
                            }
                        }
                    }
                        /*DREAMY MIST:
                         SOMETIMES THERE WILL BE SOME TYPE OF MIST WILL APPEAR IN THAT CAVE WHICH WILL MAKE YOU HALLUCINATE
                        * OF YOU MOST DESIRED DREAM. IT WILL BE SO REAL THAT YOU CAN'T ABLE DIFFERENTIATE WHAT IS REAL OR WHAT'S NOT
                        * IF YOU DIDN'T WAKE UP IN TIME YOU WILL BE UNCONCIOUS AND EVENTUALLY DEAD ALSO
                        *  in order to wake up from the dream you have to roll up the dice to the 6
                        *  you will get only 7 times to roll the dice to 6 after this you will be out from this game */
                    if (PLAYER == 22 || PLAYER == 39 || PLAYER == 55 || PLAYER == 93 || PLAYER == 79) {
                        System.out.println("\n\n" +
                                "         .                      .\n" +
                                "         .                      ;\n" +
                                "         :                  - --+- -\n" +
                                "         !           .          !\n" +
                                "         |        .             .\n" +
                                "         |_         +\n" +
                                "      ,  | `.\n" +
                                "--- --+-<#>-+- ---  --  -\n" +
                                "      `._|_,'\n" +
                                "         T\n" +
                                "         |\n" +
                                "         !\n" +
                                "         :         . : \n" +
                                "         .       *");
                        System.out.println("UNFORTUNATELY! YOU HAVE ENTERED THE DREAMY MIST ZONE\nwake up quickly before it's too late");
                        int round = 0;
                        int awk = 0;
                        while (awk == 0 && round <= 7) {
                            dice = DICE();
                            round++;
                            if (dice == 6) {
                                System.out.print("  █...." + dice + ",");
                                System.out.println("YOU HAVE AWAKED");
                                awk++;
                            } else if (dice == 0) {
                                System.out.print("dice rolled out");
                            } else {
                                System.out.print("  █...." + dice + ",");
                            }
                        }
                        if (round > 7) {
                            System.out.println("your time's up, SWEET DREAMS");
                            System.out.println("\n" +
                                    "█▀▀  ▄▀█  █▀▄▀█  █▀▀     █▀█  █░█  █▀▀  █▀█\n" +
                                    "█▄█  █▀█  █░▀░█  ██▄     █▄█  ▀▄▀  ██▄  █▀▄");
                            System.exit(0);
                        } else {
                            System.out.println();
                        }
                    }

                    System.out.println(name + "'S POSITION = " + PLAYER); //PLAYER'S POSTITION
                }
            } else {
                System.out.print("  █...." + dice + ",");
                System.out.println("you need " + (100 - PLAYER) + " more steps");
            }

        }

        //System.out.println("dice roll back this times: "+score);

    }
}
