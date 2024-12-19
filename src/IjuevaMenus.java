import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class IjuevaMenus extends Canvas {
    private String menu;
    private final float[] creditHSB = Color.RGBtoHSB(60, 200, 114, null);
    private final float[] titleHSB = Color.RGBtoHSB(231, 95, 51, null);
    private int selected;
    private int randNum = 0;


    public IjuevaMenus() {
        randNum = ThreadLocalRandom.current().nextInt(1, 1000);
        menu = "Title";
        selected = 1;
    }


    public void setMenu(String menuName) {
        menu = menuName;
        selected = 1;
        if (Caffeine.debugInfo) {
            System.out.println(">>>> All menu variables set.\n");
        }
    }


    public void showCredits(Graphics window) {
        Graphics2D scrn = (Graphics2D) window.create();

        scrn.setColor(Color.WHITE);
        scrn.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 40));
        scrn.drawString("A game made by", 247, 280);
        if (Caffeine.debugInfo) {
            System.out.println(">>>> Printed first half of credits.");
        }
        scrn.setColor(Color.getHSBColor(creditHSB[0], creditHSB[1], creditHSB[2]));
        scrn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 40));
        scrn.drawString("Fuurvent", 320, 330);
        if (Caffeine.debugInfo) {
            System.out.println(">>>> Printed second half of credits.\n");
        }
    }


    public void showMenu(Graphics window) {
        Graphics2D scrn = (Graphics2D) window.create();
        selected = 1;

        if (menu.equalsIgnoreCase("Title")) {
            scrn.setColor(Color.getHSBColor(titleHSB[0], titleHSB[1], titleHSB[2]));
            scrn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 50));
            if (randNum == 270) {
                scrn.drawString("Caffiene", 300, 150);
                scrn.drawString("Ijueva", 330, 190);
            } else {
                scrn.drawString("Caffeine", 300, 150);
                scrn.drawString("Ijueva", 330, 190);
            }
            if (Caffeine.debugInfo) {
                System.out.println(">>>> Printed the game title.\n");
            }

            scrn.setColor(Color.DARK_GRAY);
            scrn.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 20));
            scrn.drawString("Caffeine Ijueva v00037_10 (inDev)", 10, 49);
            scrn.drawString("Demo Build 1", 10, 69);
            if (Caffeine.debugInfo) {
                System.out.println(">>>> Printed the game version.\n");
            }
        }
    }

    public void printMenu(Graphics window) {
        Graphics2D scrn = (Graphics2D) window.create();

        if (menu.equalsIgnoreCase("Title")) {
            //randNum = ThreadLocalRandom.current().nextInt(1, 1000);

            scrn.setColor(Color.WHITE);
            scrn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
            /*if (randNum == 75 || randNum == 163 || randNum == 250) {
                if (selected == 1) {
                    scrn.drawString("> Factory Reset <", 267, 330);
                    scrn.drawString("  Wake Up", 319, 370);
                    scrn.drawString("  Settings", 310, 410);
                    scrn.drawString("  Shut Down", 303, 450);
                } else if (selected == 2) {
                    scrn.drawString("  Factory Reset", 267, 330);
                    scrn.drawString("> Wake Up <", 319, 370);
                    scrn.drawString("  Settings", 310, 410);
                    scrn.drawString("  Shut Down", 303, 450);
                } else if (selected == 3) {
                    scrn.drawString("  Factory Reset", 267, 330);
                    scrn.drawString("  Wake Up", 319, 370);
                    scrn.drawString("> Settings <", 310, 410);
                    scrn.drawString("  Shut Down", 303, 450);
                } else if (selected == 4) {
                    scrn.drawString("  Factory Reset", 267, 330);
                    scrn.drawString("  Wake Up", 319, 370);
                    scrn.drawString("  Settings", 310, 410);
                    scrn.drawString("> Shut Down <", 303, 450);
                }
            }

            This is commented out because I want to go through with the idea again, but I'm too lazy to fix it right now :3
            */
            if (selected == 1) {
                scrn.drawString("> New Game <", 310, 330);
                scrn.drawString("  Load Save", 301, 370);
                scrn.drawString("  Options", 318, 410);
                scrn.drawString("  Credits", 318, 450);
                scrn.drawString("  Quit", 345, 490);
            } else if (selected == 2) {
                scrn.drawString("  New Game", 310, 330);
                scrn.drawString("> Load Save <", 301, 370);
                scrn.drawString("  Options", 318, 410);
                scrn.drawString("  Credits", 318, 450);
                scrn.drawString("  Quit", 345, 490);
            } else if (selected == 3) {
                scrn.drawString("  New Game", 310, 330);
                scrn.drawString("  Load Save", 301, 370);
                scrn.drawString("> Options <", 318, 410);
                scrn.drawString("  Credits", 318, 450);
                scrn.drawString("  Quit", 345, 490);
            } else if (selected == 4) {
                scrn.drawString("  New Game", 310, 330);
                scrn.drawString("  Load Save", 301, 370);
                scrn.drawString("  Options", 318, 410);
                scrn.drawString("> Credits <", 318, 450);
                scrn.drawString("  Quit", 345, 490);
            } else if (selected == 5) {
                scrn.drawString("  New Game", 310, 330);
                scrn.drawString("  Load Save", 301, 370);
                scrn.drawString("  Options", 318, 410);
                scrn.drawString("  Credits", 318, 450);
                scrn.drawString("> Quit <", 345, 490);
            }
            if (Caffeine.debugInfo) {
                System.out.println(">>>> Printed the main menu options.\n");
            }
        }

        if (menu.equalsIgnoreCase("Confirm")) {
            scrn.setColor(Color.WHITE);
            scrn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
            scrn.drawString("Are you sure you want", 230, 250);
            scrn.drawString("to start a new game?", 240, 290);
            if (selected == 1) {
                scrn.drawString("> Yes <", 350, 330);
                scrn.drawString("  No", 358, 370);
            } else if (selected == 2) {
                scrn.drawString("  Yes", 350, 330);
                scrn.drawString("> No <", 358, 370);
            }
            if (Caffeine.debugInfo) {
                System.out.println(">>>> Printed the confirmation options.\n");
            }
        }

        if (menu.equalsIgnoreCase("Denied")) {
            scrn.setColor(Color.WHITE);
            scrn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
            scrn.drawString("! Access Denied !", 260, 250);
            scrn.drawString("This menu is not finished.", 190, 290);
            if (Caffeine.debugInfo) {
                System.out.println(">>>> Printed the denied screen.\n");
            }
        }

        /*if (menu.equalsIgnoreCase("Load")) {

        }

        if (menu.equalsIgnoreCase("Credits")) {

        }*/

        if (menu.equalsIgnoreCase("Options")) {
            scrn.setColor(Color.WHITE);
            scrn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
            if (selected == 1) {
                scrn.drawString("> Controls <", 310, 330);
                scrn.drawString("  Visuals", 318, 370);
                scrn.drawString("  Sounds", 327, 410);
                scrn.drawString("  Debug Features", 255, 450);
                scrn.drawString("  Back", 345, 490);
            } else if (selected == 2) {
                scrn.drawString("  Controls", 310, 330);
                scrn.drawString("> Visuals <", 318, 370);
                scrn.drawString("  Sounds", 327, 410);
                scrn.drawString("  Debug Features", 255, 450);
                scrn.drawString("  Back", 345, 490);
            } else if (selected == 3) {
                scrn.drawString("  Controls", 310, 330);
                scrn.drawString("  Visuals", 318, 370);
                scrn.drawString("> Sounds <", 327, 410);
                scrn.drawString("  Debug Features", 255, 450);
                scrn.drawString("  Back", 345, 490);
            } else if (selected == 4) {
                scrn.drawString("  Controls", 310, 330);
                scrn.drawString("  Visuals", 318, 370);
                scrn.drawString("  Sounds", 327, 410);
                scrn.drawString("> Debug Features <", 255, 450);
                scrn.drawString("  Back", 345, 490);
            } else if (selected == 5) {
                scrn.drawString("  Controls", 310, 330);
                scrn.drawString("  Visuals", 318, 370);
                scrn.drawString("  Sounds", 327, 410);
                scrn.drawString("  Debug Features", 255, 450);
                scrn.drawString("> Back <", 345, 490);
            }
            if (Caffeine.debugInfo) {
                System.out.println(">>>> Printed the settings options.\n");
            }
        }

        /*if (menu.equalsIgnoreCase("Controls")) {

        }

        if (menu.equalsIgnoreCase("Visuals")) {

        }

        if (menu.equalsIgnoreCase("Sounds")) {

        }*/

        if (menu.equalsIgnoreCase("Debug")) {
            scrn.setColor(Color.WHITE);
            scrn.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
            if (selected == 1) {
                scrn.drawString("> Console Output: FALSE <", 190, 330);
                scrn.drawString("  User Info Output: FALSE", 170, 370);
                scrn.drawString("  Back", 345, 410);
            } else if (selected == 2) {
                scrn.drawString("  Console Output: FALSE", 190, 330);
                scrn.drawString("> User Info Output: FALSE <", 170, 370);
                scrn.drawString("  Back", 345, 410);
            } else if (selected == 3) {
                scrn.drawString("  Console Output: FALSE", 190, 330);
                scrn.drawString("  User Info Output: FALSE", 170, 370);
                scrn.drawString("> Back <", 345, 410);
            }
            if (Caffeine.debugInfo) {
                System.out.println(">>>> Printed the main menu options.\n");
            }
        }

    }


    public void selectMove(String addOrSubtract, int max) {
        if (addOrSubtract.equalsIgnoreCase("Add")) {
            selected += 1;
        } else if (addOrSubtract.equalsIgnoreCase("Subtract")) {
            selected -= 1;
        }
        if (selected > max) {
            selected = 1;
        } else if (selected < 1) {
            selected = max;
        }
    }

    public int getSelected() { return selected; }


    public void playCutscene(Graphics window, String cutsceneName) throws Exception {
        Graphics2D scrn = (Graphics2D) window.create();

        if (cutsceneName.equalsIgnoreCase("Power On")) {
            scrn.setStroke(new BasicStroke(1));
            scrn.setColor(Color.WHITE);
            scrn.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));

            Thread.sleep(2000);
            scrn.drawString("Intel UNDI, PXE-2.1 (build 803)", 10, 48);
            scrn.drawString("Copyright (C) 1997-3529, Intel Corporation", 10, 69);
            scrn.drawString("Copyright (C) 1989-3621, ASUSTeK Computer Inc.", 10, 90);
            scrn.drawString("Copyright (C) 2768-3621, Furricon Laboratories Inc.", 10, 111);
            scrn.drawString("All Rights Reserved", 10, 132);

            Thread.sleep(250);
            scrn.drawString("ASUS ABN-SLI Premium ACPI BIOS Revision 1011-001", 10, 174);

            Thread.sleep(500);
            scrn.drawString("CPU: Intel(R) Celeron(R) G5925 @ 3.60GHz", 10, 216);
            scrn.drawString("Display Visor: Furricon(R) VISOR(R) Zed-Mix Z4269", 10, 237);
            scrn.drawString("Overlay Visor: Furricon(R) VIZOR(R) Zed-Mix Z213", 10, 258);
            scrn.drawString("Memory: DDR4-2666 in Dual-Channel Interleaved Mode", 10, 279);
            scrn.drawString("Memory Testing:   0K", 10, 300);

            scrn.setStroke(new BasicStroke(7));
            scrn.setColor(Color.BLACK);
            scrn.drawRect(50, 330, 725, 195);
            scrn.fillRect(50, 330, 725, 195);

            scrn.setStroke(new BasicStroke(1));
            scrn.setColor(Color.WHITE);
            Thread.sleep(1000);
            for (int i = 0; i < 16145183; i += ThreadLocalRandom.current().nextInt(5458, 32568)) {
                scrn.setColor(Color.BLACK);
                scrn.fillRect(202, 282, 200, 25);
                scrn.setColor(Color.WHITE);
                scrn.drawString("Memory Testing:   " + i + "K", 10, 300);
                Thread.sleep(10);
            }
            scrn.setColor(Color.BLACK);
            scrn.fillRect(202, 282, 200, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Memory Testing:   16145183K OK", 10, 300);

            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                scrn.setColor(Color.BLACK);
                scrn.fillRect(432, 324, 20, 25);
                scrn.setColor(Color.WHITE);
                scrn.drawString("Starting VISOR(R) display driver .. /", 10, 342);
                Thread.sleep(1000);
                scrn.setColor(Color.BLACK);
                scrn.fillRect(432, 324, 20, 25);
                scrn.setColor(Color.WHITE);
                scrn.drawString("Starting VISOR(R) display driver .. -", 10, 342);
                Thread.sleep(1000);
                scrn.setColor(Color.BLACK);
                scrn.fillRect(432, 324, 20, 25);
                scrn.setColor(Color.WHITE);
                scrn.drawString("Starting VISOR(R) display driver .. \\", 10, 342);
                Thread.sleep(1000);
                scrn.setColor(Color.BLACK);
                scrn.fillRect(432, 324, 20, 25);
                scrn.setColor(Color.WHITE);
                scrn.drawString("Starting VISOR(R) display driver .. ¦", 10, 342);
            }
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(432, 324, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Starting VISOR(R) display driver .. Done.", 10, 342);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 345, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Visor Testing:   happy.expr /", 10, 363);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 345, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Visor Testing:   happy.expr -", 10, 363);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 345, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Visor Testing:   happy.expr \\", 10, 363);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 345, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Visor Testing:   happy.expr ¦", 10, 363);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 345, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Visor Testing:   happy.expr OK", 10, 363);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 366, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 angry.expr /", 10, 384);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 366, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 angry.expr -", 10, 384);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 366, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 angry.expr \\", 10, 384);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 366, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 angry.expr ¦", 10, 384);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(332, 366, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 angry.expr OK", 10, 384);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(312, 387, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 sad.expr /", 10, 405);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(312, 387, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 sad.expr -", 10, 405);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(312, 387, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 sad.expr \\", 10, 405);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(312, 387, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 sad.expr ¦", 10, 405);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(312, 387, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 sad.expr OK", 10, 405);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(354, 408, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 neutral.expr /", 10, 426);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(354, 408, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 neutral.expr -", 10, 426);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(354, 408, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 neutral.expr \\", 10, 426);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(354, 408, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 neutral.expr ¦", 10, 426);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(354, 408, 50, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("                 neutral.expr OK", 10, 426);
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                scrn.setColor(Color.BLACK);
                scrn.fillRect(432, 429, 20, 25);
                scrn.setColor(Color.WHITE);
                scrn.drawString("Starting VIZOR(R) display driver .. /", 10, 447);
                Thread.sleep(1000);
                scrn.setColor(Color.BLACK);
                scrn.fillRect(432, 429, 20, 25);
                scrn.setColor(Color.WHITE);
                scrn.drawString("Starting VIZOR(R) display driver .. -", 10, 447);
                Thread.sleep(1000);
                scrn.setColor(Color.BLACK);
                scrn.fillRect(432, 429, 20, 25);
                scrn.setColor(Color.WHITE);
                scrn.drawString("Starting VIZOR(R) display driver .. \\", 10, 447);
                Thread.sleep(1000);
                scrn.setColor(Color.BLACK);
                scrn.fillRect(432, 429, 20, 25);
                scrn.setColor(Color.WHITE);
                scrn.drawString("Starting VIZOR(R) display driver .. ¦", 10, 447);
            }
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(432, 429, 20, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Starting VIZOR(R) display driver .. Done.", 10, 447);
        }
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(302, 450, 20, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Booting into ModdedOS .. /", 10, 468);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(302, 450, 20, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Booting into ModdedOS .. -", 10, 468);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(302, 450, 20, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Booting into ModdedOS .. \\", 10, 468);
            Thread.sleep(1000);
            scrn.setColor(Color.BLACK);
            scrn.fillRect(302, 450, 20, 25);
            scrn.setColor(Color.WHITE);
            scrn.drawString("Booting into ModdedOS .. ¦", 10, 468);
        }
        Thread.sleep(1000);
        scrn.setColor(Color.BLACK);
        scrn.fillRect(302, 450, 20, 25);
        scrn.setColor(Color.WHITE);
        scrn.drawString("Booting into ModdedOS .. Done.", 10, 468);

        scrn.drawString("Strike the Z key to continue", 10, 567);

    }

}
