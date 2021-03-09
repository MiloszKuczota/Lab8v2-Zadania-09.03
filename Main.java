package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.print("Kwadrat o boku 5cm.\n");
    ObliczObwod obwod = new Kwadrat();
    obwod.obwodfigury();
    ObliczPole pole =new Kwadrat();
    pole.polefigury();

    System.out.println("\n\nProstokąt o podstawie 10cm i wysokości 5cm.");
    ObliczObwod obwod1 = new Prostokat();
    obwod1.obwodfigury();
    ObliczPole pole1 = new Prostokat();
    pole1.polefigury();

    System.out.println("\n\nTrójkąt równoramienny o bokach 3.5cm oraz wysokości 3cm.");
    ObliczObwod obwod2 = new TrojkatRownRam();
    obwod2.obwodfigury();
    ObliczPole pole2=new TrojkatRownRam();
    pole2.polefigury();
    } }