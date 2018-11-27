package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.lang.model.type.NullType;
import javax.naming.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.sql.JDBCType.NULL;

public class Controller {

    private static Controller INSTANCE = new Controller();

    public static Controller getINSTANCE() {
        return INSTANCE;
    }

    public ArrayList getWeek() {
        return Week;
    }

    public void setWeek(ArrayList Week) {
        this.Week = Week;
    }

    public ArrayList getDay() { return Day; }

    public void setDay(ArrayList Day) {
        this.Day = Day;
    }

    public void setMS(Integer MS) {
        this.MS = MS;
    }

    public Integer getMS() {
        return MS;
    }

    public ArrayList<String> getNS() {
        return NS;
    }

    public void setNS(ArrayList<String> NS) {
        this.NS = NS;
    }

    public ArrayList<Subject> getListOfSubject() {return listOfSubject;}

    public void setListOfSubject(ArrayList<Subject> listOfSubject) {this.listOfSubject = listOfSubject;}


    private static ArrayList<String> NS = new ArrayList<String>(); //NS - name subject
    private static ArrayList Week = new ArrayList<Double>();
    private static ArrayList Day = new ArrayList<Integer>();
    private static ArrayList<Subject> listOfSubject = new ArrayList();
    private static Integer MS = 0; //MS - max subject (1 day)


    @FXML
    TextField z0;
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

    //Tooltip Exit = new Tooltip("Вы действительно хотите выйти? Дороги назад не будет!!!" );
    @FXML
    public Button closeButton;

    @FXML
    public void CloseButtonAction(ActionEvent event) {
        Stage primaryStage = (Stage) closeButton.getScene().getWindow();
        primaryStage.close();
    }

    @FXML
    public Button SaveButton;

    @FXML
    public void SaveButtonAction(ActionEvent event) {

        MS = Integer.decode(z0.getText());

        ArrayList P = new ArrayList<String>();
        P.add(p1.getText());
        P.add(p2.getText());
        P.add(p3.getText());
        P.add(p4.getText());
        P.add(p5.getText());
        P.add(p6.getText());
        P.add(p7.getText());
        P.add(p8.getText());
        P.add(p9.getText());
        P.add(p10.getText());
        P.add(p11.getText());
        P.add(p12.getText());
        P.add(p13.getText());
        P.add(p14.getText());
        P.add(p15.getText());
        P.add(p16.getText());
        P.add(p17.getText());
        P.add(p18.getText());

        for (int i = 0; i < P.size(); i++) {
            NS.add((String) P.get(i));
        }

        NS.removeAll(Arrays.asList("", null));

        ArrayList N = new ArrayList<String>();
        N.add(n1.getText());
        N.add(n2.getText());
        N.add(n3.getText());
        N.add(n4.getText());
        N.add(n5.getText());
        N.add(n6.getText());
        N.add(n7.getText());
        N.add(n8.getText());
        N.add(n9.getText());
        N.add(n10.getText());
        N.add(n11.getText());
        N.add(n12.getText());
        N.add(n13.getText());
        N.add(n14.getText());
        N.add(n15.getText());
        N.add(n16.getText());
        N.add(n17.getText());
        N.add(n18.getText());

        N.removeAll(Arrays.asList("", null));

        for (int i = 0; i < N.size(); i++) {
            Week.add(Double.parseDouble((String) N.get(i)));
        }

        ArrayList D = new ArrayList<Integer>();
        D.add(d1.getText());
        D.add(d2.getText());
        D.add(d3.getText());
        D.add(d4.getText());
        D.add(d5.getText());
        D.add(d6.getText());
        D.add(d7.getText());
        D.add(d8.getText());
        D.add(d9.getText());
        D.add(d10.getText());
        D.add(d11.getText());
        D.add(d12.getText());
        D.add(d13.getText());
        D.add(d14.getText());
        D.add(d15.getText());
        D.add(d16.getText());
        D.add(d17.getText());
        D.add(d18.getText());

        D.removeAll(Arrays.asList("", null));

        for (int i = 0; i < D.size(); i++) {
            Day.add(Integer.decode((String) D.get(i)));
        }

        int counter = 0;

        for (int i = 0; i < NS.size(); i++) {
            if (NS.get(i).isEmpty()) ;
            else counter++;
        }

        Subject subject = null;

        for (int i = 0; i < counter; i++) {
            subject = new Subject((String) NS.get(i), (Double) Week.get(i), (Integer) Day.get(i));
            listOfSubject.add(subject);
        }
    }

    @FXML
    public Button OutButton;

    @FXML
    public void OutButtonAction(ActionEvent event) {
        Output.out();
    }

    @FXML
    public Button StartButton;

    public void StartButtonAction(ActionEvent event) {
        Magic.calculation();
    }
}


