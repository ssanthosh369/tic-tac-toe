
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        
        //2d array
        char[][] array = new char[3][3];
        for(int i = 2; i >= 0; i--) {
            for(int j = 0; j < 3; j++) {
                array[i][j] = '_';
            }
        }
        
        printState(array);
        Boolean counter = true;
        do {
            System.out.print("Enter the coordinates: ");
            int coY = scanner.nextInt();
            int coX = scanner.nextInt();
            
            if (coX < 1 || coX > 3 || coY < 1 || coY > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            }else if(array[coX - 1][coY - 1] == '_') {
                if (counter) {
                    array[coX - 1][coY - 1] = 'X';
                }else {
                    array[coX - 1][coY - 1] = 'O';
                }
                counter = !counter;
                printState(array);
                if(checkWinnerO(array) || checkWinnerX(array)) {
                    break;
                } 
            }else {
                System.out.println("The cell is occupied! Choose another one!");
            }
        }while(true);
        
       scanner.close();
    }
    
    public static void printState(char[][] array) {
        System.out.println("---------");
        for(int i = 2; i >= 0; i--) {
            System.out.print("| ");
            for(int j = 0; j < 3; j++) {
               System.out.print(array[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
    
    public static boolean checkWinnerX(char[][] array) {
        for(int i = 0; i < 2; i++) {
                if (i  == 0  && array[i][0] == 'X') {
                    if(array[1][1] == 'X' && array[2][2] == 'X') {
                        System.out.print("X wins");
                        return true;
                    }
                }
                if (i  == 0 && array[i][2] == 'X') {
                    if(array[1][1] == 'X' && array[2][0] == 'X') {
                        System.out.print("X wins");
                        return true;
                    }
                }
                if (array[i][0] == 'X') {
                    if(array[i][1] == 'X' && array[i][2] == 'X') {
                        System.out.print("X wins");
                        return true;
                    }
                }
                if (array[0][i] == 'X') {
                    if(array[1][i] == 'X' && array[2][i] == 'X') {
                        System.out.print("X wins");
                        return true;
                    }
                }
                
            
        }
        return false;
        
    }
    
    public static boolean checkWinnerO(char[][] array) {
        for(int i = 0; i < 2; i++) {
                if (i  == 0  && array[i][0] == 'O') {
                    if(array[1][1] == 'O' && array[2][2] == 'O') {
                        System.out.print("O wins");
                        return true;
                    }
                }
                if (i  == 0 && array[i][2] == 'O') {
                    if(array[1][1] == 'O' && array[2][0] == 'O') {
                        System.out.print("O wins");
                        return true;
                    }
                }
                if (array[i][0] == 'O') {
                    if(array[i][1] == 'O' && array[i][2] == 'O') {
                        System.out.print("O wins");
                        return true;
                    }
                }
                if (array[0][i] == 'O') {
                    if(array[1][i] == 'O' && array[2][i] == 'O') {
                        System.out.print("O wins");
                        return true;
                    }
                }
                
            
        }
        
        return false;
        
    }
}
