package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class GetData {
    ArrayList<String> NS = new ArrayList<String>(); //NS - name subject
    ArrayList<Double> Week = new ArrayList<Double>();
    ArrayList<Integer> Day = new ArrayList<Integer>();

    @FXML
    TextField p1;
    @FXML
    TextField p2;
    @FXML
    TextField p3;
    @FXML
    TextField p4;
    @FXML
    TextField p5;
    @FXML
    TextField p6;
    @FXML
    TextField p7;
    @FXML
    TextField p8;
    @FXML
    TextField p9;
    @FXML
    TextField p10;
    @FXML
    TextField p11;
    @FXML
    TextField p12;
    @FXML
    TextField p13;
    @FXML
    TextField p14;
    @FXML
    TextField p15;
    @FXML
    TextField p16;
    @FXML
    TextField p17;
    @FXML
    TextField p18;
    @FXML
    TextField n1;
    @FXML
    TextField n2;
    @FXML
    TextField n3;
    @FXML
    TextField n4;
    @FXML
    TextField n5;
    @FXML
    TextField n6;
    @FXML
    TextField n7;
    @FXML
    TextField n8;
    @FXML
    TextField n9;
    @FXML
    TextField n10;
    @FXML
    TextField n11;
    @FXML
    TextField n12;
    @FXML
    TextField n13;
    @FXML
    TextField n14;
    @FXML
    TextField n15;
    @FXML
    TextField n16;
    @FXML
    TextField n17;
    @FXML
    TextField n18;
    @FXML
    TextField d1;
    @FXML
    TextField d2;
    @FXML
    TextField d3;
    @FXML
    TextField d4;
    @FXML
    TextField d5;
    @FXML
    TextField d6;
    @FXML
    TextField d7;
    @FXML
    TextField d8;
    @FXML
    TextField d9;
    @FXML
    TextField d10;
    @FXML
    TextField d11;
    @FXML
    TextField d12;
    @FXML
    TextField d13;
    @FXML
    TextField d14;
    @FXML
    TextField d15;
    @FXML
    TextField d16;
    @FXML
    TextField d17;
    @FXML
    TextField d18;
    @FXML
    TextField z0;


    @FXML
    public Button SaveButton;
    public void SaveButtonAction(ActionEvent event)
    {
        NS.add(p1.getText());
        NS.add(p2.getText());
        NS.add(p3.getText());
        NS.add(p4.getText());
        NS.add(p5.getText());
        NS.add(p6.getText());
        NS.add(p7.getText());
        NS.add(p8.getText());
        NS.add(p9.getText());
        NS.add(p10.getText());
        NS.add(p11.getText());
        NS.add(p12.getText());
        NS.add(p13.getText());
        NS.add(p14.getText());
        NS.add(p15.getText());
        NS.add(p16.getText());
        NS.add(p17.getText());
        NS.add(p18.getText());

        Week.add(Double.parseDouble(n1.getText()));
        Week.add(Double.parseDouble(n2.getText()));
        Week.add(Double.parseDouble(n3.getText()));
        Week.add(Double.parseDouble(n4.getText()));
        Week.add(Double.parseDouble(n5.getText()));
        Week.add(Double.parseDouble(n6.getText()));
        Week.add(Double.parseDouble(n7.getText()));
        Week.add(Double.parseDouble(n8.getText()));
        Week.add(Double.parseDouble(n9.getText()));
        Week.add(Double.parseDouble(n10.getText()));
        Week.add(Double.parseDouble(n11.getText()));
        Week.add(Double.parseDouble(n12.getText()));
        Week.add(Double.parseDouble(n13.getText()));
        Week.add(Double.parseDouble(n14.getText()));
        Week.add(Double.parseDouble(n15.getText()));
        Week.add(Double.parseDouble(n16.getText()));
        Week.add(Double.parseDouble(n17.getText()));
        Week.add(Double.parseDouble(n18.getText()));

        Day.add(Integer.decode(d1.getText()));
        Day.add(Integer.decode(d2.getText()));
        Day.add(Integer.decode(d3.getText()));
        Day.add(Integer.decode(d4.getText()));
        Day.add(Integer.decode(d5.getText()));
        Day.add(Integer.decode(d6.getText()));
        Day.add(Integer.decode(d7.getText()));
        Day.add(Integer.decode(d8.getText()));
        Day.add(Integer.decode(d9.getText()));
        Day.add(Integer.decode(d10.getText()));
        Day.add(Integer.decode(d11.getText()));
        Day.add(Integer.decode(d12.getText()));
        Day.add(Integer.decode(d13.getText()));
        Day.add(Integer.decode(d14.getText()));
        Day.add(Integer.decode(d15.getText()));
        Day.add(Integer.decode(d16.getText()));
        Day.add(Integer.decode(d17.getText()));
        Day.add(Integer.decode(d18.getText()));


    }
}
