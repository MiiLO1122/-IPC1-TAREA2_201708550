/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.tarea2_201708550;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author miilo
 */
public class Usuario extends JFrame implements ActionListener {

    private JButton crear, modificar, eliminar;
    private JLabel titulo;

    public Usuario() {
        setLayout(null);
        setTitle("FORMULARIO DE REGISTRO");
        titulo = new JLabel("BIENVENIDO AL SISTEMA DE REGISTRO DE USUARIO");
        titulo.setBounds(48, 30, 350, 50);
        add(titulo);
        crear = new JButton("CREAR");
        crear.setBounds(145, 150, 100, 30);
        add(crear);
        crear.addActionListener(this);
        modificar = new JButton("MODIFICAR");
        modificar.setBounds(145, 200, 100, 30);
        add(modificar);
        modificar.addActionListener(this);
        eliminar = new JButton("ELIMINAR");
        eliminar.setBounds(145, 250, 100, 30);
        add(eliminar);
        eliminar.addActionListener(this);
    }

    public void Formulario() {
        Usuario botones = new Usuario();
        botones.setBounds(0, 0, 400, 500);
        botones.setVisible(true);
        botones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == crear) {
            dispose();
            CrearUsuario creacion = new CrearUsuario();
            creacion.CrearUsuario();
        } else if (e.getSource() == modificar) {
            dispose();
            ModificarUsuario modificacion = new ModificarUsuario();
            modificacion.ModificarUsuario();
        }else if (e.getSource() == eliminar) {
            dispose();
            EliminarUsuario eliminacion = new EliminarUsuario();
            eliminacion.EliminarUsuario();
        }
    }

}
