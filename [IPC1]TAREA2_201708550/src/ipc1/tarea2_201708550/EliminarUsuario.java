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
public class EliminarUsuario extends JFrame implements ActionListener {

    private JLabel id;
    private JTextField ID;
    private JButton eliminar, cancelar;

    public EliminarUsuario() {
        setLayout(null);
        setTitle("Eliminar Usuario");
        id = new JLabel("ID");
        id.setBounds(50, 80, 100, 20);
        add(id);
        ID = new JTextField("");
        ID.setBounds(180, 80, 100, 20);
        add(ID);

        eliminar = new JButton("Eliminar");
        eliminar.setBounds(20, 300, 100, 30);
        add(eliminar);
        eliminar.addActionListener(this);

        cancelar = new JButton("CANCELAR");
        cancelar.setBounds(250, 300, 100, 30);
        add(cancelar);
        cancelar.addActionListener(this);
    }

    public void EliminarUsuario() {
        EliminarUsuario botones = new EliminarUsuario();
        botones.setBounds(0, 0, 400, 500);
        botones.setVisible(true);
        botones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cancelar) {
            dispose();
            Usuario user = new Usuario();
            user.Formulario();
        } else {
            System.out.println("No disponible");
        }

    }
}
