package model;

import javax.swing.*;

public class Repetidor {

    public boolean intentaRepetir(){
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar?");
        if(respuesta !=0){
                JOptionPane.showMessageDialog(null, "GOOOD BYE!");
                return false;
        }
        return true;
    }
}
