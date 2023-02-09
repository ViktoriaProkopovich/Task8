package com.example.t8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import model.*;

public class HelloController {
    public Pane paneLight;
    public Pane paneTree;
    public Pane panePresent;
    public Pane paneStar;
    public Pane paneAll;
    public Pane paneDelete;
    @FXML
    private Label welcomeText;

    @FXML
    public void initialize()
    {
        paneTree.toFront();
        ChristmasTree tree = new ChristmasTreeImpl();
        tree.draw(paneTree);
    }

    //ГИРЛЯНДА
    @FXML
    public void addLight(ActionEvent actionEvent)
    {
        paneLight.toFront();
        ChristmasTree tree  = new Girland(new ChristmasTreeImpl());
        tree.draw(paneLight);
    }
    //ЗВЕЗДА
    public void addStar(ActionEvent actionEvent)
    {
        paneStar.toFront();
        ChristmasTree tree  = new Star(new ChristmasTreeImpl());
        tree.draw(paneStar);
    }
    //ПОДАРКИ
    public void addPresents(ActionEvent actionEvent)
    {
        panePresent.toFront();
        ChristmasTree tree  = new Presents(new ChristmasTreeImpl());
        tree.draw(panePresent);
    }

    public void addAll(ActionEvent actionEvent)
    {
        paneLight.toFront();
        ChristmasTree tree  = new Presents(new Girland(new ChristmasTreeImpl()));
        tree.draw(paneLight);
    }

    public void deleteAll(ActionEvent actionEvent)
    {
        paneTree.toFront();
        paneStar.getChildren().clear();
        paneLight.getChildren().clear();
        panePresent.getChildren().clear();
        paneAll.getChildren().clear();
    }
   
}