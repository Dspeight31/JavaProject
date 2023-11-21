import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MigrationDestinationFinder extends JFrame {
    private JPanel Panel1;
    private JLabel Title;
    private JTextField nametextField;
    private JButton submitButton;
    private JRadioButton beachbuttonyes;
    private JRadioButton beachbuttonno;
    private JComboBox AvrSalcomboBox;
    private JComboBox ClimatecomboBox;
    private JComboBox salestaxCombo;
    private JComboBox avrrentcomboBox;
    private JRadioButton lowradioButton;
    private JRadioButton medradioButton;
    private JRadioButton highradioButton;
    private JLabel nameLabel;
    private JLabel averageSalaryRangeLabel;
    private JLabel beachLabel;
    private JLabel salesTaxLabel;
    private JLabel averageRentLabel;
    private JLabel economicGrowthLabel;
    private JLabel diversityLabel;
    private JRadioButton medRadioButton1;
    private JRadioButton highRadioButton1;
    private JRadioButton lowRadioButton1;
    private JLabel eclonomicGrowthLabel;
    ButtonGroup beachgroup;
    ButtonGroup economicgroup;
    ButtonGroup diversitygroup;

    public MigrationDestinationFinder() {


        this.setContentPane(Panel1);
        this.setSize(600, 600);
        this.setVisible(true);

        beachgroup= new ButtonGroup();
        beachgroup.add(beachbuttonyes);
        beachgroup.add(beachbuttonno);

        economicgroup= new ButtonGroup();
        economicgroup.add(lowradioButton);
        economicgroup.add(medradioButton);
        economicgroup.add(highradioButton);

        diversitygroup = new ButtonGroup();
        diversitygroup.add(lowRadioButton1);
        diversitygroup.add(medRadioButton1);
        diversitygroup.add(highRadioButton1);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double avgsalary = Double.parseDouble(AvrSalcomboBox.getSelectedItem().toString());
                String climate = ClimatecomboBox.getSelectedItem().toString();
                boolean hasBeach = beachbuttonyes.isSelected();
                Double saleTax = Double.parseDouble(salestaxCombo.getSelectedItem().toString());
                Double avgRent = Double.parseDouble(avrrentcomboBox.getSelectedItem().toString());

                /*
                String economicGrowth;
                if (lowradioButton.isSelected()) {
                    economicGrowth = "Low";
                } else if (medradioButton.isSelected()) {
                    economicGrowth = "Medium";
                } else {
                    economicGrowth = "High";
                }

                String diversity;
                if (lowRadioButton1.isSelected()) {
                    diversity = "Low";
                } else if (medRadioButton1.isSelected()) {
                    diversity = "Medium";
                } else {
                    diversity = "High";
                }

                String salaryRange;
                if (avgsalary < 60000) {
                    salaryRange = "Below $60,000";
                } else if (avgsalary < 80000) {
                    salaryRange = "$60,000 to $80,000";
                } else {
                    salaryRange = "Above $80,000";
                }

                String rentRange;
                if (avgRent < 1500) {
                    rentRange = "Below $1,500";
                } else if (avgRent < 2500) {
                    rentRange = "$1,500 to $2,500";
                } else {
                    rentRange = "Above $2,500";
                }

                String salesTaxRange;
                if (saleTax < .05) {
                    salesTaxRange = "Below 5%";
                } else if (avgRent < .08) {
                    salesTaxRange = "5% to 8%";
                } else {
                    salesTaxRange = "Above 8%";
                }
                */

                List<City_finder> matchedCities = new ArrayList<>();



                //JOptionPane.showMessageDialog(null, "Your Selected City(s) are "+);




            }
        });
    }


}



