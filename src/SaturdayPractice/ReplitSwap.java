package SaturdayPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReplitSwap {
    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {

        Collections.swap(list, pos1, pos2);

        return list;
    }


    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));

    }

}
