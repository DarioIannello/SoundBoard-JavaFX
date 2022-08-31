/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.SoundBoard.View;

import ch.bbbaden.SoundBoard.ViewModel.SettingsViewModel;
import ch.bbbaden.SoundBoard.entity.Sounds;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Dario
 */
public class Settings implements Initializable {

    private SettingsViewModel viewModel;
    @FXML
    private TextField txtBtn1;
    @FXML
    private TextField txtBtn2;
    @FXML
    private TextField txtBtn3;
    @FXML
    private TextField txtBtn4;
    @FXML
    private TextField txtBtn5;
    @FXML
    private TextField txtBtn6;
    @FXML
    private TextField txtBtn7;
    @FXML
    private TextField txtBtn8;
    @FXML
    private TextField txtBtn9;
    @FXML
    private TextField txtBtn0;
    @FXML
    private ChoiceBox<String> choiceBtn1;
    @FXML
    private ChoiceBox<String> choiceBtn2;
    @FXML
    private ChoiceBox<String> choiceBtn3;
    @FXML
    private ChoiceBox<String> choiceBtn4;
    @FXML
    private ChoiceBox<String> choiceBtn5;
    @FXML
    private ChoiceBox<String> choiceBtn6;
    @FXML
    private ChoiceBox<String> choiceBtn7;
    @FXML
    private ChoiceBox<String> choiceBtn8;
    @FXML
    private ChoiceBox<String> choiceBtn9;
    @FXML
    private ChoiceBox<String> choiceBtn0;
    @FXML
    private Label lblTitel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (Sounds sounds : Sounds.values()) {
            choiceBtn1.getItems().addAll(sounds.toString());
            choiceBtn2.getItems().addAll(sounds.toString());
            choiceBtn3.getItems().addAll(sounds.toString());
            choiceBtn4.getItems().addAll(sounds.toString());
            choiceBtn5.getItems().addAll(sounds.toString());
            choiceBtn6.getItems().addAll(sounds.toString());
            choiceBtn7.getItems().addAll(sounds.toString());
            choiceBtn8.getItems().addAll(sounds.toString());
            choiceBtn9.getItems().addAll(sounds.toString());
            choiceBtn0.getItems().addAll(sounds.toString());
        }
    }

    public void setViewModel(SettingsViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @FXML
    public void exitBtnPressed(ActionEvent event) throws IOException {
        viewModel.openSoundboard();
    }

    @FXML
    public void saveSoundnames(ActionEvent event) throws IOException {
        lblTitel.setText("Sounds Edited");
        viewModel.switchSounds(choiceBtn1.getValue(), choiceBtn2.getValue(), choiceBtn3.getValue(), choiceBtn4.getValue(), choiceBtn5.getValue(), choiceBtn6.getValue(), choiceBtn7.getValue(), choiceBtn8.getValue(), choiceBtn9.getValue(), choiceBtn0.getValue());
        viewModel.renameSounds(txtBtn1.getText(), txtBtn2.getText(), txtBtn3.getText(), txtBtn4.getText(), txtBtn5.getText(), txtBtn6.getText(), txtBtn7.getText(), txtBtn8.getText(), txtBtn9.getText(), txtBtn0.getText());
    }

    public void standardNames() {
        choiceBtn1.setValue(viewModel.getChoiceSound1());
        choiceBtn2.setValue(viewModel.getChoiceSound2());
        choiceBtn3.setValue(viewModel.getChoiceSound3());
        choiceBtn4.setValue(viewModel.getChoiceSound4());
        choiceBtn5.setValue(viewModel.getChoiceSound5());
        choiceBtn6.setValue(viewModel.getChoiceSound6());
        choiceBtn7.setValue(viewModel.getChoiceSound7());
        choiceBtn8.setValue(viewModel.getChoiceSound8());
        choiceBtn9.setValue(viewModel.getChoiceSound9());
        choiceBtn0.setValue(viewModel.getChoiceSound0());
    }

    public void bind() {
        txtBtn1.textProperty().bindBidirectional(viewModel.getBtn1());
        txtBtn2.textProperty().bindBidirectional(viewModel.getBtn2());
        txtBtn3.textProperty().bindBidirectional(viewModel.getBtn3());
        txtBtn4.textProperty().bindBidirectional(viewModel.getBtn4());
        txtBtn5.textProperty().bindBidirectional(viewModel.getBtn5());
        txtBtn6.textProperty().bindBidirectional(viewModel.getBtn6());
        txtBtn7.textProperty().bindBidirectional(viewModel.getBtn7());
        txtBtn8.textProperty().bindBidirectional(viewModel.getBtn8());
        txtBtn9.textProperty().bindBidirectional(viewModel.getBtn9());
        txtBtn0.textProperty().bindBidirectional(viewModel.getBtn0());
    }
}
