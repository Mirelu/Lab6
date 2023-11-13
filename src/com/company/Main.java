package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Numar studenti=");
        int nr = myobj.nextInt();
        ArrayList<student> sir = new ArrayList<>();
        for(int i=0; i< nr; i++){
            student elev = new student();
            System.out.println("Student " + (i+1)+":");
            String nume = myobj.next();
            elev.setNumel(nume);
            sir.add(elev);
        }
        System.out.println("Studentii sunt:");
        for (int i=0;i<sir.size();i++){
            student elev = sir.get(i);
            System.out.println(elev.nume);
            }



