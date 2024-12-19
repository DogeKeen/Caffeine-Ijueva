import javax.sound.sampled.*;
import java.io.*;

public class Sounds {
    AudioInputStream titleMusic, ambience, hazelTheme;
    Clip sound;
    AudioInputStream navigateSFX, navigateReverbSFX, selectSFX, selectReverbSFX, crashSFX, powerOnSFX;
    Clip navigate, select, crash, powerOn;

    public Sounds() throws Exception {
        //Music
        titleMusic = AudioSystem.getAudioInputStream(new BufferedInputStream(Sounds.class.getResourceAsStream("/music/Borealis_Uptake.wav")));
        if (titleMusic == null) {
            titleMusic = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "/resources/music/Borealis_Uptake.wav"));
        }
        ambience = AudioSystem.getAudioInputStream(new BufferedInputStream(Sounds.class.getResourceAsStream("/music/Ambience.wav")));
        if (ambience == null) {
            ambience = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "/resources/music/Ambience.wav"));
        }
        hazelTheme = AudioSystem.getAudioInputStream(new BufferedInputStream(Sounds.class.getResourceAsStream("/music/Roblox_Xbox_Main_Menu.wav")));
        if (hazelTheme == null) {
            hazelTheme = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "/resources/music/Roblox_Xbox_Main_Menu.wav"));
        }
        sound = AudioSystem.getClip();

        //SFX
        navigateSFX = AudioSystem.getAudioInputStream(new BufferedInputStream(Sounds.class.getResourceAsStream("/sfx/Navigate.wav")));
        if (navigateSFX == null) {
            navigateSFX = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "/resources/sfx/Navigate.wav"));
        }
        navigateReverbSFX = AudioSystem.getAudioInputStream(new BufferedInputStream(Sounds.class.getResourceAsStream("/sfx/NavigateReverb.wav")));
        if (navigateReverbSFX == null) {
            navigateReverbSFX = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "/resources/sfx/NavigateReverb.wav"));
        }
        selectSFX = AudioSystem.getAudioInputStream(new BufferedInputStream(Sounds.class.getResourceAsStream("/sfx/Select.wav")));
        if (selectSFX == null) {
            selectSFX = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "/resources/sfx/Select.wav"));
        }
        selectReverbSFX = AudioSystem.getAudioInputStream(new BufferedInputStream(Sounds.class.getResourceAsStream("/sfx/SelectReverb.wav")));
        if (selectReverbSFX == null) {
            selectReverbSFX = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "/resources/sfx/SelectReverb.wav"));
        }
        navigate = AudioSystem.getClip();
        select = AudioSystem.getClip();
        crashSFX = AudioSystem.getAudioInputStream(new BufferedInputStream(Sounds.class.getResourceAsStream("/sfx/Crash.wav")));
        if (crashSFX == null) {
            crashSFX = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "/resources/sfx/Crash.wav"));
        }
        crash = AudioSystem.getClip();
        powerOnSFX = AudioSystem.getAudioInputStream(new BufferedInputStream(Sounds.class.getResourceAsStream("/sfx/Power_On.wav")));
        if (powerOnSFX == null) {
            powerOnSFX = AudioSystem.getAudioInputStream(new File(System.getProperty("user.dir") + "/resources/sfx/Power_On.wav"));
        }
        powerOn = AudioSystem.getClip();
        if (Caffeine.debugInfo) {
            System.out.println(">>>>>>> Sounds have been initialised.\n");
        }
    }


    public void playSound(String soundName) throws Exception {
        //Play music
        if (soundName.equalsIgnoreCase("Borealis Uptake")) {
            try {
                sound.open(titleMusic);
                sound.start();
                sound.loop(-1);
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Playing \"Borealis Uptake\".\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to play audio \"Borealis Uptake\": " + e.getMessage(), e);
            }
        } else if (soundName.equalsIgnoreCase("Ambience")) {
            try {
                sound.open(ambience);
                sound.start();
                sound.loop(-1);
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Playing \"Ambience\".\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to play audio \"Ambience\": " + e.getMessage(), e);
            }
        } else if (soundName.equalsIgnoreCase("Tips & Additional Help")) {
            try {
                sound.open(hazelTheme);
                sound.start();
                sound.loop(-1);
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Playing \"Roblox Xbox Main Menu\".\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to play audio \"Roblox_Xbox_Main_Menu\": " + e.getMessage(), e);
            }
        }

        //Play SFX
        if (soundName.equalsIgnoreCase("Navigate")) {
            try {
                if (!navigate.isOpen()) {
                    navigate.open(navigateSFX);
                }
                navigate.setFramePosition(0);
                navigate.start();
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Played sound effect \"Navigate\".\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to play audio \"Navigate\": " + e.getMessage(), e);
            }
        } else if (soundName.equalsIgnoreCase("Navigate Reverb")) {
            try {
                if (!navigate.isOpen()) {
                    navigate.open(navigateReverbSFX);
                }
                navigate.setFramePosition(0);
                navigate.start();
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Played sound effect \"Navigate (Reverb)\".\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to play audio \"Navigate (Reverb)\": " + e.getMessage(), e);
            }
        } else if (soundName.equalsIgnoreCase("Select")) {
            try {
                if (!select.isOpen()) {
                    select.open(selectSFX);
                }
                select.setFramePosition(0);
                select.start();
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Played sound effect \"Select\".\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to play audio \"Select\": " + e.getMessage(), e);
            }
        } else if (soundName.equalsIgnoreCase("Select Reverb")) {
            try {
                if (!select.isOpen()) {
                    select.open(selectReverbSFX);
                }
                select.setFramePosition(0);
                select.start();
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Played sound effect \"Select (Reverb)\".\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to play audio \"Select (Reverb)\": " + e.getMessage(), e);
            }
        } else if (soundName.equalsIgnoreCase("Crash")) {
            try {
                if (!crash.isOpen()) {
                    crash.open(crashSFX);
                }
                crash.setFramePosition(0);
                crash.start();
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Played sound effect \"Crash\".\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to play audio \"Crash\": " + e.getMessage(), e);
            }
        } else if (soundName.equalsIgnoreCase("Power On")) {
            try {
                if (!powerOn.isOpen()) {
                    powerOn.open(powerOnSFX);
                }
                powerOn.setFramePosition(0);
                powerOn.start();
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Started cutscene audio \"Power On\".\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to play cutscene \"Power On\": " + e.getMessage(), e);
            }
        }
    }

    public void stopSounds(String soundType) throws Exception {
        if (soundType.equalsIgnoreCase("Music")) {
            try {
                sound.close();
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Stopped all music sounds.\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to stop audio: " + e.getMessage(), e);
            }
        } else if (soundType.equalsIgnoreCase("SFX")) {
            try {
                navigate.close();
                select.close();
                crash.close();
                powerOn.close();
                if (Caffeine.debugInfo) {
                    System.out.println(">>>>>>> Stopped all sound effects.\n");
                }
            } catch (Exception e) {
                throw new Exception(">>>>>>> Failed to stop audio: " + e.getMessage(), e);
            }
        }

    }
}
