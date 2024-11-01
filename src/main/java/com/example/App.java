package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.example.repository.IClientRepository;
import com.example.repository.IUserRepository;
import com.example.repository.impl.ClientRepositoryJpaImpl;
import com.example.repository.impl.UserRepositoryJpaImpl;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("main"));
        stage.setScene(scene);
        stage.setTitle("Connexion");
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        // REPOSITORY
        IClientRepository clientRepository = new ClientRepositoryJpaImpl();
        IUserRepository userRepository = new UserRepositoryJpaImpl();

        clientRepository.selectAll();

       
        launch();
    }

}