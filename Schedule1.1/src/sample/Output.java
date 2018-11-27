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
            ArrayList<Subject> sub1 = cntrll.getListOfSubject1();
            ArrayList<Subject> sub2 = cntrll.getListOfSubject2();
            ArrayList<Subject> sub3 = cntrll.getListOfSubject3();

            int fl1 = 0;//для прохода по списку предметов
            int fl3 = 0;
            int fl2 = 0;

            for (double i = 0; i < 4; i++) {
                if (fl2 != 0) writer.append("\n");
                else {
                    writer.write("\t\t\tSCHEDULE");
                    writer.append("\n");
                }
                fl3++;
                fl2++;

                if (fl3 == 1) {
                    writer.append("\n");
                    fl1 = 0;
                    for (String b : a1) {
                        Integer fl = 0; //для вывода заданного количества предметов в день
                        if (fl1 != 0) writer.append("\n");
                        writer.write(b);
                        for (int j = fl1; j < sub.size(); j++) {
                            writer.append("\t");
                            writer.write(sub.get(j).getName());
                            fl++;
                            fl1++;
                            if (fl == ms) break;
                        }
                    }
                }

                if (fl3 == 2) {
                    writer.append("\n");
                    fl1 = 0;
                    for (String b : a1) {
                        Integer fl = 0; //для вывода заданного количества предметов в день
                        if (fl1 != 0) writer.append("\n");
                        writer.write(b);
                        for (int j = fl1; j < sub1.size(); j++) {
                            writer.append("\t");
                            writer.write(sub1.get(j).getName());
                            fl++;
                            fl1++;
                            if (fl == ms) break;
                        }
                    }
                }

                if (fl3 == 3) {
                    writer.append("\n");
                    fl1 = 0;
                    for (String b : a1) {
                        Integer fl = 0; //для вывода заданного количества предметов в день
                        if (fl1 != 0) writer.append("\n");
                        writer.write(b);
                        for (int j = fl1; j < sub2.size(); j++) {
                            writer.append("\t");
                            writer.write(sub2.get(j).getName());
                            fl++;
                            fl1++;
                            if (fl == ms) break;
                        }
                    }
                }

                if (fl3 == 4) {
                    writer.append("\n");
                    fl1 = 0;
                    for (String b : a1) {
                        Integer fl = 0; //для вывода заданного количества предметов в день
                        if (fl1 != 0) writer.append("\n");
                        writer.write(b);
                        for (int j = fl1; j < sub3.size(); j++) {
                            writer.append("\t");
                            writer.write(sub3.get(j).getName());
                            fl++;
                            fl1++;
                            if (fl == ms) break;
                        }
                    }
                }
            }

            writer.flush();
            // writer.close();
            }
                 catch (Exception e) {
                }
                 finally {
                    if (writer != null) {
                    try {
                        writer.close();
                    }
                        catch (IOException ex) {
                }
            }
        }
    }
}