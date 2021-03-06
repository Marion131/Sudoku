package sudoku;

import org.junit.Assert;
import org.junit.Test;

public class MethodSudokuTest {

    //Déclaration d'un objet de la classe sudoku
    MethodSudoku grille = new MethodSudoku();

    //Initialisation d'un tableau d'entier qui sera attribué à l'objet
    //Vector<Integer> test = new Vector(81);

    int [] tab = {  0,2,3, 4,5,6, 7,8,9,
                    8,6,5, 3,2,1, 4,0,0,
                    9,7,3, 0,0,0, 0,0,0,

                    7,0,0, 0,0,0, 0,0,0,
                    6,0,0, 0,0,0, 0,0,0,
                    5,0,0, 0,0,0, 0,0,0,

                    4,0,0, 0,0,0, 0,0,0,
                    3,0,0, 0,0,0, 0,0,0,
                    2,0,0, 0,0,0, 0,0,0 } ;


    /*************  Fait  *************/

    @Test
    public void setGrid () {
        grille.setGrid( tab );
        grille.displayGrid();
    }

    @Test
    public void availableLine() {
        grille.setGrid( tab );
        boolean a = grille.availableLine(0,1);
        boolean b = grille.availableLine(0,2);
        Assert.assertTrue(a);
        Assert.assertFalse(b);
        System.out.println("Test ligne :"+" "+"true?"+a+" "+"false?"+b);
    }

    @Test
    public void availableColumn() {
        grille.setGrid( tab );
        boolean a = grille.availableColumn(0,1);
        boolean b = grille.availableColumn(0,2);
        Assert.assertTrue(a);
        Assert.assertFalse(b);
        System.out.println("Test Column :"+" "+"true?"+a+" "+"false?"+b);
    }

    @Test
    public void availableBloc() {
        grille.setGrid( tab );
        boolean a = grille.availableBloc(0,1);
        boolean b = grille.availableBloc(26,8);
        Assert.assertTrue(a);
        Assert.assertFalse(b);
        System.out.println("Test Bloc :"+" "+"true?"+a+" "+"false?"+b);
    }

    @Test
    public void checkNumber() {
        grille.setGrid(tab);
        boolean a = grille.checkNumber(0,1);
        boolean b = grille.checkNumber(16,5);
        Assert.assertTrue(a);
        Assert.assertFalse(b);
        System.out.println("Test number :"+" "+"true?"+a+" "+"false?"+b);
    }

    @Test
    public void isPossible() {

        grille.setGrid(tab);
        boolean a = grille.isPossible(0);
        boolean b = grille.isPossible(16);
        Assert.assertTrue(a);
        Assert.assertFalse(b);
        System.out.println("Test Possible :"+" "+"true?"+a+" "+"false?"+b);

    }

    @Test
    public void generateCase() {

        grille.setGrid( tab );
        grille.generateCase( 0 );
        grille.displayGrid();

    }





    /************  A faire  **************/

    @Test
    public void ini() {
    }

    @Test
    public void getFirstIndexCol() {
    }



    @Test
    public void generateGrid() {
    }

    @Test
    public void removeGridFrom() {
    }


    @Test
    public void displayGrid() {
    }

    @Test
    public void firstindexOfBloc() {
        grille.setGrid( tab );
        int testT = grille.firstindexOfBloc(19);
        boolean a = (testT == 0);
        boolean b = (testT != 0);
        Assert.assertTrue(a);
        //Assert.assertFalse(b);
        System.out.println("Test ligne :"+" "+"true?"+a+" "+"false?"+b);

    }
}