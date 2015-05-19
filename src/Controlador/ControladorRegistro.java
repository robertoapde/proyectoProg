/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloRegistro;
import Vista.Registro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorRegistro implements ActionListener{
    
    Registro vista2 = new Registro();
    ModeloRegistro modeloR = new ModeloRegistro();

   


    public enum AccionMVC{
        btnRegistrarseComenzar,
        btnRegistrarseSalir
    }
      public ControladorRegistro(Registro vista2)
    {
        this.vista2 = vista2;
    }
    
    public void inicio (){
        this.vista2.setVisible(true);
        this.vista2.btnRegistrarseComenzar.setActionCommand("btnRegistrarseComenzar");
        this.vista2.btnRegistrarseComenzar.addActionListener(this);
        this.vista2.btnRegistrarseSalir.setActionCommand("btnRegistrarseSalir");
        this.vista2.btnRegistrarseSalir.addActionListener(this);
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        switch(AccionMVC.valueOf(e.getActionCommand())){
            case btnRegistrarseComenzar:
                try{
                    String user = this.vista2.jTextUsuario.getText();
                    
                }
        }
    }
}
