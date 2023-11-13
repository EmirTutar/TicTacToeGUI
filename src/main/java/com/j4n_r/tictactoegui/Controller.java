package com.j4n_r.tictactoegui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller extends Game{
    @FXML
    private Label welcomeText;

    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void button0OnAction() {
        button0.setText(changeArrayOnClick(0));
    }
    @FXML
    protected void button1OnAction() {
        button1.setText(changeArrayOnClick(1));

    } @FXML
    protected void button2OnAction() {
        button2.setText(changeArrayOnClick(2));
    } @FXML
    protected void button3OnAction() {
        button3.setText(changeArrayOnClick(3));
    } @FXML
    protected void button4OnAction() {
        button4.setText(changeArrayOnClick(4));
    } @FXML
    protected void button5OnAction() {
        button5.setText(changeArrayOnClick(5));
    } @FXML
    protected void button6OnAction() {
        button6.setText(changeArrayOnClick(6));
    } @FXML
    protected void button7OnAction() {
        button7.setText(changeArrayOnClick(7));
    }
    @FXML
    protected void button8OnAction() {
        button8.setText(changeArrayOnClick(8));
    }






}