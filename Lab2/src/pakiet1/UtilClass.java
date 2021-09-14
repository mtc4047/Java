
package pakiet1;


public class UtilClass {
    public static int obliczOdleglosc(int x1,int y1,int x2,int y2)
    {
        PointXY point1 = new PointXY(x1,y1);
        PointXY point2 = new PointXY(x2,y2);
        int distance = point1.calculateDistance(point2);
        return distance;
    }
}
