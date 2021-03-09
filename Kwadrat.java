package com.company;

public class Kwadrat implements ObliczObwod,ObliczPole {
    private int pole, obwod;
    private int bok=5;
    @Override
    public void obwodfigury() {
    obwod=bok*4;
    obwodkw();
    }
    @Override
    public void polefigury() {
    pole=bok*bok;
    polekw();
    }
    private void obwodkw(){
        System.out.print(String.format("Obwód to: %scm ",obwod));
    }
    private void polekw(){
        System.out.print(String.format("a jego pole wynosi: %scm.",pole));
    } }