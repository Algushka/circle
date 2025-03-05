import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.awt.Color.blue;

public class Main {
    public static void main(String[] args) {
        double squareLevel=0.0;
        Circle circle1=new Circle(8, "green")  ;
        Circle circle2=new Circle(3, "white")  ;
        Circle circle3=new Circle(5, "red")  ;
        Circle circle4=new Circle(9, "blue")  ;
        Square square1=new Square("blue",1);
        Square square2=new Square("green",10);
        Square square3=new Square("grey",2);
        Square square4=new Square("yellow",3);
        Rectangle rectangle1=new Rectangle ("yellow",3,7);
        Rectangle rectangle2=new Rectangle("yellow",3,5);
        Rectangle rectangle3=new Rectangle("green",3,6);
        Rectangle rectangle4=new Rectangle("red",3,8);
        Circle findObject=new Circle(9,"yellow");
        List<Figure>figures=new ArrayList<>();
        figures.add(circle1);
        figures.add(circle2);
        figures.add(circle3);
        figures.add(circle4);
        figures.add(square1);
        figures.add(square2);
        figures.add(square3);
        figures.add(square4);
        figures.add(rectangle1);
        figures.add(rectangle2);
        figures.add(rectangle3);
        figures.add(rectangle4);
        printFigures(figures);
        //squareSum(figures);
        System.out.println("Total square : "+ squareSum(figures));/* печатаем сумму площадей*/
       
        //System.out.println("Есть фигура " +findObject+"в списке  " + figures.contains(findObject));}
        ifThereIsAFigureInTheList(findObject, figures);
        //listOfFiguresOfNeedSquare(figures, squareLevel);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the minimal square:");
        squareLevel= scanner.nextDouble();
        System.out.println("A list of figures with square more than :  " + squareLevel);
        System.out.println("__________________________________________________________");
        printFigures(listOfFiguresOfNeedSquare(figures, squareLevel));
    }

    public static void printFigures(List<Figure> figures)
    {for (int i=0; i<figures.size();i++)
        System.out.println(figures.get(i)+ " Square:  " + figures.get(i).calcArea());
    }
    public static List<Figure> listOfFiguresOfNeedSquare(List<Figure> figures, double squareLevel)
    {   List <Figure> list1=new ArrayList<>();
        for (int i=0; i<figures.size();i++)
            if ( figures.get(i).calcArea()>squareLevel){
                list1.add(figures.get(i));

            };
        return list1;
    }
    public static double squareSum (List<Figure> figures)
    {double sum=0;
        for (int i=0; i<figures.size();i++)
            sum+=figures.get(i).calcArea();
        return sum;
    }
    public static void ifThereIsAFigureInTheList(Figure findObject, List<Figure> figures)
    { System.out.println("Есть фигура " +findObject+"в списке  " + figures.contains(findObject));}

}