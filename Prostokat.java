package com.company;

public class Prostokat implements ObliczObwod,ObliczPole{
    private int pole, obwod;
    private int podstawa=10;
    private int wysokosc=5;
    @Override
    public void obwodfigury() {
    obwod=podstawa*2+wysokosc*2;
    obwodpr();
    }
    @Override
    public void polefigury() {
    pole=wysokosc*podstawa;
    polepr();
    }
    public void obwodpr(){
        System.out.print(String.format("Obwód to: %scm",obwod));
    }
    public void polepr(){
        System.out.print(String.format(" a jego pole wynosi: %scm.",pole));
    } }