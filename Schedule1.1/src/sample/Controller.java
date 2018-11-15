package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Controller {

    private static Controller INSTANCE = new Controller();

    public static Controller getINSTANCE(){return INSTANCE;}

    public ArrayList<String> getNS() {
        return NS;
    }

    public void setNS(ArrayList<String> NS) {
        this.NS = NS;
    }

    public void setMS(Integer MS) {
        this.MS = MS;
    }


    public Integer getMS() {
        return MS;
    }

    private static ArrayList<String> NS = new ArrayList<String>(); //NS - name subject
    ArrayList Week = new ArrayList<Double>();
    ArrayList Day = new ArrayList<Integer>();
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
    public void CloseButtonAction(ActionEvent event)
    {
        Stage primaryStage = (Stage) closeButton.getScene().getWindow();
        primaryStage.close();
    }

    @FXML
    public Button SaveButton;

    @FXML
    public void SaveButtonAction(ActionEvent event)
    {

        MS = Integer.decode(z0.getText());

        //System.out.println(MS.toString());

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

        if (n1.isCache()) {
            Week.add(Double.parseDouble(n1.getText()));
        }
        if (n2.isCache()) {
            Week.add(Double.parseDouble(n2.getText()));
        }
        if (n3.isCache()) {
            Week.add(Double.parseDouble(n3.getText()));
        }
        if (n4.isCache()) {
            Week.add(Double.parseDouble(n4.getText()));
        }
        if (n5.isCache()) {
            Week.add(Double.parseDouble(n5.getText()));
        }
        if (n6.isCache()) {
            Week.add(Double.parseDouble(n6.getText()));
        }
        if (n7.isCache()) {
            Week.add(Double.parseDouble(n7.getText()));
        }
        if (n8.isCache()) {
            Week.add(Double.parseDouble(n8.getText()));
        }
        if (n9.isCache()) {
            Week.add(Double.parseDouble(n9.getText()));
        }
        if (n10.isCache()) {
            Week.add(Double.parseDouble(n10.getText()));
        }
        if (n11.isCache()) {
            Week.add(Double.parseDouble(n11.getText()));
        }
        if (n12.isCache()) {
            Week.add(Double.parseDouble(n12.getText()));
        }
        if (n13.isCache()) {
            Week.add(Double.parseDouble(n13.getText()));
        }
        if (n14.isCache()) {
            Week.add(Double.parseDouble(n14.getText()));
        }
        if (n15.isCache()) {
            Week.add(Double.parseDouble(n15.getText()));
        }
        if (n16.isCache()) {
            Week.add(Double.parseDouble(n16.getText()));
        }
        if (n17.isCache()) {
            Week.add(Double.parseDouble(n17.getText()));
        }
        if (n18.isCache()) {
            Week.add(Double.parseDouble(n18.getText()));
        }

        if (d1.isCache()) {
            Day.add(Integer.decode(d1.getText()));
        }
        if (d2.isCache()) {
            Day.add(Integer.decode(d2.getText()));
        }
        if (d3.isCache()) {
            Day.add(Integer.decode(d3.getText()));
        }
        if (d4.isCache()) {
            Day.add(Integer.decode(d4.getText()));
        }
        if (d5.isCache()) {
            Day.add(Integer.decode(d5.getText()));
        }
        if (d6.isCache()) {
            Day.add(Integer.decode(d6.getText()));
        }
        if (d7.isCache()) {
            Day.add(Integer.decode(d7.getText()));
        }
        if (d8.isCache()) {
            Day.add(Integer.decode(d8.getText()));
        }
        if (d9.isCache()) {
            Day.add(Integer.decode(d9.getText()));
        }
        if (d10.isCache()) {
            Day.add(Integer.decode(d10.getText()));
        }
        if (d11.isCache()) {
            Day.add(Integer.decode(d11.getText()));
        }
        if (d12.isCache()) {
            Day.add(Integer.decode(d12.getText()));
        }
        if (d13.isCache()) {
            Day.add(Integer.decode(d13.getText()));
        }
        if (d14.isCache()) {
            Day.add(Integer.decode(d14.getText()));
        }
        if (d15.isCache()) {
            Day.add(Integer.decode(d15.getText()));
        }
        if (d16.isCache()) {
            Day.add(Integer.decode(d16.getText()));
        }
        if (d17.isCache()) {
            Day.add(Integer.decode(d17.getText()));
        }
        if (d18.isCache()) {
            Day.add(Integer.decode(d18.getText()));
        }

       // SaveButton.setText("Saved");
    }

    @FXML
    public Button OutButton;

    @FXML
    public void OutButtonAction(ActionEvent event) {
        Output.out();
    }
}


