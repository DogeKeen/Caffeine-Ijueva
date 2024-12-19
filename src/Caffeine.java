import java.awt.*;
import java.awt.event.*;

import static java.awt.Color.*;
import static java.awt.Font.*;

public class Caffeine {
    public static int keyPressed = 0;
    public static boolean debugInfo = false;
    public static int reputation = 0;
    //coding in this library was a terrible idea

    @SuppressWarnings("BusyWait")
    public static void main(String[] args ) throws Exception {
        System.out.println("> Game started.\n");
        Ijueva win = new Ijueva(840, 580, new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent key) {
                super.keyPressed(key);
                int keyCode = key.getKeyCode();
                int second = 5;
                if (debugInfo) {
                    System.out.println("> User pressed key [" + KeyEvent.getKeyText(keyCode) + "].");
                }
                Caffeine.keyPressed = key.getKeyCode();
                if (keyCode == KeyEvent.VK_ESCAPE) {
                    for (int i = 0; i < 5; i++) {
                        System.out.print("> Exiting game... (" + second + ")");
                        System.out.print("\r");
                        second -= 1;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print("> Exiting game...");
                    System.out.print("\r");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("> Game closed.");
                    System.exit(0);
                }
                if (keyCode == KeyEvent.VK_F3) {
                    debugInfo = !debugInfo;
                    System.out.println("> Console Output: " + debugInfo);
                }
            }
        });
        win.setTitle(" Java (Start of Demo Build 1)");
        /*
        Dialogue Formatting Rules:
          - A blank starting bullet is for narrating dialogue
        - - A hyphen starting bullet is for non-character dialogue that isn't narrating
        * - An asterisk starting bullet is for non-protagonist character dialogue
        ~ - A tilde starting bullet is for protagonist dialogue
        # - Developer dialogue! :3
         */
        String[] startDial = {"* Hummmmmm...",
                "You hear the humming of lights and something else.",
                //Pause
                "- Krrshh- Kkrash!!",
                "You slowly wake up...",
                "You appear to be in some sort of ship..",
                "You stand up and decide to look around."};
        String[] taGreeting = {"* Hey there!",
                "~ Woah! Who are you?",
                "* I'm Task Assistant, your personal AI chatbot that's designed to help you.",
                "* You can just call me T.A.",
                "~ Who.. Who am I...?",
                "* Not sure! Let me scan your system real quick.",
                //Pause
                "* Finished.",
                "* Your name is...",
                "* ...",
                "~ What?",
                "* Your name is \"Mod\"...very original..",
                "~ I didn't have a choice..?",
                "* I know, I know.",
                "* I'm just disappointed in the people who created you.",
                "* Why couldn't they give the person I'm literally soul-bound to a name better than \"Mod\"?",
                "~ Hey!",
                "* Eh, I digress.",
                "* You are a special protogen because you're actually not one!",
                "~ Then... Then why say I am..?",
                "* Because you're a \"Modded\", a heavily modified version of protogens.",
                "~ Ah.",
                //Pause
                "~ ...",
                "~ Is that it?",
                "* Oh, no silly!",
                "* There are some things I need to teach you.",
                "~ Alright, hit me.",
                "* I can't, I'm an AI stuck on your screen..",
                "~ I meant that in a figurative-",
                "~ Ugh.. Whatever. Just tell me.",
                "* You're probably wondering where you are right now so let me tell you.",
                "* You're on the \"Borealis\", a ship designed for space exploration, transporting, and fighting.",
                "~ Sounds cool.",
                "* Now, how you got here? I'm not entirely sure.",
                "~ What do you mean?",
                "* This is the first time you've powered on.",
                "* You've never turned on before this.",
                "* Which is why you don't have any memories before now.",
                "~ Ah.. Alright.",
                "* Anyways, it seems that the Borealis has crashed into something which is a big issue!",
                "* If this ship stops for too long, terrible things can happen on Kepler.",
                "~ \"Kepler\"?",
                "* Oh, right. \"Kepler\" is the name of the planet that other people have resided to living on.",
                "* They used to live on the planet \"Earth\" but...",
                "* it seems to have gotten out of hand recently..",
                "* So they decided to go destroy another planet...I guess..",
                "~ They're just trying to live.",
                "* If that was the case, I don't think they would hurt Earth to the point that they have to leave.",
                "~ Ehh....",
                "* Whatever, that's not my point.",
                "* This ship is stuck and needs help getting back on the road!"};
        String[] taHelpAccept = {"~ Sure. I'll do it.",
                "* Yes! I knew I could trust you.",
                "* Alright then, let's first start searching for something to protect us.",
                "~ Why..?",
                "* You never know who...or what.. may be on the ship!",
                "~ You're so dramatic."};
        String[] taHelpDecline = {"~ No.. I don't think I can.",
                "* What?!",
                "* Mod!! You have to!",
                "* The future depends on YOU!",
                "~ What has those humans done for me?",
                "* What??",
                "~ You said they destroyed Earth. So why help them just so they can destroy Kepler?",
                "* Mod, they created you!",
                "~ Who said I wanted to be here?",
                "* WHAT?!?",
                "~ I never wanted this. Nor did I want to be dragged into anything.",
                "~ So why are you pulling me into this?",
                "* Because if you fix the ship, you can punish the people for destroying Earth.",
                "~ Oh, bet. Let's do this.",
                "T.A. sighs in disappointment.",
                "T.A. will remember that.",
                "* Let's first start searching for something to protect us.",
                "~ Why?",
                "* You never know who, or what, could be on the ship.",
                "~ Jeez, you're dramatic.."};
        String[] taHelpExplain = {"~ What do you mean you'll help?",
                "* I'll guide you through everything and help you with difficult tasks.",
                "~ Such as..?",
                "* Such as puzzles, problems, and many more stuff!",
                "~ Ah. Alright."};
        String currentMenu = "Main";
        IjuevaDialBox dial;
        IjuevaMenus menu = new IjuevaMenus();
        IjuevaOptBox opt;
        Sounds audio = new Sounds();
        Graphics graphics = win.getGraphics();




