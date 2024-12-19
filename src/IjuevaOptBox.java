import java.awt.*;

public class IjuevaOptBox extends Canvas {
    private final int boxXPos;
    private final int boxYPos;
    private final int boxWidth;
    private final int boxHeight;
    private int selected = 0;
    private String option1 = "";
    private String option2 = "";
    private String option3 = "";
    private String option4 = "";


    public IjuevaOptBox(int dialX, int dialY, int dialWidth, int dialHeight) {
        boxXPos = dialX;
        boxYPos = dialY;
        boxWidth = dialWidth;
        boxHeight = dialHeight;
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> All option box variables set.\n");
        }
    }

    public void IjuevaOpts(String opt1, String opt2, String opt3, String opt4) {
        option1 = opt1;
        option2 = opt2;
        option3 = opt3;
        option4 = opt4;
        selected = 1;
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> All option variables set.\n");
        }
    }


    public void showOptionsBox(Graphics window) {
        Graphics2D optBox = (Graphics2D) window.create();

        optBox.setStroke(new BasicStroke(1));
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> Set stroke thickness to 1.");
        }
        optBox.setColor(Color.BLACK);
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> Set option box colour to BLACK.");
        }
        optBox.fillRect(boxXPos + 363, boxYPos - 170, boxWidth - 363, boxHeight - 25);
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> Filled rectangle at X " + (boxXPos + 363) + " and Y " + (boxYPos - 170) + ".\n");
        }
        optBox.setStroke(new BasicStroke(7));
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> Set stroke thickness to 7.");
        }
        optBox.setColor(Color.WHITE);
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> Set option box colour to WHITE.");
        }
        optBox.drawRect(boxXPos + 363, boxYPos - 170, boxWidth - 363, boxHeight - 25);
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> Rectangle drawn at X " + (boxXPos + 363) + " and Y " + (boxYPos - 170) + ".\n");
        }

    }

    public void printOptions(Graphics window) {
        Graphics2D opts = (Graphics2D) window.create();

        opts.setColor(Color.WHITE);
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> Set options colour to WHITE.");
        }
        opts.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> Set the option font to Monospaced, the formatting to 1, and the size to 30.\n");
        }

        int lineX = 430;
        int line1Y = 197;
        int line2Y = 232;
        int line3Y = 267;
        int line4Y = 302;
        if (selected == 1) {
            opts.drawString("> " + option1, lineX, line1Y);
            opts.drawString("  " + option2, lineX, line2Y);
            if (!option3.isEmpty()) {
                opts.drawString("  " + option3, lineX, line3Y);
            }
            if (!option4.isEmpty()) {
                opts.drawString("  " + option4, lineX, line4Y);
            }
        } else if (selected == 2) {
            opts.drawString("  " + option1, lineX, line1Y);
            opts.drawString("> " + option2, lineX, line2Y);
            if (!option3.isEmpty()) {
                opts.drawString("  " + option3, lineX, line3Y);
            }
            if (!option4.isEmpty()) {
                opts.drawString("  " + option4, lineX, line4Y);
            }
        } else if (selected == 3 && !option3.isEmpty()) {
            opts.drawString("  " + option1, lineX, line1Y);
            opts.drawString("  " + option2, lineX, line2Y);
            opts.drawString("> " + option3, lineX, line3Y);
            if (!option4.isEmpty()) {
                opts.drawString("  " + option4, lineX, line4Y);
            }
        } else if (selected == 4 && !option4.isEmpty()) {
            opts.drawString("  " + option1, lineX, line1Y);
            opts.drawString("  " + option2, lineX, line2Y);
            opts.drawString("  " + option3, lineX, line3Y);
            opts.drawString("> " + option4, lineX, line4Y);
        } else {
            selected = 1;
            System.out.println(">>>>> LOGICAL ERROR: The selected variable is out of bounds and fell back to 1.\n\t  This is NOT a fatal error and the game will continue normally.\n\t  Ran into error at line 116 in IjuevaOptBox.java.\n");
        }
        if (Caffeine.debugInfo) {
            System.out.println(">>>>> Printed options.\n");
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

}
