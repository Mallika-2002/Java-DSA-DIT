package pattern_recursion;

public class CrossDiagonal {
	 static void printStarsOrSpaces(int rows , int starsOrSpaces){
	        if(starsOrSpaces == 0){
	            return;
	        }
	        printStarsOrSpaces(rows, starsOrSpaces - 1);

	         if(rows + starsOrSpaces == 6 || rows == starsOrSpaces){
	            System.out.print("* ");
	         }

	         else{
	            System.out.print("  ");
	         }

	    }

	    static void printLines(int rows , int starsOrSpaces){
	        if(rows == 0){
	            return;
	        }

	        printLines(rows - 1, starsOrSpaces);
	        printStarsOrSpaces(rows, starsOrSpaces);
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        printLines(5, 5);
	    }
}
