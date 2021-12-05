import Clases.Paciente;
import Clases.Persona;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

public class ListaEspera {
    private JPanel listaPanel;
    private JTable table1;
    private JTable table2;
    private JTable table3;
    private JTable table4;

    public ListaEspera(){
        createTable();
    }

    public JPanel getListaPanel() {
        return listaPanel;
    }

    public void setListaPanel(JPanel listaPanel) {
        this.listaPanel = listaPanel;
    }

    public void createTable(){

        DefaultTableModel modeloDefault = new DefaultTableModel(new String[]{"Nombre","Cedula"},Registros.personas.size());
        table1.setModel(modeloDefault);
        TableModel modeloDatos = table1.getModel();
        for(int i = 0; i<Registros.personas.size();i++){
            Persona persona = Registros.personas.get(i);
            modeloDatos.setValueAt(persona.getNombre(),i,0);
            modeloDatos.setValueAt(persona.getIdentificacion(),i,1);

        }

        DefaultTableModel modeloDefault1 = new DefaultTableModel(new String[]{"Nombre","Cedula"},Registros.personas.size());
        table2.setModel(modeloDefault1);
        TableModel modeloDatos1 = table2.getModel();
        for(int i = 0; i<Valoracion.personasAlta.size();i++){
            Paciente persona = Valoracion.personasAlta.get(i);
            modeloDatos.setValueAt(persona.getNombre(),i,0);
            modeloDatos.setValueAt(persona.getIdentificacion(),i,1);

        }

        DefaultTableModel modeloDefault2 = new DefaultTableModel(new String[]{"Nombre","Cedula"},Registros.personas.size());
        table3.setModel(modeloDefault1);
        TableModel modeloDatos2 = table3.getModel();
        for(int i = 0; i<Valoracion.personasMedia.size();i++){
            Paciente persona = Valoracion.personasMedia.get(i);
            modeloDatos.setValueAt(persona.getNombre(),i,0);
            modeloDatos.setValueAt(persona.getIdentificacion(),i,1);

        }

        DefaultTableModel modeloDefault3 = new DefaultTableModel(new String[]{"Nombre","Cedula"},Registros.personas.size());
        table4.setModel(modeloDefault1);
        TableModel modeloDatos3 = table4.getModel();
        for(int i = 0; i<Valoracion.personasBaja.size();i++){
            Paciente persona = Valoracion.personasBaja.get(i);
            modeloDatos.setValueAt(persona.getNombre(),i,0);
            modeloDatos.setValueAt(persona.getIdentificacion(),i,1);

        }


    }


}
