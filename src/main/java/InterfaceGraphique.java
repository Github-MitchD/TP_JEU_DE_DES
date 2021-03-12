import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Color;

public class InterfaceGraphique {

    private JFrame frame;
    private JTextField textFieldScoreJ1;
    private JTextField textFieldScoreJ2;
    private JTextField textFieldDe1;
    private JTextField textFieldDe2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    InterfaceGraphique window = new InterfaceGraphique();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public InterfaceGraphique() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 700, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblJoueur1 = new JLabel("Joueur 1");
        lblJoueur1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblJoueur1.setBounds(106, 93, 80, 21);
        frame.getContentPane().add(lblJoueur1);

        JLabel lblJoueur2 = new JLabel("Joueur 2");
        lblJoueur2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblJoueur2.setBounds(488, 96, 60, 20);
        frame.getContentPane().add(lblJoueur2);

        JLabel lblTour = new JLabel("Tour");
        lblTour.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTour.setBounds(267, 91, 150, 20);
        frame.getContentPane().add(lblTour);

        JLabel lblTourValue = new JLabel("0");
        lblTourValue.setHorizontalAlignment(SwingConstants.CENTER);
        lblTourValue.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTourValue.setBounds(300, 91, 46, 21);
        frame.getContentPane().add(lblTourValue);

        JLabel lblScoreJ1 = new JLabel("Score");
        lblScoreJ1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblScoreJ1.setBounds(93, 133, 46, 14);
        frame.getContentPane().add(lblScoreJ1);

        JLabel lblScoreJ2 = new JLabel("Score");
        lblScoreJ2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblScoreJ2.setBounds(467, 133, 46, 14);
        frame.getContentPane().add(lblScoreJ2);

        JButton btnLancerJ1 = new JButton("Lancer");
        btnLancerJ1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnLancerJ1.setBounds(93, 216, 89, 23);
        frame.getContentPane().add(btnLancerJ1);

        JButton btnLancerJ2 = new JButton("Lancer");
        btnLancerJ2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnLancerJ2.setBounds(476, 216, 89, 23);
        frame.getContentPane().add(btnLancerJ2);

        JCheckBox chckbxJ1 = new JCheckBox("Tricheur");
        chckbxJ1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            }
        });
        chckbxJ1.setBounds(93, 164, 97, 23);
        frame.getContentPane().add(chckbxJ1);

        JCheckBox chckbxJ2 = new JCheckBox("Tricheur");
        chckbxJ2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
            }
        });
        chckbxJ2.setBounds(467, 164, 97, 23);
        frame.getContentPane().add(chckbxJ2);

        JLabel lblDe1 = new JLabel("D\u00E9 1");
        lblDe1.setHorizontalAlignment(SwingConstants.CENTER);
        lblDe1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblDe1.setBounds(267, 191, 46, 14);
        frame.getContentPane().add(lblDe1);

        JLabel lblDe2 = new JLabel("D\u00E9 2");
        lblDe2.setHorizontalAlignment(SwingConstants.CENTER);
        lblDe2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblDe2.setBounds(344, 191, 46, 14);
        frame.getContentPane().add(lblDe2);

        JLabel lblVainqueur = new JLabel("Joueur 1 commence");
        lblVainqueur.setHorizontalAlignment(SwingConstants.CENTER);
        lblVainqueur.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblVainqueur.setBounds(192, 288, 300, 31);
        frame.getContentPane().add(lblVainqueur);

        JButton btnRestart = new JButton("Restart");
        btnRestart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnRestart.setBounds(267, 330, 150, 25);
        frame.getContentPane().add(btnRestart);

        JButton btnAfficher = new JButton("Afficher les donn\u00E9es");
        btnAfficher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnAfficher.setBounds(267, 364, 150, 25);
        frame.getContentPane().add(btnAfficher);

        textFieldScoreJ1 = new JTextField();
        textFieldScoreJ1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textFieldScoreJ1.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldScoreJ1.setText("0");
        textFieldScoreJ1.setBounds(140, 130, 50, 20);
        frame.getContentPane().add(textFieldScoreJ1);
        textFieldScoreJ1.setColumns(10);

        textFieldScoreJ2 = new JTextField();
        textFieldScoreJ2.setText("0");
        textFieldScoreJ2.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldScoreJ2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textFieldScoreJ2.setColumns(10);
        textFieldScoreJ2.setBounds(515, 130, 50, 20);
        frame.getContentPane().add(textFieldScoreJ2);

        textFieldDe1 = new JTextField();
        textFieldDe1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        textFieldDe1.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldDe1.setText("0");
        textFieldDe1.setBounds(267, 216, 50, 50);
        frame.getContentPane().add(textFieldDe1);
        textFieldDe1.setColumns(10);

        textFieldDe2 = new JTextField();
        textFieldDe2.setText("0");
        textFieldDe2.setHorizontalAlignment(SwingConstants.CENTER);
        textFieldDe2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        textFieldDe2.setColumns(10);
        textFieldDe2.setBounds(344, 216, 50, 50);
        frame.getContentPane().add(textFieldDe2);

        JLabel lblGameName = new JLabel("Jeu de D\u00E9 super g\u00E9nial de Mitch");
        lblGameName.setForeground(Color.DARK_GRAY);
        lblGameName.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblGameName.setBounds(176, 11, 331, 37);
        frame.getContentPane().add(lblGameName);
    }
}
