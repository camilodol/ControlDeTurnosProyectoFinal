import Clases.Persona;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Registros {
    private JPanel panel;
    private JTextField identificaciontextField;
    private JTextField nombreTextField;
    private JTextField celulartextField;
    private JButton guardarButton;
    private JButton cancelarButton;
    private Persona newpersona;
    static ArrayList<Persona> personas = new ArrayList();
    Persona personafija = new Persona("Johan Cala","1005282031","6076321574");
    Persona personafija1 = new Persona("Alejandra Carracal","159987412","60725599");
    Persona personafija2 = new Persona("Camilo Ramirez","7896541230","607896523");




    public Registros() {
        personas.add(personafija);
        personas.add(personafija1);
        personas.add(personafija2);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String identificacion = identificaciontextField.getText();
                String celular = celulartextField.getText();

                newpersona = new Persona(nombre,identificacion,celular);
                personas.add(newpersona);
                JOptionPane.showMessageDialog(null, newpersona.toString());

                nombreTextField.setText("");
                identificaciontextField.setText("");
                celulartextField.setText("");
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Home");
                frame.setContentPane(new Home().getPanelHome());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(800,500);
                frame.setVisible(true);
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getIdentificaciontextField() {
        return identificaciontextField;
    }

    public void setIdentificaciontextField(JTextField identificaciontextField) {
        identificaciontextField = identificaciontextField;
    }

    public JTextField getNombreTextField() {
        return nombreTextField;
    }

    public void setNombreTextField(JTextField nombreTextField) {
        this.nombreTextField = nombreTextField;
    }

    public JTextField getCelulartextField() {
        return celulartextField;
    }

    public void setCelulartextField(JTextField celulartextField) {
        this.celulartextField = celulartextField;
    }

    public JButton getGuardarButton() {
        return guardarButton;
    }

    public void setGuardarButton(JButton guardarButton) {
        this.guardarButton = guardarButton;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }
}
