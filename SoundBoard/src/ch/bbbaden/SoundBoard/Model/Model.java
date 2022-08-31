/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.SoundBoard.Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.util.ArrayList;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Model {

    private static final ArrayList<String> currentSounds = new ArrayList<>();

    private String sound1 = "Bass-Drum";
    private String sound2 = "Snare-Drum";
    private String sound3 = "Hi-Hat";
    private String sound4 = "Tom";
    private String sound5 = "Ride-Becken";
    private String sound6 = "Crash-Becken";
    private String sound7 = "Clap";
    private String sound8 = "Kick";
    private String sound9 = "Yeah!";
    private String sound10 = "808";

    protected final PropertyChangeSupport changes = new PropertyChangeSupport(this);

    public void playSound(int btnNumber) {
        String sound = currentSounds.get(btnNumber);
        try {
            Media media = new Media(new File(sound).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void renameSounds(String btn1, String btn2, String btn3, String btn4, String btn5, String btn6, String btn7, String btn8, String btn9, String btn0) {
        changes.firePropertyChange("btn1", sound1, btn1);
        changes.firePropertyChange("btn2", sound2, btn2);
        changes.firePropertyChange("btn3", sound3, btn3);
        changes.firePropertyChange("btn4", sound4, btn4);
        changes.firePropertyChange("btn5", sound5, btn5);
        changes.firePropertyChange("btn6", sound6, btn6);
        changes.firePropertyChange("btn7", sound7, btn7);
        changes.firePropertyChange("btn8", sound8, btn8);
        changes.firePropertyChange("btn9", sound9, btn9);
        changes.firePropertyChange("btn0", sound10, btn0);
        sound1 = btn1;
        sound2 = btn2;
        sound3 = btn3;
        sound4 = btn4;
        sound5 = btn5;
        sound6 = btn6;
        sound7 = btn7;
        sound8 = btn8;
        sound9 = btn9;
        sound10 = btn0;
        fillCurrentSounds();
    }

    public void switchSounds(ArrayList<String> choices) {
        int i = 0;
        do {
            String irgendeinname = choices.get(i);
            switch (irgendeinname) {
                case "BASSDRUM":
                    currentSounds.set(i, "sounds\\\\bassdrum.wav");
                    break;
                case "SNAREDRUM":
                    currentSounds.set(i, "sounds\\\\snare.wav");
                    break;
                case "HIHAT":
                    currentSounds.set(i, "sounds\\\\hat.wav");
                    break;
                case "TOM":
                    currentSounds.set(i, "sounds\\\\tom.wav");
                    break;
                case "RIDE":
                    currentSounds.set(i, "sounds\\\\ride.wav");
                    break;
                case "CRASH":
                    currentSounds.set(i, "sounds\\\\crash.wav");
                    break;
                case "CLAP":
                    currentSounds.set(i, "sounds\\\\clap.wav");
                    break;
                case "KICK":
                    currentSounds.set(i, "sounds\\\\kick.wav");
                    break;
                case "YEAH":
                    currentSounds.set(i, "sounds\\\\yeah.wav");
                    break;
                case "BASS808":
                    currentSounds.set(i, "sounds\\\\808.wav");
                    break;
                case "BASSDRUM2":
                    currentSounds.set(i, "sounds\\\\bassdrum2.wav");
                    break;
                case "SNAREDRUM2":
                    currentSounds.set(i, "sounds\\\\snare2.wav");
                    break;
                case "HIHAT2":
                    currentSounds.set(i, "sounds\\\\hat2.wav");
                    break;
                case "TOM2":
                    currentSounds.set(i, "sounds\\\\tom2.wav");
                    break;
                case "RIDE2":
                    currentSounds.set(i, "sounds\\\\ride2.wav");
                    break;
                case "CRASH2":
                    currentSounds.set(i, "sounds\\\\crash2.wav");
                    break;
                case "CLICK":
                    currentSounds.set(i, "sounds\\\\click.wav");
                    break;
                case "WOAH":
                    currentSounds.set(i, "sounds\\\\woah.wav");
                    break;
                case "SWOOSH":
                    currentSounds.set(i, "sounds\\\\swoosh.wav");
                    break;
                default:
                    currentSounds.set(i, "sounds\\\\808_2.wav");
                    break;
            }
            changes.firePropertyChange("choice" + i, "", irgendeinname);
            i++;
        } while (i < 10);
    }

    public void fillCurrentSounds() {
        currentSounds.add("sounds\\\\bassdrum.wav");
        currentSounds.add("sounds\\\\snare.wav");
        currentSounds.add("sounds\\\\hat.wav");
        currentSounds.add("sounds\\\\tom.wav");
        currentSounds.add("sounds\\\\ride.wav");
        currentSounds.add("sounds\\\\crash.wav");
        currentSounds.add("sounds\\\\clap.wav");
        currentSounds.add("sounds\\\\kick.wav");
        currentSounds.add("sounds\\\\yeah.wav");
        currentSounds.add("sounds\\\\808.wav");
    }

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        changes.addPropertyChangeListener(listener);
    }
}
