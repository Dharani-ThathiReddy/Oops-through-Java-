import java.awt.*;

class LabelExample extends Frame {
    LabelExample() {
        // Set Frame title
        super("Label Example");

        // Set Frame layout
        setLayout(null);

        // Create Labels
        Label label1 = new Label("Username:");
        Label label2 = new Label("Password:");
        Label label3 = new Label("Centered Text", Label.CENTER);

        // Set Bounds for Labels
        label1.setBounds(50, 50, 100, 30);  // x, y, width, height
        label2.setBounds(50, 100, 100, 30);
        label3.setBounds(50, 150, 200, 30);

        // Add Labels to Frame
        add(label1);
        add(label2);
        add(label3);

        // Set Frame properties
        setSize(400, 300);
        setVisible(true);

        // Add a window listener for closing the Frame
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                dispose(); // Close the Frame
            }
        });
    }

    public static void main(String[] args) {
        new LabelExample(); // Create instance of LabelExample
    }
}

