package sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Output extends Controller {


    public static void out() {
        Writer writer = null;

        ArrayList<String> a1 = new ArrayList<String>();
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
            ArrayList<Subject> sub = cntrll.getListOfSubject();

            int counter = 0;//размер списка
            int fl1 = 0;//для прохода по списку предметов

            for (int i = 0; i < sub.size(); i++) {
                 counter++;
            }

            double p = counter / (5 * ms); //переменная для вывода нужного количества недель
            Math.round(p);

            for (double i = 0; i < p; i++) {
                if (fl1 != 0) writer.append("\n");
                else {
                    writer.write("\t\t\tSCHEDULE");
                    writer.append("\n");
                }
                for (String b : a1) {
                    Integer fl = 0; //для вывода заданного количества предметов в день
                    if (fl1 != 0) writer.append("\n");
                    writer.write(b);
                    //int fl2 = 0;
                    for (int j = fl1; j < sub.size(); j++) {
                        /*fl2++;
                        int r = fl2/ms;
                        Math.floor(r);
                        if (r == 0) r++;*/
                        writer.append("\t");
                        /*if (sub.get(j).getPriority() == 1) {
                            for (int k = j+1; k < r; k++) {
                                boolean eq;
                                eq = sub.get(j).getName().equals(sub.get(k).getName());
                                if (eq == true) {
                                    //Collections.rotate(sub.subList(j, counter), -1);
                                    sub.remove(sub.get(k));
                                    sub.add(sub.get(j));
                                }
                            }
                        }*/
                        writer.write(sub.get(j).getName());
                        fl++;
                        fl1++;
                        if (fl == ms) break;
                    }
                }
            }

            /*МНОГО НЕ=НУЖНОЙ РАБОТЫ!!(
            for (double j = 0; j <= p; j++) {
                if (fl1 != 0) writer.append("\n");
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
            }*/
            writer.flush();
           // writer.close();
        } catch (Exception e) {
            Logger.getLogger(Output.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                }
            }
        }
       /* Collections.rotate(a1.subList(1, 4),-1);
        System.out.println(a1);*/
    }
}