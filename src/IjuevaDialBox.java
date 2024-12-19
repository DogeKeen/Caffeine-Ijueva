import java.awt.*;

public class IjuevaDialBox extends Canvas {
    private final int xPosition;
    private final int yPosition;
    private final int width;
    private final int height;
    private String dialogue1 = "";
    private String style;
    private int format;
    private Color colour;
    private int size;
    private String waitingFor;
    private String dialogue2 = "";
    private String dialogue3 = "";
    private String dialogue4 = "";
    private String excessDialogue = "";


    public IjuevaDialBox(int boxX, int boxY, int wide, int high) {
        xPosition = boxX;
        yPosition = boxY;
        width = wide;
        height = high;
        if (Caffeine.debugInfo) {
            System.out.println(">>> All dialogue box variables set.\n");
        }
    }

    public void IjuevaDial(String dial, String textFont, int textFormat, Color textColour, int fontSize, int textLine, String awaitedKey) {
        if (textLine == 1) {
            dialogue1 = dial;
            dialogue2 = "";
            dialogue3 = "";
            dialogue4 = "";
        } else if (textLine == 2) {
            dialogue2 = dial;
            dialogue1 = "";
            dialogue3 = "";
            dialogue4 = "";
        } else if (textLine == 3) {
            dialogue3 = dial;
            dialogue1 = "";
            dialogue2 = "";
            dialogue4 = "";
        } else if (textLine == 4) {
            dialogue4 = dial;
            dialogue1 = "";
            dialogue2 = "";
            dialogue3 = "";
        } else {
            System.out.println(">>> LOGICAL ERROR: Failed storing the given dialogue due to it not being within the line limit.\n\tThis is NOT a fatal error and the game will continue normally.\n\tRan into error at line 52 in IjuevaDialBox.java.\n");
        }
        if (dialogue1.length() > 38) {
            if (dialogue1.lastIndexOf(" ") >= 31) {
                excessDialogue = dialogue1.substring(31);
                dialogue2 = excessDialogue.substring(excessDialogue.indexOf(" ") + 1);
                excessDialogue = dialogue1.substring(0, 38);
                dialogue1 = excessDialogue.substring(0, excessDialogue.lastIndexOf(" "));
                excessDialogue = "";
            } else {
                dialogue2 = dialogue1.substring(35);
                dialogue1 = dialogue1.substring(0, 35);
            }
            if (dialogue2.length() > 38) {
                if (dialogue2.lastIndexOf(" ") >= 31) {
                    excessDialogue = dialogue2.substring(31);
                    dialogue3 = excessDialogue.substring(excessDialogue.indexOf(" ") + 1);
                    excessDialogue = dialogue2.substring(0, 38);
                    dialogue2 = excessDialogue.substring(0, excessDialogue.lastIndexOf(" "));
                    excessDialogue = "";
                } else {
                    dialogue3 = dialogue2.substring(35);
                    dialogue2 = dialogue2.substring(0, 35);
                }
                if (dialogue3.length() > 38) {
                    if (dialogue3.lastIndexOf(" ") >= 31) {
                        excessDialogue = dialogue3.substring(31);
                        dialogue4 = excessDialogue.substring(excessDialogue.indexOf(" ") + 1);
                        excessDialogue = dialogue3.substring(0, 38);
                        dialogue3 = excessDialogue.substring(0, excessDialogue.lastIndexOf(" "));
                        excessDialogue = "";
                    } else {
                        dialogue4 = dialogue3.substring(35);
                        dialogue3 = dialogue3.substring(0, 35);
                    }
                    if (dialogue4.length() > 38) {
                        if (dialogue1.lastIndexOf(" ") >= 31) {
                            excessDialogue = dialogue4.substring(31);
                            dialogue4 = excessDialogue.substring(0, excessDialogue.lastIndexOf(" ") + 1);
                            excessDialogue = "";
                        } else {
                            excessDialogue = dialogue4.substring(35);
                            dialogue4 = dialogue4.substring(0, 35);
                        }
                        dialogue4 = dialogue4 + "...";
                    }
                }
            }
        }
        style = textFont;
        if (textFormat == Font.PLAIN || textFormat == Font.BOLD || textFormat == Font.ITALIC) {
            format = textFormat;
        } else {
            format = Font.PLAIN;
            System.out.println(">>> LOGICAL ERROR: Failed storing the formatting due to it not being available and has fell back to 0.\n\tThis is NOT a fatal error and the game will continue normally.\n\tRan into error at line 106 in IjuevaDialBox.java.\n");
        }
        colour = textColour;
        size = fontSize;
        waitingFor = awaitedKey;
        if (Caffeine.debugInfo) {
            System.out.println(">>> All dialogue variables set.\n");
        }
    }


