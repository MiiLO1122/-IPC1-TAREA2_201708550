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
public class CrearUsuario extends JFrame implements ActionListener {

    private JLabel id, nombre, apellido, usuario, rol, contraseña, confirmarcontraseña;
    private JTextField ID, NOMBRE, APELLIDO, USUARIO;
    private JComboBox<String> ROL;
    private JPasswordField CONTRASEÑA, CONFIRMARCONTRASEÑA;
    private JButton crear, cancelar;

    public CrearUsuario() {
        setLayout(null);
        setTitle("CREAR USUARIO");
        id = new JLabel("ID");
        id.setBounds(50, 20, 100, 20);
        add(id);
        ID = new JTextField("");
        ID.setBounds(180, 20, 100, 20);
        add(ID);
        nombre = new JLabel("Nombre");
        nombre.setBounds(50, 50, 100, 20);
        add(nombre);
        NOMBRE = new JTextField("");
        NOMBRE.setBounds(180, 50, 100, 20);
        add(NOMBRE);

        apellido = new JLabel("Apellido");
        apellido.setBounds(50, 80, 100, 20);
        add(apellido);
        APELLIDO = new JTextField("");
        APELLIDO.setBounds(180, 80, 100, 20);
        add(APELLIDO);

        usuario = new JLabel("Usuario");
        usuario.setBounds(50, 110, 100, 20);
        add(usuario);
        USUARIO = new JTextField("");
        USUARIO.setBounds(180, 110, 100, 20);
        add(USUARIO);

        rol = new JLabel("Rol");
        rol.setBounds(50, 140, 100, 20);
        add(rol);
        ROL = new JComboBox<String>();
        ROL.setBounds(180, 140, 100, 20);
        add(ROL);
        ROL.addItem("Estudiante");
        ROL.addItem("Catedrático");

        contraseña = new JLabel("Contraseña");
        contraseña.setBounds(50, 170, 100, 20);
        add(contraseña);
        CONTRASEÑA = new JPasswordField("");
        CONTRASEÑA.setBounds(180, 170, 100, 20);
        add(CONTRASEÑA);

        confirmarcontraseña = new JLabel("Conf. Contraseña");
        confirmarcontraseña.setBounds(50, 200, 100, 20);
        add(confirmarcontraseña);
        CONFIRMARCONTRASEÑA = new JPasswordField("");
        CONFIRMARCONTRASEÑA.setBounds(180, 200, 100, 20);
        add(CONFIRMARCONTRASEÑA);

        crear = new JButton("CREAR");
        crear.setBounds(20, 300, 100, 30);
        add(crear);
        crear.addActionListener(this);

        cancelar = new JButton("CANCELAR");
        cancelar.setBounds(250, 300, 100, 30);
        add(cancelar);
        cancelar.addActionListener(this);
    }

    public void CrearUsuario() {
        CrearUsuario botones = new CrearUsuario();
        botones.setBounds(0, 0, 400, 500);
        botones.setVisible(true);
        botones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == crear) {
            System.out.println("ID: " + ID.getText());
            System.out.println("Nombre: " + NOMBRE.getText());
            System.out.println("Apellido: " + APELLIDO.getText());
            System.out.println("Usuario: " + USUARIO.getText());
            System.out.println("Rol: " + ROL.getSelectedItem());
            System.out.println("Contraseña: " + CONTRASEÑA.getPassword());
        } else if (e.getSource() == cancelar) {
            dispose();
            Usuario user = new Usuario();
            user.Formulario();
        }
    }

}
