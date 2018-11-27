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

        //Double num = 1.0;
        //Double num1 = 1.5;
        //Double num2 = 2.0;

        int counter = 0;

        for (int j = 0; j < sub.size(); j++) {
            counter++;
        }

        for (int i = 0; i < sub.size() && i < counter; i++) {
            Double K = sub.get(i).getK();
            for (int j = 1; j < K; j++) {
                sub.add(sub.get(i));
            }
            //sub.remove(sub.get(i));
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
    }
}
