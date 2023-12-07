package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.*;

import static java.lang.Math.pow;

import java.io.IOException;

public class Controller {
    public TextField rez;
    double broj, answer;
    int choice;
    @FXML
    Button nula = new Button("0");
    Button jedan = new Button("1");
    Button dva = new Button("2");
    Button tri = new Button("3");
    Button cetiri = new Button("4");
    Button pet = new Button("5");
    Button sest = new Button("6");
    Button sedam = new Button("7");
    Button osam = new Button("8");
    Button devet = new Button("9");

    public void calc() {
        switch (choice) {
            case 1:
                answer = broj + Double.parseDouble(rez.getText());
                rez.setText(Double.toString(answer));
                break;
            case 2:
                answer = broj - Double.parseDouble(rez.getText());
                rez.setText(Double.toString(answer));
                break;
            case 3:
                answer = broj * Double.parseDouble(rez.getText());
                rez.setText(Double.toString(answer));
                break;
            case 4:
                answer = broj / Double.parseDouble(rez.getText());
                rez.setText(Double.toString(answer));
                break;
            case 5:
                answer = broj % Double.parseDouble(rez.getText());
                rez.setText(Double.toString(answer));
                break;
        }
    }

    public void t0(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"0");
    }
    public void t1(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"1");
    }
    public void t2(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"2");
    }
    public void t3(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"3");
    }
    public void t4(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"4");
    }
    public void t5(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"5");
    }
    public void t6(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"6");
    }
    public void t7(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"7");
    }
    public void t8(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"8");
    }
    public void t9(ActionEvent actionEvent) {
        rez.setText(rez.getText()+"9");
    }

    public void add(ActionEvent actionEvent) {
        broj = Double.parseDouble(rez.getText());
        choice = 1;
        rez.setText(" ");
    }

    public void subtract(ActionEvent actionEvent) {
        broj = Double.parseDouble(rez.getText());
        choice = 2;
        rez.setText(" ");
    }

    public void mul(ActionEvent actionEvent) {
        broj = Double.parseDouble(rez.getText());
        choice = 3;
        rez.setText(" ");
    }
    public void div(ActionEvent actionEvent) {
        broj = Double.parseDouble(rez.getText());
        choice = 4;
        rez.setText(" ");
    }

    public void mod(ActionEvent actionEvent) {
        broj = Double.parseDouble(rez.getText());
        choice = 5;
        rez.setText(" ");
    }

    public void eq(ActionEvent actionEvent) { calc(); }

    public void dot(ActionEvent actionEvent) {
        int br = Double.toString(broj).length();
        rez.setText(Double.toString(Double.parseDouble(rez.getText()) + broj / pow(10, br)));
        rez.setText(" ");
    }
}