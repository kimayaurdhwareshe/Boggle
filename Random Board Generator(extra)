package boggle3;
import java.util.Random;

/**
 *
 * @author ikiki
 */
public class Boggle3 {
	public static int defaultsize = 4; 
	private final int size; 
	private final Cell[][] grid; 
	private Random generator = new Random();

	
	private class Cell {
		boolean visited;
		char c;

		public Cell(char c) {
			this.c = c;
			visited = false;
		}

                @Override
		public String toString() {
			return Character.toString(c);
		}
	}
	
	public Boggle3() {
		generator = new Random();
		size = defaultsize;
		grid = new Cell[size][size];
            for (Cell[] grid1 : grid) {
                for (int j = 0; j < grid1.length; j++) {
                    grid1[j] = new Cell(randomChar());
                }
            }
	}
	
        @Override
	public String toString() {
		String str = "|";
		for (int j = 0; j < size * 4 - 1; j++) {
			str = str + '-';
		}
		str = str + "|\n";

		for (int i = 0; i < size; i++) {
			str = str + "| ";
			for (int j = 0; j < size; j++) {
				str = str + grid[i][j].c;
				str = str + " | ";
			}
			str = str + "\n|";
			for (int j = 0; j < size * 4 - 1; j++) {
				str = str + '-';
			}
			str = str + "|\n";
		}
		return str;
	}


	public static void main(String[] args) {
			Boggle3 board = new Boggle3();
			System.out.println(board);

                }
	private char randomChar() {
		float i = generator.nextInt(1000000);
		i = i / 1000000;
		if (i < .08167) {
			return 'a';
		}
		if (i < .09659) {
			return 'b';
		}
		if (i < .12441) {
			return 'c';
		}
		if (i < .16694) {
			return 'd';
		}
		if (i < .29396) {
			return 'e';
		}
		if (i < .31624) {
			return 'f';
		}
		if (i < .33639) {
			return 'g';
		}
		if (i < .39733) {
			return 'h';
		}
		if (i < .46699) {
			return 'i';
		}
		if (i < .46852) {
			return 'j';
		}
		if (i < .47624) {
			return 'k';
		}
		if (i < .51649) {
			return 'l';
		}
		if (i < .54055) {
			return 'm';
		}
		if (i < .60804) {
			return 'n';
		}
		if (i < .68311) {
			return 'o';
		}
		if (i < .70240) {
			return 'p';
		}
		if (i < .70335) {
			return 'q';
		}
		if (i < .76322) {
			return 'r';
		}
		if (i < .82649) {
			return 's';
		}
		if (i < .91705) {
			return 't';
		}
		if (i < .94463) {
			return 'u';
		}
		if (i < .95441) {
			return 'v';
		}
		if (i < .97801) {
			return 'w';
		}
		if (i < .97951) {
			return 'x';
		}
		if (i < .99925) {
			return 'y';
		}
		if (i < 1) {
			return 'z';
		} else {
			return 'e';
		}
	}
    
    }
