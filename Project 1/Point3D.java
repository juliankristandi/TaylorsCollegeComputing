
/**
 * Project 1
 *
 * @author (Ignatius Julian Kristandi)
 * @version (4 December 2017)
 */
public class Point3D
{
    private double x1;
    private double y1;
    private double z1;
    private double x2;
    private double y2;
    private double z2;

    /**
     * Constructor for x y z = 0
     */
    public Point3D()
    {
        // initialise instance variables
        x1=0.0;
        y1=0.0;
        z1=0.0;
    }   
    /**
     * Constructor for setting x y z
     */
    public Point3D(double x, double y, double z){
        this.x1=x;
        this.y1=y;
        this.z1=z;
    }   
    /**
     * Get values for x y z
     */
    public double XValue1(){
        return x1;
    }
    public double YValue1(){
        return y1;
    }
    public double ZValue1(){
        return z1;
    }
    public double XValue2(){
        return x2;
    }
    public double YValue2(){
        return y2;
    }
    public double ZValue2(){
        return z2;
    }
    public double distance(double xx, double yy, double zz){
        this.x2=xx;
        this.y2=yy;
        this.z2=zz;
       double distance;
       distance=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1);
       return Math.sqrt(distance);
    }
}
