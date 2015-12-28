package hackerrank;
import java.io.*;
import java.lang.*;
import java.util.*;

public class MazeEscape {
	static final int FOG = 0;
	static final int WALL = 1;
	static final int EXPLORED = 2;
	static final int UNEXPLORED = 3;
	static final int GATE = 4;
	static final int NORTH = 0;
	static final int WEST = 1;
	static final int SOUTH = 2;
	static final int EAST = 3;
	static final int UP = 0;
	static final int LEFT = 1;
	static final int DOWN = 2;
	static final int RIGHT = 3;
	static String[] steps = new String[]{"UP","LEFT","DOWN","RIGHT"};
	private static Scanner sc;
	static int x = 32;
	static int y = 32;
	static int isLostcount = 0;
	static int xt = 0;
	static int yt = 0;
	static int facing = NORTH;
	static boolean isExploring = true;
	static int [][] grid = new int[75][75];
	static int[][] vision = new int [3][3];

	static File fileName = new File( "myfile.txt" );
	

	public static void main(String[] args) {
		//loe failist info (int x, int y, int isLostCount, boolean isExploring, String facing, String (75*75, int xt, int yt)
		//loe input sisse
		//kui näha on e, set target
		//kirjuta faili seninähtud kaart/state
		//esalgu nähtud kaardist lähtub north
		//välista suunad, kus käidud
		//kui näed seina küljel, liigu mööda seda (S/E/N/W)
		//kui näed seina diagonaalis, liigu (S/E/N/W) seina äärde		
		//kui seina pole näha, go down. Kui neljas down järjest, go left.
		//kui ükski ei apply. isExploring = false.  Liigu lähima tühja koha suunas, kus pole käidud.
		
		
		//alustades up'ist hakkab iterator nelja võimalikku suunda läbi käima. Ruut või naaberruut peab vastama tingimusele X. 
		//Esimene sobiv variant valitakse ja liigutakse suunda.
        if( !fileName.exists() )
        {
            System.out.println( "this file doesn't exist " );
            try
            {
                fileName.createNewFile();
                FileWriter fileWrite = new FileWriter( fileName );
                BufferedWriter bufferedWriter = new BufferedWriter( fileWrite );
                bufferedWriter.write( "" );
                bufferedWriter.close();
                
            } catch ( IOException e )
            {
                //catch exception
            }
        }
        else
        {
           readFile(fileName);
        }
		sc = new Scanner(System.in);
		for (int i = 0;i<3;i++){
			String row = sc.nextLine();;
			for(int j = 0;j<3;j++){
				if(i==1&&j==1){
					vision[i][j] = EXPLORED;
				}
				else if(row.charAt(j) == '#'){
					vision[i][j] = WALL;
				}
				else if(row.charAt(j) == '-'){
					vision[i][j] = UNEXPLORED;
				}
				else{
					vision[i][j] = GATE;
				}
			}
		}
		for(int i = 0;i<facing;i++){
			vision = rotateByNinetyToLeft(vision);
		}
		updateMap();
		if(xt!=0&&yt!=0){
			step(xt,yt);
		}
		
	}
	
	private static void readFile(File file){
		try
        {
            Scanner scanner = new Scanner(file);
            x = scanner.nextInt();
            y = scanner.nextInt();
            isLostcount = scanner.nextInt();
            xt = scanner.nextInt();
            yt = scanner.nextInt();
            isExploring = scanner.nextBoolean();
            for (int y = 0; y <75; y++){
                scanner.nextLine();
            	for(int x = 0; x < 75;x++){
            		grid[y][x] = scanner.nextInt();
            	}
            }
            
       
            scanner.close();
        } catch ( IOException e )
        {
            //catch exception
        }
	}
	private static void step(int dx, int dy){
		if(x > dx && grid[y][x-1]!=WALL){
			System.out.println(steps[(WEST + 4 - facing)%4]);
			facing = WEST;
		}
		else if(x < dx && grid[y][x+1]!=WALL){
			System.out.println(steps[(EAST + 4 - facing)%4]);
			facing = EAST;
		}
		else if(y > dy&& grid[y-1][x]!=WALL){
			System.out.println(steps[(NORTH + 4 - facing)%4]);
			facing = NORTH;
		}
		else if(y < dy&& grid[y+1][x]!=WALL){
			System.out.println(steps[(SOUTH + 4 - facing)%4]);
			facing = SOUTH;
		}		
	}
	
	private static void updateMap(){	
		for (int i = 0;i<3;i++){
			for(int j = 0;j<3;j++){
				if(vision[i][j]==GATE){
					grid[y-1+i][x-1+j] = vision[i][j];
					xt = x-1+j;
					yt = y-1+i;
					isExploring = false;
				}
				else if(grid[y-1+i][x-1+j] != EXPLORED){
					grid[y-1+i][x-1+j] = vision[i][j];					
				}
			}
		}
	}
	public static int[][] rotateByNinetyToLeft(int[][] m) {

	    int e = m.length - 1;
	    int c = e / 2;
	    int b = e % 2;
	    for (int r = c; r >= 0; r--) {
	        for (int d = c - r; d < c + r + b; d++) {
	            int t   = m[c - r][d];
	            m[c - r][d] = m[d][e - c + r];
	            m[d][e - c + r] = m[e - c + r][e - d];
	            m[e - c + r][e - d] = m[e - d][c - r];
	            m[e - d][c - r] = t;
	        }
	    }
	    return m;
	}

}
