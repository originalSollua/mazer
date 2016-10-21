import java.io.*;
import java.util.Scanner;
public class mazer{
    char [][] maze;
    String fileName = "mazerepo/m1.txt";
    Scanner in;
    int sX;
    int sY;
    
    public static void main(String [] args){
        System.out.println("Start mazer");
        mazer ms = new mazer();
        ms.mazeGet();
        ms.showMaze();
    }
    public void mazeGet(){
        try{
            in = new Scanner(new FileReader(fileName));
        }
        catch(FileNotFoundException E){
            System.out.println("Could not open");
            System.exit(0);
        }
        sX = Integer.parseInt(in.nextLine());
        sY = Integer.parseInt(in.nextLine());
        System.out.println(sX);
        System.out.println(sY);
        maze = new char[sX][sY];
        int j = 0;
        while(in.hasNextLine()){
            String t = in.nextLine();
            for(int i = 0; i <sX; i++){
                maze[i][j] = t.charAt(i);
            }
            j++;
        }
        return;
    }
    public void showMaze(){
        for(int j = 0; j < sX; j++){
            for(int i = 0; i < sY; i++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}

