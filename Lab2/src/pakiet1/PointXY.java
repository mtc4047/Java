
package pakiet1;
import java.awt.Point;
 class PointXY {
    
    private Point point = new Point();
    public PointXY(int x, int y){
        this.point.x = x ;
        this.point.y = y ;
        
                
    }

    @Override
    public String toString() {
        return "Współrzędne zmiennej point to: x=" + point.x  + " y=" + point.y ;
    }
    
    public java.awt.Point getPoint()
    {
        return point;
    }
    public void setPoint(java.awt.Point point)
    {
        this.point = point;
    }
    public int calculateDistance(PointXY pointDest){
        int a2 = (int)java.lang.Math.pow(pointDest.point.x-this.point.x,2);
        int b2 = (int)java.lang.Math.pow(pointDest.point.x-this.point.y,2);
        int distance = (int) java.lang.Math.sqrt(a2+b2);
        return distance;
    }
    
}
