import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NumberGuessing {
	

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		JLabel userLabel = new JLabel();
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		panel.setLayout(null);
		frame.setBackground(Color.RED);
		
		userLabel = new JLabel("Glückwunsch sie haben gewonnen");
		userLabel.setBounds(80, 100,200, 100 );
		panel.add(userLabel);
		
		
		
		System.out.println("Das ist ein Zahlenratespiel.");
		System.out.println("Ihr Ziel ist es die gesuchte Numme zwischen 0 und 200 zu erraten.");

		
		int rand = (int)(Math.random() * 200) + 1;
		
		System.out.println(rand);
		
		boolean schleife = false;
		
		while(schleife == false)  {
		
		int eingabe = scann.nextInt();
		
		if (eingabe == rand) {
			
			System.out.println("Glückwunsch sie haben gewonnen und die Zahl erraten");
			schleife = true;
			frame.setVisible(true);

			
		} else if (eingabe < rand) {
			
			System.out.println("Ihre Zahl ist groesser als die gesuchte Zahl. Versuchen sie es erneut");
			
		} else {
			
			System.out.println("Ihre Zahl ist kleiner als die gesuchte Zahl. Versuchen sie es erneut");
			
			
			
		}
			
			
		
		

		
		
		}
		
		
		
		
	}

}
