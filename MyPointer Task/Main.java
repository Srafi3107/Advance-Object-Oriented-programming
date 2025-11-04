public class Main{
    public static void main(String[] args) {
        MyPoint p1= new MyPoint();
        System.out.println("p1" + p1);
        MyPoint p2= new MyPoint();
        System.out.println("p2" + p2);
        p1.setX(5);
        p1.setY(4);
        System.out.println("p1:" +p1);
        System.out.println("p1 x:"+p1.getX());
        System.out.println("p1 y:"+p1.getY());

        p2.setX(7);
        p2.setY(6);
        System.out.println("p2:" +p2);
        System.out.println("p2 x :"+p2.getX());
        System.out.println("p2 y:"+p2.getY());

        p1.setXY(1,2);
        System.out.println("p1:"+p1);

        int[] p1XY=p1.getXY();

        p1.setXY(3,4);
        System.out.println("p2:"+p2);

        int[] p2XY=p2.getXY();

        System.out.println("p1 XY: {" + p1XY[0]+ ","+p1XY[1] + "}");
        System.out.println("Distance:" +p2.distance(0,0));
        System.out.println("Distance:" +p2.distance(1,2));
        System.out.println("Distance:" +p2.distance(p1));
        System.out.println("Distance:" +p2.distance());
        System.out.println("Distance:" +p1.distance());

    }

}