/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.bbbaden.SoundBoard;

import ch.bbbaden.SoundBoard.Model.Model;
import ch.bbbaden.SoundBoard.View.Settings;
import ch.bbbaden.SoundBoard.View.Soundboard;
import ch.bbbaden.SoundBoard.ViewModel.SettingsViewModel;
import ch.bbbaden.SoundBoard.ViewModel.SoundboardViewModel;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Dario
 */
public class Starter extends Application {

    private Stage stage;
    private final Model model = new Model();
    private final SoundboardViewModel soundViewModel = new SoundboardViewModel(model);
    private final SettingsViewModel settingsViewModel = new SettingsViewModel(model);

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        stage.setResizable(false);
        stage.getIcons().add(new Image("/images/soundboard.png"));
        model.fillCurrentSounds();
        startSoundboard();
    }

    public void startSoundboard() throws IOException {
        final FXMLLoader loader = new FXMLLoader(getClass().getResource("View/Soundboard.fxml"));
        Parent root = loader.load();
        Soundboard view = loader.getController();
        view.setViewModel(soundViewModel);
        soundViewModel.setStarter(this);
        model.addPropertyChangeListener(soundViewModel);
        view.bind();

        Scene scene = new Scene(root);
        String css = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("Soundboard");
        stage.setScene(scene);
        stage.show();
    }

    public void startSettings() throws IOException {
        final FXMLLoader loader = new FXMLLoader(getClass().getResource("View/Settings.fxml"));
        Parent root = loader.load();
        Settings view = loader.getController();
        view.setViewModel(settingsViewModel);
        settingsViewModel.setStarter(this);
        model.addPropertyChangeListener(settingsViewModel);
        view.bind();
        view.standardNames();

        Scene scene = new Scene(root);
        String css = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("Settings");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
