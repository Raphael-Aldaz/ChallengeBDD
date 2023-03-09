package challengDao;

import javax.swing.JFrame;

public class WindowView extends JFrame {
	
	View view;
	
	private static final long serialVersionUID = 1L;

	public WindowView(int width, int height) {
		super();
		this.setSize(width, height);
		windowOwnership();
		this.setVisible(true);
		this.setTitle("PAS CHERE Occasion");
		

	}



	private void windowOwnership() {
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setAlwaysOnTop(true);
		view = new View();
		this.setContentPane(view);

	}
	


}
