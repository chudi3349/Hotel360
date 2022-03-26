import java.awt.*;
import javax.swing.*;

public class Dashboard {
	public static void main(String[] args) {
		createWindow();
	}
	private static void createWindow() {
		// Create and set up the window.
		JFrame frame = new JFrame("Hotel360");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel textLabel = new JLabel("Hello World", SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(700, 500));
		frame.getContentPane().add(textLabel, BorderLayout.CENTER);
		
		//Display the window.
		centerWindow(frame);
		//frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void centerWindow(Window frame) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
		frame.setLocation(x, y);
	}
}
