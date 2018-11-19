package sample;

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
        a1.add("Пн:");
        a1.add("Вт:");
        a1.add("Ср:");
        a1.add("Чт:");
        a1.add("Пт:");

        try {
            writer = new FileWriter("D://3//5sem/schedule.txt");

            Controller cntrll = Controller.getINSTANCE();
            ArrayList<String> arrayList = cntrll.getNS();
            Integer ms = cntrll.getMS();

            int fl1 = 0;//для прохода по списку предметов

            int counter = 0;

            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).isEmpty());
                    else counter ++;
            }

            System.out.println(counter);
            double p = counter/(5*ms); //переменная для вывода нужного количества недель
            Math.round(p);

            for (double j = 0; j <= p; j++) {
                    if (fl1 !=0) writer.append("\n");
                        else {
                        writer.write("\tSCHEDULE");
                        writer.append("\n");
                    }
                for (String b : a1) { //go to very need...
                    Integer fl = 0; //для вывода ограниченного количества предметов в день
                    if (fl1 != 0) writer.append("\n");
                    writer.write(b);
                    for (int i = fl1; i < arrayList.size(); i++) {
                        writer.append("\t");
                        writer.write(arrayList.get(i));
                        fl1++;
                        fl++;
                        if (fl == ms) break;
                    }
                }
            }
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