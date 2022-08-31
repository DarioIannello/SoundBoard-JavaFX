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
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Dario
 */
public class SoundboardViewModel extends ViewModel implements PropertyChangeListener {

    private final Model model;
    private StringProperty btn1 = new SimpleStringProperty("Bass-Drum");
    private StringProperty btn2 = new SimpleStringProperty("Snare-Drum");
    private StringProperty btn3 = new SimpleStringProperty("Hi-Hat");
    private StringProperty btn4 = new SimpleStringProperty("Tom");
    private StringProperty btn5 = new SimpleStringProperty("Ride-Becken");
    private StringProperty btn6 = new SimpleStringProperty("Crash-Becken");
    private StringProperty btn7 = new SimpleStringProperty("Clap");
    private StringProperty btn8 = new SimpleStringProperty("Kick");
    private StringProperty btn9 = new SimpleStringProperty("Yeah!");
    private StringProperty btn0 = new SimpleStringProperty("808");

    public SoundboardViewModel(Model model) {
        this.model = model;
    }

    public void openSettings() throws IOException {
        starter.startSettings();
    }

    public void playSound(int btnNumber) {
        model.playSound(btnNumber);
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

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        switch (pce.getPropertyName()) {
            case "btn1":
                System.out.println();
                btn1.setValue(pce.getNewValue().toString());
                break;
            case "btn2":
                btn2.setValue(pce.getNewValue().toString());
                break;
            case "btn3":
                btn3.setValue(pce.getNewValue().toString());
                break;
            case "btn4":
                btn4.setValue(pce.getNewValue().toString());
                break;
            case "btn5":
                btn5.setValue(pce.getNewValue().toString());
                break;
            case "btn6":
                btn6.setValue(pce.getNewValue().toString());
                break;
            case "btn7":
                btn7.setValue(pce.getNewValue().toString());
                break;
            case "btn8":
                btn8.setValue(pce.getNewValue().toString());
                break;
            case "btn9":
                btn9.setValue(pce.getNewValue().toString());
                break;
            case "btn0":
                btn0.setValue(pce.getNewValue().toString());
                break;
        }
    }
}