        audio.playSound("Borealis Uptake");
        if (debugInfo) {
            System.out.println("> Waiting for 4.5 seconds...");
        }
        Thread.sleep(4500);
        if (debugInfo) {
            System.out.println("> Finished waiting.\n");
        }
        win.setTitle(" Fuurvent presents...");
        menu.showCredits(graphics);
        if (debugInfo) {
            System.out.println("> Waiting for 4 seconds...");
        }
        Thread.sleep(4000);
        if (debugInfo) {
            System.out.println("> Finished waiting.\n");
        }
        win.clearFrame(graphics, "Window");
        win.setTitle(" ");
        if (debugInfo) {
            System.out.println("> Waiting for 4 seconds...");
        }
        Thread.sleep(4000);
        if (debugInfo) {
            System.out.println("> Finished waiting.\n");
        }
        menu.setMenu("Title");
        menu.showMenu(graphics);
        win.setTitle(" Caffeine Ijueva");
        if (debugInfo) {
            System.out.println("> Waiting for 4 seconds...");
        }
        Thread.sleep(4000);
        if (debugInfo) {
            System.out.println("> Finished waiting.\n");
        }
        keyPressed = 0;
        while (true) {
            if (currentMenu.equalsIgnoreCase("Main")) {
                menu.printMenu(graphics);
                win.setTitle(" Caffeine Ijueva   |   Main Menu");

                if (debugInfo) {
                    System.out.println("> Waiting for user input...");
                }
                while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) && !(keyPressed == KeyEvent.VK_UP) && !(keyPressed == KeyEvent.VK_DOWN)) {
                    Thread.sleep(10);
                }
                if (keyPressed == KeyEvent.VK_DOWN) {
                    win.clearFrame(graphics, "Menu");
                    menu.selectMove("Add", 5);
                    menu.printMenu(graphics);
                    audio.playSound("Navigate Reverb");
                    keyPressed = 0;
                }
                if (keyPressed == KeyEvent.VK_UP) {
                    win.clearFrame(graphics, "Menu");
                    menu.selectMove("Subtract", 5);
                    menu.printMenu(graphics);
                    audio.playSound("Navigate Reverb");
                    keyPressed = 0;
                }
                if (keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) {
                    if (menu.getSelected() == 1) {
                        currentMenu = "Confirm";
                        menu.setMenu("Confirm");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else if (menu.getSelected() == 2) {
                        currentMenu = "Denied";
                        menu.setMenu("Denied");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else if (menu.getSelected() == 3) {
                        currentMenu = "Options";
                        menu.setMenu("Options");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else if (menu.getSelected() == 4) {
                        currentMenu = "Denied";
                        menu.setMenu("Denied");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else if (menu.getSelected() == 5) {
                        win.clearFrame(graphics, "Window");
                        audio.playSound("Select");
                        audio.stopSounds("Music");
                        win.setTitle(" Java (Demo Build 1)");
                        System.out.print("> Exiting game...");
                        System.out.print("\r");
                        Thread.sleep(1000);
                        System.out.println("> Game closed.");
                        System.exit(0);
                    } else {
                        System.out.println("> LOGICAL ERROR: The currently selected option is not available.\n  Game closed to prevent further issues.\n  Ran into error at line 255 in Caffeine.java.\n");
                        System.exit(1);
                    }
                }

                keyPressed = 0;

            }

            if (currentMenu.equalsIgnoreCase("Confirm")) {
                menu.printMenu(graphics);
                win.setTitle(" Caffeine Ijueva   |   Confirmation");

                if (debugInfo) {
                    System.out.println("> Waiting for user input...");
                }
                while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) && !(keyPressed == KeyEvent.VK_UP) && !(keyPressed == KeyEvent.VK_DOWN)) {
                    Thread.sleep(10);
                }
                if (keyPressed == KeyEvent.VK_DOWN) {
                    win.clearFrame(graphics, "Menu");
                    menu.selectMove("Add", 2);
                    menu.printMenu(graphics);
                    audio.playSound("Navigate Reverb");
                    keyPressed = 0;
                }
                if (keyPressed == KeyEvent.VK_UP) {
                    win.clearFrame(graphics, "Menu");
                    menu.selectMove("Subtract", 2);
                    menu.printMenu(graphics);
                    audio.playSound("Navigate Reverb");
                    keyPressed = 0;
                }
                if (keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) {
                    if (menu.getSelected() == 1) {
                        win.clearFrame(graphics, "Window");
                        audio.playSound("Select Reverb");
                        audio.stopSounds("Music");
                        win.setTitle(" Caffeine Ijueva");
                        break;
                    } else if (menu.getSelected() == 2) {
                        currentMenu = "Main";
                        menu.setMenu("Title");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else {
                        System.out.println("> LOGICAL ERROR: The currently selected option is not available.\n  Game closed to prevent further issues.\n  Ran into error at line 301 in Caffeine.java.\n");
                        System.exit(1);
                    }
                }

                keyPressed = 0;
            }

            if (currentMenu.equalsIgnoreCase("Denied")) {
                menu.printMenu(graphics);
                win.setTitle(" Caffeine Ijueva   |   Denied");

                if (debugInfo) {
                    System.out.println("> Waiting for 3 seconds...");
                }
                Thread.sleep(3000);
                if (debugInfo) {
                    System.out.println("> Finished waiting.\n");
                }

                currentMenu = "Main";
                menu.setMenu("Title");
                win.clearFrame(graphics, "Menu");

                keyPressed = 0;
            }

            if (currentMenu.equalsIgnoreCase("Options")) {
                menu.printMenu(graphics);
                win.setTitle(" Caffeine Ijueva   |   Options");

                if (debugInfo) {
                    System.out.println("> Waiting for user input...");
                }
                while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) && !(keyPressed == KeyEvent.VK_UP) && !(keyPressed == KeyEvent.VK_DOWN)) {
                    Thread.sleep(10);
                }
                if (keyPressed == KeyEvent.VK_DOWN) {
                    win.clearFrame(graphics, "Menu");
                    menu.selectMove("Add", 5);
                    menu.printMenu(graphics);
                    audio.playSound("Navigate Reverb");
                    keyPressed = 0;
                }
                if (keyPressed == KeyEvent.VK_UP) {
                    win.clearFrame(graphics, "Menu");
                    menu.selectMove("Subtract", 5);
                    menu.printMenu(graphics);
                    audio.playSound("Navigate Reverb");
                    keyPressed = 0;
                }
                if (keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) {
                    if (menu.getSelected() == 1) {
                        currentMenu = "Denied";
                        menu.setMenu("Denied");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else if (menu.getSelected() == 2) {
                        currentMenu = "Denied";
                        menu.setMenu("Denied");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else if (menu.getSelected() == 3) {
                        currentMenu = "Denied";
                        menu.setMenu("Denied");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else if (menu.getSelected() == 4) {
                        currentMenu = "Denied";
                        menu.setMenu("Denied");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else if (menu.getSelected() == 5) {
                        currentMenu = "Main";
                        menu.setMenu("Title");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else {
                        System.out.println("> LOGICAL ERROR: The currently selected option is not available.\n  Game closed to prevent further issues.\n  Ran into error at line 379 in Caffeine.java.\n");
                        System.exit(1);
                    }
                }

                keyPressed = 0;

            }

            if (currentMenu.equalsIgnoreCase("Debug")) {
                menu.printMenu(graphics);
                win.setTitle(" Caffeine Ijueva   |   Debug Features");

                if (debugInfo) {
                    System.out.println("> Waiting for user input...");
                }
                while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) && !(keyPressed == KeyEvent.VK_UP) && !(keyPressed == KeyEvent.VK_DOWN)) {
                    Thread.sleep(10);
                }
                if (keyPressed == KeyEvent.VK_DOWN) {
                    win.clearFrame(graphics, "Menu");
                    menu.selectMove("Add", 3);
                    menu.printMenu(graphics);
                    audio.playSound("Navigate Reverb");
                    keyPressed = 0;
                }
                if (keyPressed == KeyEvent.VK_UP) {
                    win.clearFrame(graphics, "Menu");
                    menu.selectMove("Subtract", 3);
                    menu.printMenu(graphics);
                    audio.playSound("Navigate Reverb");
                    keyPressed = 0;
                }
                if (keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) {
                    if (menu.getSelected() == 1) {
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                        menu.printMenu(graphics);
                    } else if (menu.getSelected() == 1) {
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                        menu.printMenu(graphics);
                    } else if (menu.getSelected() == 3) {
                        currentMenu = "Options";
                        menu.setMenu("Options");
                        win.clearFrame(graphics, "Menu");
                        audio.playSound("Select Reverb");
                    } else {
                        System.out.println("> LOGICAL ERROR: The currently selected option is not available.\n  Game closed to prevent further issues.\n  Ran into error at line 427 in Caffeine.java.\n");
                        System.exit(1);
                    }
                }

                keyPressed = 0;

            }

        }




        //Intro
        Thread.sleep(4000);
        keyPressed = 0;
        win.setTitle(" Caffeine Ijueva   |   Unknown area");
        audio.stopSounds("Music");
        audio.stopSounds("SFX");
        audio.playSound("Ambience");
        if (debugInfo) {
            System.out.println("> Waiting for 3 seconds...");
        }
        Thread.sleep(3000);
        if (debugInfo) {
            System.out.println("> Finished waiting.\n");
        }

        //Dialogue box
        dial = new IjuevaDialBox(50, 330, 725, 195);
        dial.IjuevaDial("", "Monospaced", BOLD, WHITE, 30, 1, "None");
        dial.showDialogueBox(graphics);
        dial.printDialogue(graphics);
        if (debugInfo) {
            System.out.println("> Loaded dialogue box.\n");
        }

        if (debugInfo) {
            System.out.println("> Waiting for 0.5 seconds...");
        }
        Thread.sleep(500);
        if (debugInfo) {
            System.out.println("> Finished waiting.\n");
        }

        //Intro dialogue
        dial.showDialogueBox(graphics);
        for (String str : startDial) {
            win.clearFrame(graphics, "Dialogue");
            if (str.contains("Krrshh")) {
                win.clearFrame(graphics, "Window");
                if (debugInfo) {
                    System.out.println("> Waiting for 5 seconds...");
                }
                Thread.sleep(5000);
                if (debugInfo) {
                    System.out.println("> Finished waiting.\n");
                }
                keyPressed = 0;
                dial.showDialogueBox(graphics);
                audio.stopSounds("Music");
                audio.playSound("Crash");
                dial.IjuevaDial(str, "Monospaced", BOLD, WHITE, 30, 1, "None");
                dial.printDialogue(graphics);
                Thread.sleep(8000);
                keyPressed = 0;
            }
            if (str.contains("You slowly wake up")) {
                dial.IjuevaDial(str, "Monospaced", BOLD, WHITE, 30, 1, "None");
                dial.printDialogue(graphics);

                if (debugInfo) {
                    System.out.println("> Waiting for cutscene to finish...");
                }
                audio.playSound("Power On");
                menu.playCutscene(graphics, "Power On");
                if (debugInfo) {
                    System.out.println("> Finished waiting.\n");
                }

                keyPressed = 0;
                if (debugInfo) {
                    System.out.println("> Waiting for user input...");
                }
                while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
                    Thread.sleep(10);
                }
                audio.playSound("Select");
                keyPressed = 0;
                win.clearFrame(graphics,"Window");
                dial.showDialogueBox(graphics);
                continue;
            }
            if (str.contains("some sort of ship")) {
                win.setTitle(" Caffeine Ijueva   |   A ship");
            }
            dial.IjuevaDial(str, "Monospaced", BOLD, WHITE, 30, 1, "Z");
            dial.printDialogue(graphics);

            if (debugInfo) {
                System.out.println("> Waiting for user input...");
            }
            while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
                Thread.sleep(10);
            }
            audio.playSound("Select");
            keyPressed = 0;
        }