    public int getXPosition() {
        return xPosition;
    }
    public int getYPosition() {
        return yPosition;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }


    public void showDialogueBox(Graphics window) {
        Graphics2D dialBox = (Graphics2D) window.create();

        dialBox.setStroke(new BasicStroke(1));
        if (Caffeine.debugInfo) {
            System.out.println(">>> Set stroke thickness to 1.");
        }
        dialBox.setColor(Color.BLACK);
        if (Caffeine.debugInfo) {
            System.out.println(">>> Set box inside colour to BLACK.");
        }
        dialBox.fillRect(xPosition, yPosition, width, height);
        if (Caffeine.debugInfo) {
            System.out.println(">>> Filled rectangle at X " + xPosition + " and Y " + yPosition + ".");
        }
        dialBox.setStroke(new BasicStroke(7)); // thickness of 7.0f
        if (Caffeine.debugInfo) {
            System.out.println(">>> Set stroke thickness to 7.");
        }
        dialBox.setColor(Color.WHITE);
        if (Caffeine.debugInfo) {
            System.out.println(">>> Set box outline colour to WHITE.");
        }
        dialBox.drawRect(xPosition, yPosition, width, height);
        if (Caffeine.debugInfo) {
            System.out.println(">>> Rectangle drawn at X " + xPosition + " and Y " + yPosition + ".\n");
        }

    }

    public void printDialogue(Graphics window) {
        Graphics2D dial = (Graphics2D) window.create();

        dial.setColor(colour);
        if (Caffeine.debugInfo) {
            System.out.println(">>> Set the dialogue's colour to " + colour + ".");
        }
        dial.setFont(new Font(style, format, size));
        if (Caffeine.debugInfo) {
            System.out.println(">>> Set the dialogue font to " + style + ", the formatting to " + format + ", and the size to " + size + ".\n");
        }

        int lineX = 65;
        int line1Y = 367;
        int line2Y = 402;
        int line3Y = 437;
        int line4Y = 472;
        int lineKeyY = 507;
        dial.drawString(dialogue1, lineX, line1Y);
        dial.drawString(dialogue2, lineX, line2Y);
        dial.drawString(dialogue3, lineX, line3Y);
        dial.drawString(dialogue4, lineX, line4Y);
        if (Caffeine.debugInfo) {
            if (!excessDialogue.isEmpty()) {
                System.out.println(">>> Printed \n\t " + dialogue1 + "\n\t " + dialogue2 + "\n\t " + dialogue3 + "\n\t " + dialogue4 + "\n\twith excess dialogue.\n\t " + excessDialogue + "\n");
            } else {
                System.out.println(">>> Printed \n\t " + dialogue1 + "\n\t " + dialogue2 + "\n\t " + dialogue3 + "\n\t " + dialogue4 + "\n\twith no additional dialogue.\n");
            }
        }

        if (!waitingFor.equalsIgnoreCase("None") && !waitingFor.equalsIgnoreCase("Enter") && !waitingFor.equalsIgnoreCase("Space") && !waitingFor.equalsIgnoreCase("UP and DOWN")) {
            dial.setColor(Color.WHITE);
            dial.drawString("Press [" + waitingFor + "] to continue", lineX + 310, lineKeyY);
            if (Caffeine.debugInfo) {
                System.out.println(">>> [" + waitingFor + "] key hint labelled.\n");
            }
        } else if (waitingFor.equalsIgnoreCase("UP and DOWN")) {
            dial.setColor(Color.WHITE);
            dial.drawString("Press [Up] or [Down] to navigate", lineX + 112, line4Y);
            dial.drawString("Press [Z] to select", lineX + 350, lineKeyY);
            if (Caffeine.debugInfo) {
                System.out.println(">>> [Up] or [Down] key hint labelled.\n>>> [Z] key hint labelled.\n");
            }
        }
    }

}