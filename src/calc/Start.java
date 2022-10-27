package calc;
import javax.swing.JFrame;

public class Start {

	public static void main(String[] args) {
		//1. Create the frame.
		JFrame frame = new JFrame("FrameDemo");
		frame.setSize(600, 400);
		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		Component emptyLabel = button;
		//3. Create components and put them in the frame.
		//...create emptyLabel...
//		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

		//4. Size the frame.
//		frame.pack();

		//5. Show it.
		frame.setVisible(true);
}}