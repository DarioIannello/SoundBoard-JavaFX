/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.SoundBoard.ViewModel;

import ch.bbbaden.SoundBoard.Model.Model;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Dario
 */
public class SettingsViewModel extends ViewModel implements PropertyChangeListener {

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
    private String choiceSound1 = "BASSDRUM";
    private String choiceSound2 = "SNAREDRUM";
    private String choiceSound3 = "HIHAT";
    private String choiceSound4 = "TOM";
    private String choiceSound5 = "RIDE";
    private String choiceSound6 = "CRASH";
    private String choiceSound7 = "CLAP";
    private String choiceSound8 = "KICK";
    private String choiceSound9 = "YEAH";
    private String choiceSound0 = "BASS808";

    private final Model model;
    private StringProperty btn1 = new SimpleStringProperty(sound1);
    private StringProperty btn2 = new SimpleStringProperty(sound2);
    private StringProperty btn3 = new SimpleStringProperty(sound3);
    private StringProperty btn4 = new SimpleStringProperty(sound4);
    private StringProperty btn5 = new SimpleStringProperty(sound5);
    private StringProperty btn6 = new SimpleStringProperty(sound6);
    private StringProperty btn7 = new SimpleStringProperty(sound7);
    private StringProperty btn8 = new SimpleStringProperty(sound8);
    private StringProperty btn9 = new SimpleStringProperty(sound9);
    private StringProperty btn0 = new SimpleStringProperty(sound10);

    public SettingsViewModel(Model model) {
        this.model = model;
    }

    public void setOldValues(String valueBtn0) {
    }

    public void openSoundboard() throws IOException {
        btn1.setValue(sound1);
        btn2.setValue(sound2);
        btn3.setValue(sound3);
        btn4.setValue(sound4);
        btn5.setValue(sound5);
        btn6.setValue(sound6);
        btn7.setValue(sound7);
        btn8.setValue(sound8);
        btn9.setValue(sound9);
        btn0.setValue(sound10);
        starter.startSoundboard();
    }

    public void renameSounds(String valueBtn1, String valueBtn2, String valueBtn3, String valueBtn4, String valueBtn5, String valueBtn6, String valueBtn7, String valueBtn8, String valueBtn9, String valueBtn0) {
        sound1 = valueBtn1;
        sound2 = valueBtn2;
        sound3 = valueBtn3;
        sound4 = valueBtn4;
        sound5 = valueBtn5;
        sound6 = valueBtn6;
        sound7 = valueBtn7;
        sound8 = valueBtn8;
        sound9 = valueBtn9;
        sound10 = valueBtn0;
        model.renameSounds(btn1.getValue(), btn2.getValue(), btn3.getValue(), btn4.getValue(), btn5.getValue(), btn6.getValue(), btn7.getValue(), btn8.getValue(), btn9.getValue(), btn0.getValue());
    }

    public void switchSounds(String choice1, String choice2, String choice3, String choice4, String choice5, String choice6, String choice7, String choice8, String choice9, String choice0) {
        ArrayList<String> allChoices = new ArrayList<>();
        allChoices.add(choice1);
        allChoices.add(choice2);
        allChoices.add(choice3);
        allChoices.add(choice4);
        allChoices.add(choice5);
        allChoices.add(choice6);
        allChoices.add(choice7);
        allChoices.add(choice8);
        allChoices.add(choice9);
        allChoices.add(choice0);
        model.switchSounds(allChoices);
    }

    public StringProperty getBtn1() {
        return btn1;
    }

    public StringProperty getBtn2() {
        return btn2;
    }

    public StringProperty getBtn3() {
        return btn3;
    }

    public StringProperty getBtn4() {
        return btn4;
    }

    public StringProperty getBtn5() {
        return btn5;
    }

    public StringProperty getBtn6() {
        return btn6;
    }

    public StringProperty getBtn7() {
        return btn7;
    }

    public StringProperty getBtn8() {
        return btn8;
    }

    public StringProperty getBtn9() {
        return btn9;
    }

    public StringProperty getBtn0() {
        return btn0;
    }

    public String getChoiceSound1() {
        return choiceSound1;
    }

    public String getChoiceSound2() {
        return choiceSound2;
    }

    public String getChoiceSound3() {
        return choiceSound3;
    }

    public String getChoiceSound4() {
        return choiceSound4;
    }

    public String getChoiceSound5() {
        return choiceSound5;
    }

    public String getChoiceSound6() {
        return choiceSound6;
    }

    public String getChoiceSound7() {
        return choiceSound7;
    }

    public String getChoiceSound8() {
        return choiceSound8;
    }

    public String getChoiceSound9() {
        return choiceSound9;
    }

    public String getChoiceSound0() {
        return choiceSound0;
    }

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        switch (pce.getPropertyName()) {
            case "choice0":
                choiceSound1 = pce.getNewValue().toString();
                break;
            case "choice1":
                choiceSound2 = pce.getNewValue().toString();
                break;
            case "choice2":
                choiceSound3 = pce.getNewValue().toString();
                break;
            case "choice3":
                choiceSound4 = pce.getNewValue().toString();
                break;
            case "choice4":
                choiceSound5 = pce.getNewValue().toString();
                break;
            case "choice5":
                choiceSound6 = pce.getNewValue().toString();
                break;
            case "choice6":
                choiceSound7 = pce.getNewValue().toString();
                break;
            case "choice7":
                choiceSound8 = pce.getNewValue().toString();
                break;
            case "choice8":
                choiceSound9 = pce.getNewValue().toString();
                break;
            default:
                choiceSound0 = pce.getNewValue().toString();
                break;
        }
    }
}