        //Hazel
        keyPressed = 0;
        audio.stopSounds("Music");
        audio.playSound("Tips & Additional Help");
        for (String str : taGreeting) {
            win.clearFrame(graphics, "Dialogue");
            if (str.contains("Finished.")) {
                win.clearFrame(graphics, "Window");
                if (debugInfo) {
                    System.out.println("> Waiting for 4 seconds...");
                }
                Thread.sleep(4000);
                if (debugInfo) {
                    System.out.println("> Finished waiting.\n");
                }
                keyPressed = 0;
                dial.showDialogueBox(graphics);

            }
            if (str.contains("~ ...")) {
                win.clearFrame(graphics, "Window");
                if (debugInfo) {
                    System.out.println("> Waiting for 4 seconds...");
                }
                Thread.sleep(4000);
                if (debugInfo) {
                    System.out.println("> Finished waiting.\n");
                }
                keyPressed = 0;
                dial.showDialogueBox(graphics);

            }
            if (str.contains("a ship designed for space exploration")) {
                win.setTitle(" Caffeine Ijueva   |   Borealis");

            }
            dial.IjuevaDial(str, "Monospaced", BOLD, WHITE, 30, 1, "Z");
            dial.printDialogue(graphics);

            if (debugInfo) {
                System.out.println("> Waiting for user input...");
            }
            while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
                Thread.sleep(10);
            }
            audio.playSound("Select");
            keyPressed = 0;

        }
        win.clearFrame(graphics, "Dialogue");
        dial.IjuevaDial("* You think you can fix this puppy up? I'll help you every step along the way!", "Monospaced", BOLD, WHITE, 30, 1, "UP and DOWN");
        opt = new IjuevaOptBox(dial.getXPosition(), dial.getYPosition(), dial.getWidth(), dial.getHeight());
        opt.IjuevaOpts("Yes", "No", "\"Help\"?", "");
        opt.showOptionsBox(graphics);
        dial.printDialogue(graphics);
        opt.printOptions(graphics);
        if (debugInfo) {
            System.out.println("> Waiting for user input...");
        }
        while (true) {
            while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) && !(keyPressed == KeyEvent.VK_UP) && !(keyPressed == KeyEvent.VK_DOWN)) {
                Thread.sleep(10);
            }
            if (keyPressed == KeyEvent.VK_DOWN) {
                win.clearFrame(graphics, "Options");
                opt.selectMove("Add", 3);
                opt.printOptions(graphics);
                audio.playSound("Navigate");
            }
            if (keyPressed == KeyEvent.VK_UP) {
                win.clearFrame(graphics, "Options");
                opt.selectMove("Subtract", 3);
                opt.printOptions(graphics);
                audio.playSound("Navigate");
            }

            if (keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) {
                audio.playSound("Select");
                break;
            }
            keyPressed = 0;
        }
        keyPressed = 0;
        while (true) {
            if (opt.getSelected() == 1) {
                reputation++;
                win.clearFrame(graphics, "Window");
                dial.showDialogueBox(graphics);
                for (String str : taHelpAccept) {
                    win.clearFrame(graphics, "Dialogue");
                    dial.IjuevaDial(str, "Monospaced", BOLD, WHITE, 30, 1, "Z");
                    dial.printDialogue(graphics);

                    if (debugInfo) {
                        System.out.println("> Waiting for user input...");
                    }
                    while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
                        Thread.sleep(10);
                    }
                    audio.playSound("Select");
                    keyPressed = 0;
                }
                break;
            } else if (opt.getSelected() == 2) {
                reputation--;
                win.clearFrame(graphics, "Window");
                dial.showDialogueBox(graphics);
                for (String str : taHelpDecline) {
                    win.clearFrame(graphics, "Dialogue");
                    if (str.contains("T.A. will")) {
                        dial.IjuevaDial("T.A. sighs in disappointment.", "Monospaced", BOLD, WHITE, 30, 1, "Z");
                        dial.printDialogue(graphics);
                        dial.IjuevaDial(str, "Monospaced", BOLD, WHITE, 30, 2, "Z");
                        dial.printDialogue(graphics);

                        if (debugInfo) {
                            System.out.println("> Waiting for user input...");
                        }
                        while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
                            Thread.sleep(10);
                        }
                        audio.playSound("Select");
                        keyPressed = 0;
                        continue;
                    }

                    dial.IjuevaDial(str, "Monospaced", BOLD, WHITE, 30, 1, "Z");
                    dial.printDialogue(graphics);

                    if (debugInfo) {
                        System.out.println("> Waiting for user input...");
                    }
                    while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
                        Thread.sleep(10);
                    }
                    audio.playSound("Select");
                    keyPressed = 0;
                }
                break;
            } else if (opt.getSelected() == 3) {
                win.clearFrame(graphics, "Window");
                dial.showDialogueBox(graphics);
                for (String str : taHelpExplain) {
                    win.clearFrame(graphics, "Dialogue");
                    dial.IjuevaDial(str, "Monospaced", BOLD, WHITE, 30, 1, "Z");
                    dial.printDialogue(graphics);

                    if (debugInfo) {
                        System.out.println("> Waiting for user input...");
                    }
                    while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
                        Thread.sleep(10);
                    }
                    audio.playSound("Select");
                    keyPressed = 0;
                }
                win.clearFrame(graphics, "Dialogue");
                dial.IjuevaDial("* So? What will it be?", "Monospaced", BOLD, WHITE, 30, 1, "Z");
                opt.IjuevaOpts("Yes", "No", "", "");
                opt.showOptionsBox(graphics);
                dial.printDialogue(graphics);
                opt.printOptions(graphics);
                if (debugInfo) {
                    System.out.println("> Waiting for user input...");
                }
                while (true) {
                    while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) && !(keyPressed == KeyEvent.VK_UP) && !(keyPressed == KeyEvent.VK_DOWN)) {
                        Thread.sleep(10);
                    }
                    if (keyPressed == KeyEvent.VK_DOWN) {
                        win.clearFrame(graphics, "Options");
                        opt.selectMove("Add", 2);
                        opt.printOptions(graphics);
                        audio.playSound("Navigate");
                    }
                    if (keyPressed == KeyEvent.VK_UP) {
                        win.clearFrame(graphics, "Options");
                        opt.selectMove("Subtract", 2);
                        opt.printOptions(graphics);
                        audio.playSound("Navigate");
                    }

                    if (keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) {
                        audio.playSound("Select");
                        break;
                    }
                    keyPressed = 0;
                }
                keyPressed = 0;
            }
        }

        audio.stopSounds("Music");
        win.setTitle(" Java (End of Demo Build 1)");
        win.clearFrame(graphics, "Dialogue");
        dial.IjuevaDial("# Hey there! This is Fuurvent, the developer.", "Monospaced", BOLD, WHITE, 30, 1, "Z");
        dial.printDialogue(graphics);
        dial.IjuevaDial("Thanks for playing my game!", "Monospaced", BOLD, WHITE, 30, 3, "Z");
        dial.printDialogue(graphics);
        if (debugInfo) {
            System.out.println("> Waiting for user input...");
        }
        while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
            Thread.sleep(10);
        }
        audio.playSound("Select");
        keyPressed = 0;
        win.clearFrame(graphics, "Dialogue");
        dial.IjuevaDial("# I know there are a couple bugs and I'm trying to get them patched up.", "Monospaced", BOLD, WHITE, 30, 1, "Z");
        dial.printDialogue(graphics);
        if (debugInfo) {
            System.out.println("> Waiting for user input...");
        }
        while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
            Thread.sleep(10);
        }
        audio.playSound("Select");
        keyPressed = 0;
        win.clearFrame(graphics, "Dialogue");
        dial.IjuevaDial("# But this is where the demo ends!", "Monospaced", BOLD, WHITE, 30, 1, "Z");
        dial.printDialogue(graphics);
        if (debugInfo) {
            System.out.println("> Waiting for user input...");
        }
        while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
            Thread.sleep(10);
        }
        audio.playSound("Select");
        keyPressed = 0;
        win.clearFrame(graphics, "Dialogue");
        dial.IjuevaDial("# Sorry for the lack of vision btw.", "Monospaced", BOLD, WHITE, 30, 1, "Z");
        dial.printDialogue(graphics);
        dial.IjuevaDial("None of the art is finished yet.", "Monospaced", BOLD, WHITE, 30, 2, "Z");
        dial.printDialogue(graphics);
        if (debugInfo) {
            System.out.println("> Waiting for user input...");
        }
        while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
            Thread.sleep(10);
        }
        audio.playSound("Select");
        keyPressed = 0;
        win.clearFrame(graphics, "Dialogue");
        dial.IjuevaDial("# Anyways, after this dialogue, the game will close itself.", "Monospaced", BOLD, WHITE, 30, 1, "Z");
        dial.printDialogue(graphics);
        dial.IjuevaDial("Have a good rest of your day. :3", "Monospaced", BOLD, WHITE, 30, 3, "Z");
        dial.printDialogue(graphics);
        dial.IjuevaDial("- Fuurvent", "Monospaced", BOLD, WHITE, 30, 4, "Z");
        dial.printDialogue(graphics);
        if (debugInfo) {
            System.out.println("> Waiting for user input...");
        }
        while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE)) {
            Thread.sleep(10);
        }
        audio.playSound("Select");
        keyPressed = 0;
        win.clearFrame(graphics, "Window");
        System.out.print("> Exiting game...");
        System.out.print("\r");
        Thread.sleep(1000);
        System.out.println("> Game closed.");
        System.exit(0);


















        //Everything past this point is past-demo stuff!

        win.clearFrame(graphics, "Dialogue");
        dial.IjuevaDial("What do you want to check?", "Monospaced", BOLD, WHITE, 30, 1, "UP and DOWN");
        opt.IjuevaOpts("Crate", "Wardrobe", "Hallway", "");
        opt.showOptionsBox(graphics);
        dial.printDialogue(graphics);
        opt.printOptions(graphics);

        if (debugInfo) {
            System.out.println("> Waiting for user input...");
        }
        while (true) {
            while (!(keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) && !(keyPressed == KeyEvent.VK_UP) && !(keyPressed == KeyEvent.VK_DOWN)) {
                Thread.sleep(10);
            }
            if (keyPressed == KeyEvent.VK_DOWN) {
                win.clearFrame(graphics, "Options");
                opt.selectMove("Add", 3);
                opt.printOptions(graphics);
                audio.playSound("Navigate");
                keyPressed = 0;
            }
            if (keyPressed == KeyEvent.VK_UP) {
                win.clearFrame(graphics, "Options");
                opt.selectMove("Subtract", 3);
                opt.printOptions(graphics);
                audio.playSound("Navigate");
                keyPressed = 0;
            }

            if (keyPressed == KeyEvent.VK_Z || keyPressed == KeyEvent.VK_ENTER || keyPressed == KeyEvent.VK_SPACE) {
                audio.playSound("Select");
                break;
            }
        }
        keyPressed = 0;

    }
}
