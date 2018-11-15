package sample;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Output extends Controller{


    public static void out() {
        Writer writer = null;

        ArrayList <String> a1 = new ArrayList<String>();
        a1.add("Пн");
        a1.add("Вт");
        a1.add("Ср");
        a1.add("Чт");
        a1.add("Пт");

        try {
            writer = new FileWriter("D://3//5sem/schedule.txt");

            Controller cntrll = Controller.getINSTANCE();
            ArrayList<String> arrayList = cntrll.getNS();
            Integer ms = cntrll.getMS();

            int fl1 = 0;

            for (String b : a1) {
                Integer fl = 0;
                writer.append("\n");
                writer.write(b);
                for (int i = fl1; i < arrayList.size(); i++) {
                    writer.append("\t");
                    writer.write(arrayList.get(i));
                    fl1 ++;
                    fl ++;
                    if (fl == ms) break;
                }
                /*for (String a : arrayList) { //a,b - просто переменные, ничего серьёзного, честно
                    writer.append("\t");
                    writer.write(a);
                    fl ++;
                    if (fl == ms) break;;
                    //writer.write(System.getProperty("line.separator"));
                }*/
            }

           /* for(String a : a1){
                System.out.println(a + "/t");
               // for()
            }*/

            writer.flush();
            writer.close();
        }
            catch (Exception e) {
                Logger.getLogger(Output.class.getName()).log(Level.SEVERE, null, e);
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException ex) {
                    }
                }
        }

    }
}