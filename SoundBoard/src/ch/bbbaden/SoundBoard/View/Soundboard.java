/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.SoundBoard.View;

import ch.bbbaden.SoundBoard.ViewModel.SoundboardViewModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Dario
 */
public class Soundboard implements Initializable {

    private SoundboardViewModel viewModel;
    @FXML
    private Label lblSound1;
    @FXML
    private Label lblSound2;
    @FXML
    private Label lblSound3;
    @FXML
    private Label lblSound4;
    @FXML
    private Label lblSound5;
    @FXML
    private Label lblSound6;
    @FXML
    private Label lblSound7;
    @FXML
    private Label lblSound8;
    @FXML
    private Label lblSound9;
    @FXML
    private Label lblSound0;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setViewModel(SoundboardViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @FXML
    public void openSettings(ActionEvent event) throws IOException {
        viewModel.openSettings();
    }

    @FXML
    public void btn1Clicked(ActionEvent event) {
        viewModel.playSound(0);
    }

    @FXML
    public void btn2Clicked(ActionEvent event) {
        viewModel.playSound(1);
    }

    @FXML
    public void btn3Clicked(ActionEvent event) {
        viewModel.playSound(2);
    }

    @FXML
    public void btn4Clicked(ActionEvent event) {
        viewModel.playSound(3);
    }

    @FXML
    public void btn5Clicked(ActionEvent event) {
        viewModel.playSound(4);
    }

    @FXML
    public void btn6Clicked(ActionEvent event) {
        viewModel.playSound(5);
    }

    @FXML
    public void btn7Clicked(ActionEvent event) {
        viewModel.playSound(6);
    }

    @FXML
    public void btn8Clicked(ActionEvent event) {
        viewModel.playSound(7);
    }

    @FXML
    public void btn9Clicked(ActionEvent event) {
        viewModel.playSound(8);
    }

    @FXML
    public void btn0Clicked(ActionEvent event) {
        viewModel.playSound(9);
    }

    @FXML
    private void keyClicked(javafx.scene.input.KeyEvent event) {
        int soundNumber;
        try {
            soundNumber = Integer.parseInt(event.getText());
            if (soundNumber == 0) {
                soundNumber = 10;
            }
        } catch (Exception e) {
            soundNumber = -1;
        }
        if (soundNumber >= 0 && soundNumber <= 10) {
            viewModel.playSound(soundNumber - 1);
        }
    }

    public void bind() throws IOException {
        lblSound1.textProperty().bindBidirectional(viewModel.getBtn1());
        lblSound2.textProperty().bindBidirectional(viewModel.getBtn2());
        lblSound3.textProperty().bindBidirectional(viewModel.getBtn3());
        lblSound4.textProperty().bindBidirectional(viewModel.getBtn4());
        lblSound5.textProperty().bindBidirectional(viewModel.getBtn5());
        lblSound6.textProperty().bindBidirectional(viewModel.getBtn6());
        lblSound7.textProperty().bindBidirectional(viewModel.getBtn7());
        lblSound8.textProperty().bindBidirectional(viewModel.getBtn8());
        lblSound9.textProperty().bindBidirectional(viewModel.getBtn9());
        lblSound0.textProperty().bindBidirectional(viewModel.getBtn0());
    }
}
