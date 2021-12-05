import Clases.Paciente;
import Clases.Persona;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Valoracion {
    private JPanel valoracionPanel;
    private JFormattedTextField formattedTextField1;
    private JComboBox comboBox1;
    private JButton finaizarButton;
    private JButton siguienteButton;
    private JButton volverButton;
    static ArrayList<Paciente> personasAlta = new ArrayList();
    static ArrayList<Paciente> personasMedia = new ArrayList();
    static ArrayList<Paciente> personasBaja = new ArrayList();
    private int turno = 1;

    public Valoracion() {
        mostrariInfo();
        finaizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Persona per = Registros.personas.get(0);
                Paciente paciente = new Paciente(per.getNombre(), per.getIdentificacion(),per.getCelular(),turno,comboBox1.getSelectedItem());

                if(paciente.getPrioridad() == "Alta"){
                    personasAlta.add(paciente);
                }else{
                    if(paciente.getPrioridad() == "Media"){
                        personasMedia.add(paciente);

                    }else{
                        if(paciente.getPrioridad() == "Baja"){
                            personasBaja.add(paciente);
                        }
                    }
                }

                Registros.personas.remove(0);
                turno = turno + 1;
                formattedTextField1.setText("");


            }
        });
        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrariInfo();
            }
        });
        volverButton.addActionListener(new ActionListener() {
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

    public JPanel getValoracionPanel() {
        return valoracionPanel;
    }

    public void setValoracionPanel(JPanel valoracionPanel) {
        this.valoracionPanel = valoracionPanel;
    }

    public JFormattedTextField getFormattedTextField1() {
        return formattedTextField1;
    }

    public void setFormattedTextField1(JFormattedTextField formattedTextField1) {
        this.formattedTextField1 = formattedTextField1;
    }

    public JComboBox getComboBox1() {
        return comboBox1;
    }

    public void setComboBox1(JComboBox comboBox1) {
        this.comboBox1 = comboBox1;
    }

    public JButton getFinaizarButton() {
        return finaizarButton;
    }

    public void setFinaizarButton(JButton finaizarButton) {
        this.finaizarButton = finaizarButton;
    }





    public void mostrariInfo(){
        Persona paci = Registros.personas.get(0);
        formattedTextField1.setText(paci.toString());



    }


}
