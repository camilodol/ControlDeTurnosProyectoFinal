import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    private JPanel panelHome;
    private JButton valorarPacienteButton;
    private JButton recibirPacienteButton;
    private JButton listaDeEsperaButton;
    private JButton salirButton;
    private JButton atenderPacienteButton;

    public JPanel getPanelHome() {
        return panelHome;
    }

    public void setPanelHome(JPanel panelHome) {
        this.panelHome = panelHome;
    }

    public JButton getValorarPacienteButton() {
        return valorarPacienteButton;
    }

    public void setValorarPacienteButton(JButton valorarPacienteButton) {
        this.valorarPacienteButton = valorarPacienteButton;
    }

    public JButton getRecibirPacienteButton() {
        return recibirPacienteButton;
    }

    public void setRecibirPacienteButton(JButton recibirPacienteButton) {
        this.recibirPacienteButton = recibirPacienteButton;
    }

    public JButton getListaDeEsperaButton() {
        return listaDeEsperaButton;
    }

    public void setListaDeEsperaButton(JButton listaDeEsperaButton) {
        this.listaDeEsperaButton = listaDeEsperaButton;
    }

    public JButton getSalirButton() {
        return salirButton;
    }

    public void setSalirButton(JButton salirButton) {
        this.salirButton = salirButton;
    }

    public Home() {
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        recibirPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("Registros");
                frame.setContentPane(new Registros().getPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(800,500);
                frame.setVisible(true);
            }
        });
        listaDeEsperaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Lista Espera");
                frame.setContentPane(new ListaEspera().getListaPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(800,500);

                frame.setVisible(true);
            }
        });
        valorarPacienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JFrame frame = new JFrame("Valoracion");
                frame.setContentPane(new Valoracion().getValoracionPanel());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(800,500);

                frame.setVisible(true);


            }
        });
    }
}
