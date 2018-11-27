package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

//*******************\\
//В стадии разработки\\
//********************\\
public class Magic extends Controller {

    public static void calculation() {

        Controller cntrll = Controller.getINSTANCE();

        ArrayList<String> arrayList = cntrll.getNS();
        ArrayList week = cntrll.getWeek();
        ArrayList day = cntrll.getDay();
        ArrayList<Subject> sub = cntrll.getListOfSubject();
        ArrayList<Subject> sub1 = cntrll.getListOfSubject1();
        ArrayList<Subject> sub2 = cntrll.getListOfSubject2();
        ArrayList<Subject> sub3 = cntrll.getListOfSubject3();

        //Double num = 1.0;
        //Double num1 = 1.5;
        //Double num2 = 2.0;

        int counter = 0;

        for (int j = 0; j < sub.size(); j++) {
            counter++;
        }

        for (int i = 0; i < sub.size() && i < counter; i++) {
            Integer P = sub.get(i).getPriority();
            for (int j = 1; j < P; j++) {
                sub.add(sub.get(i));
            }
        }

        for (int i = 0; i < sub1.size() && i < counter; i++) {
            Integer P = sub1.get(i).getPriority();
            for (int j = 1; j < P; j++) {
                sub1.add(sub1.get(i));
            }
        }

        for (int i = 0; i < sub2.size() && i < counter; i++) {
            Integer P = sub2.get(i).getPriority();
            for (int j = 1; j < P; j++) {
                sub2.add(sub2.get(i));
            }
        }

        for (int i = 0; i < sub3.size() && i < counter; i++) {
            Integer P = sub3.get(i).getPriority();
            for (int j = 1; j < P; j++) {
                sub3.add(sub3.get(i));
            }
        }

        /*for (int i = 0; i < sub.size() && i < counter; i++) {
            if (sub.get(i).getK().equals(num)) {
                sub.add(sub.get(i));
            }
            if (sub.get(i).getK().equals(num1)) {
                sub.add(sub.get(i));
                sub.add(sub.get(i));
            }
            if (sub.get(i).getK().equals(num2)) {
                sub.add(sub.get(i));
                sub.add(sub.get(i));
                sub.add(sub.get(i));
            }
        }*/

        Collections.shuffle(sub);
        Collections.shuffle(sub1);
        Collections.shuffle(sub2);
        Collections.shuffle(sub3);

    }
}
