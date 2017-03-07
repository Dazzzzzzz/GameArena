/*
    *   public class Game
    *
    *   Main driver class for the game that contains 
    *   the main game window
*/

public class Game
{
    public static void main(String args[])
    {
        GameArena mainWindow = new GameArena(500, 500);
		Ball b = new Ball(0, 250, 20, "White");
		mainWindow.addBall(b);
		int x = 0; 
		
		while (true) {
			mainWindow.pause();
			x++;
			b.setXPosition(x);
		}
	}
}
