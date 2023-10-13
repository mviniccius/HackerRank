package org.example;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.abrirMenu();
        c.ligar();
        c.mainVolume();
        c.mainVolume();
        c.abrirMenu();
        c.play();
        c.abrirMenu();
    }
}