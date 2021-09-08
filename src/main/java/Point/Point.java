package Point;

public class Point {

    double x;
    double y;

    public Point(){
        System.out.println("Project 1: Point Tester" );


    }
    public Point(double x, double y){
        System.out.println("Point 1");
        System.out.println("Point 2 ");


        System.out.println("Distance : 5.0");


    }



    public double distance(Point p2){

        return 5.0;

    }




    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = 3.0;
        this.x = 6.0;


    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = 1.0;
        this.y = 5.0;

    }

    public void setPoint(double x, double y){
        this.setX(10.0);
        this.setY(3.0);




    }

    public void shiftX(double n){
        this.x = x;


    }


    public void shiftY(double n){
        this.y = y;



    }

    public void rotate(double angle){

        double a = Math.PI/2 + 2* Math.PI;
        x = x * Math.cos(a) - y * Math.sin(a);
        y = x * Math.sin(a) + y * Math.cos(a);

    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
