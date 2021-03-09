package com.company;

public class TrojkatRownRam implements ObliczObwod,ObliczPole{
    private double pole, obwod;
    private double bok=3.5;
    private int wysokosc=3;
    @Override
    public void obwodfigury() {
    obwod=bok*3;
    obwodtr();
    }

    @Override
    public void polefigury() {
    pole=bok*wysokosc/2;
    poletr();
    }
    public void obwodtr(){
        System.out.print(String.format("Obwód to: %scm",obwod));
    }
    public void poletr(){
        System.out.print(String.format(" a jego pole wynosi: %scm.",pole));
    } }