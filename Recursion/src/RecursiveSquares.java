import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;

public class RecursiveSquares extends Frame {

	public RecursiveSquares() {
		setSize(300, 300);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}

	
	
	/**
	 * Draws a square and then draws 4 smaller squares at the corners of the first one.
	 * 
	 * @param g
	 * @param xPosition  the x-coordinate of the top left corner of the square
	 * @param yPosition  the x-coordinate of the top left corner of the square
	 * @param length  the length of the each side of the square
	 * @param n  the number of recursive steps
	 */
	private void drawSquare(Graphics2D g, int xPosition, int yPosition, int length, int n) {
		
		// Base Case
		if (n == 0) {
			return;
		}
		
		// Drawing the first square at the given positions and size
		g.draw(new Rectangle2D.Double(xPosition, yPosition, length, length));
		
		// Recursive Case
		// Drawing the 4 smaller squares at the 4 corners
		// By calling drawSquare() method 4 times and adjusting the positions accordingly.
        drawSquare(g, xPosition - length/4, yPosition - length/4, length/2, n - 1); // Top-left corner
        drawSquare(g, xPosition + (3 * length/4), yPosition - length/4, length/2, n - 1); // Top-right corner
        drawSquare(g, xPosition - length/4, yPosition + (3 * length/4), length/2, n - 1); // Bottom-left corner
        drawSquare(g, xPosition + (3 * length/4), yPosition + (3 * length/4), length/2, n - 1); // Bottom right corner
		
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// recursive pattern of order n
		int n = 4;
		drawSquare(g2, 100, 100, 100, n);
	}

	public static void main(String[] args) {
		RecursiveSquares squaresGUI = new RecursiveSquares();
		squaresGUI.setVisible(true);
	}
}
