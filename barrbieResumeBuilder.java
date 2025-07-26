package javaPrograms;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class barrbieResumeBuilder {

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("💖 Barbie Resume Builder 💖");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#ffe6f9")); // pastel pink
        frame.setLayout(null);

        Font labelFont = new Font("Comic Sans MS", Font.BOLD, 22);
        Font fieldFont = new Font("Comic Sans MS", Font.PLAIN, 20);

        // Name
        JLabel nameLabel = new JLabel("👑 Name:");
        nameLabel.setBounds(100, 100, 200, 40);
        nameLabel.setFont(labelFont);
        JTextField nameField = new JTextField();
        nameField.setBounds(320, 100, 500, 40);
        nameField.setFont(fieldFont);

        // Email
        JLabel emailLabel = new JLabel("💌 Email:");
        emailLabel.setBounds(100, 160, 200, 40);
        emailLabel.setFont(labelFont);
        JTextField emailField = new JTextField();
        emailField.setBounds(320, 160, 500, 40);
        emailField.setFont(fieldFont);

        // Phone
        JLabel phoneLabel = new JLabel("📞 Phone:");
        phoneLabel.setBounds(100, 220, 200, 40);
        phoneLabel.setFont(labelFont);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(320, 220, 500, 40);
        phoneField.setFont(fieldFont);

        // Education
        JLabel educationLabel = new JLabel("🎓 Education:");
        educationLabel.setBounds(100, 280, 200, 40);
        educationLabel.setFont(labelFont);
        JTextArea educationField = new JTextArea();
        JScrollPane scroll1 = new JScrollPane(educationField);
        scroll1.setBounds(320, 280, 500, 80);
        educationField.setFont(fieldFont);

        // Experience
        JLabel experienceLabel = new JLabel("💼 Experience:");
        experienceLabel.setBounds(100, 380, 200, 40);
        experienceLabel.setFont(labelFont);
        JTextArea experienceField = new JTextArea();
        JScrollPane scroll2 = new JScrollPane(experienceField);
        scroll2.setBounds(320, 380, 500, 80);
        experienceField.setFont(fieldFont);

        // Skills
        JLabel skillsLabel = new JLabel("✨ Skills:");
        skillsLabel.setBounds(100, 480, 200, 40);
        skillsLabel.setFont(labelFont);
        JTextArea skillsField = new JTextArea();
        JScrollPane scroll3 = new JScrollPane(skillsField);
        scroll3.setBounds(320, 480, 500, 80);
        skillsField.setFont(fieldFont);

        // Generate Button
        JButton generateButton = new JButton("🎀 Generate My Barbie Resume 🎀");
        generateButton.setBounds(350, 600, 400, 50);
        generateButton.setFont(labelFont);
        generateButton.setBackground(Color.decode("#ffb6c1"));
        generateButton.setForeground(Color.WHITE);

        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame resumeFrame = new JFrame("Your Barbie Resume 💖");
                resumeFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                resumeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                JTextArea resumeArea = new JTextArea();
                resumeArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 22));
                resumeArea.setBackground(Color.decode("#fff0f5"));
                resumeArea.setForeground(Color.BLACK);
                resumeArea.setEditable(false);

                String resumeText = "🎀 Barbie Dream Resume 🎀\n\n";
                resumeText += "👑 Name: " + nameField.getText() + "\n";
                resumeText += "💌 Email: " + emailField.getText() + "\n";
                resumeText += "📞 Phone: " + phoneField.getText() + "\n\n";
                resumeText += "🎓 Education:\n" + educationField.getText() + "\n\n";
                resumeText += "💼 Experience:\n" + experienceField.getText() + "\n\n";
                resumeText += "✨ Skills:\n" + skillsField.getText() + "\n\n";
                resumeText += "🌸 Keep Slaying Like Barbie 🌸";

                resumeArea.setText(resumeText);
                resumeFrame.add(new JScrollPane(resumeArea));
                resumeFrame.setVisible(true);
            }
        });

        // Add components
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(educationLabel);
        frame.add(scroll1);
        frame.add(experienceLabel);
        frame.add(scroll2);
        frame.add(skillsLabel);
        frame.add(scroll3);
        frame.add(generateButton);

        // Show the frame
        frame.setVisible(true);
    }
}

