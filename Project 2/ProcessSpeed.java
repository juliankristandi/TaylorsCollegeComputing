import java.util.*;
/**
 * Ignatius Julian Kristandi (2347966) and Thomas Fok (2400561)
 * Computing Assignment 2
 */
public class ProcessSpeed
{   
    /**
     * Find the maximum value.
     */
    public int max()   {
    int[] a=Speed.getSpeed();
    int max=a[0];
    for(int i=0;i<a.length;i++){
    if (a[i] > max){ 
    max=a[i];
    }
    }
    return max;
    }
    
    /**
     * Find the minimum value.
     */
    public int min()    {
    int[] a=Speed.getSpeed();
    int min=a[0];
    for(int i=0;i<a.length;i++){
    if (a[i] < min){
    min = a[i];
    }    
    }
    return min;
    }
    
    /**
     * Find the range.
     */
    public int range()  {
    ProcessSpeed a = new ProcessSpeed();
    int max=a.max();
    int min=a.min();
    int range=max-min;
    return range;
    }
    
     /**
     * Return the mean of the set of speeds.
     */
    public double mean()
    {
        int[] speed = Speed.getSpeed();
        double sum = 0;
        double mean = 0;
        for(int i = 0; i < speed.length; i++)
        {
            sum = sum + speed[i];
        }
        mean = sum / speed.length;
        return mean;
    }
    

    /**
     * Return the standard deviation of the set of speeds.
     */
    public double stdDev()
    {
        int[] speed = Speed.getSpeed();
        int sum = 0;
        int mean = 0;
        int denominator = 0;
        double standardDeviation = 0;
        for(int i = 0; i < speed.length; i++)
        {
            sum = sum + speed[i];
        }
        mean = sum / speed.length;
        for(int i = 0; i < speed.length; i++)
        {
            denominator = denominator + ((speed[i] - mean)*(speed[i] - mean));
        }
        standardDeviation = Math.sqrt(denominator / speed.length-1);
        return standardDeviation;
    }

    /**
     * Find the median.
     */
    public int median() {
    int median=0;
    int swap=0;
    int x=0;
    int y=0;
    int middle=0;
    int[] a=Speed.getSpeed();
    int n = a.length;
    for (int i = 0; i < ( n - 1 ); i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (a[j] > a[j+1]) 
                swap = a[j];
                a[j] = a[j+1];
                a[j+1] = swap;
            }
        }
    if(a.length%2==0){
    x=a[(a.length/2)-1];
    y=a[((a.length/2)+1)-1];
    median=(x+y)/2;
    }
    else    {
    middle=((a.length+1)/2)-1;
    median=a[middle];
    }
    return median;
    }
    
        /**
     * Return the mode of the set of speeds.
     */
    public int mode()
    {
    // Arrange the array of speeds in ascending order
    int swap = 0;
    int x = 0;
    int y = 0;
    int [] speed = Speed.getSpeed();
        for (int i = 0; i < (speed.length-1); i++) {
        for (int j = 0; j < speed.length-i-1; j++) {
            if (speed[j] > speed[j+1]) 
                swap = speed[j];
                speed[j] = speed[j+1];
                speed[j+1] = swap;
            }
        }
    // Completed arranging speeds in array in asending order
    // Find the mode of the array of speeds
    int mode = 0; // stores element to be returned
    int repeatCount = 0; // counts the record number of repeats
    int prevRepCnt = 0; // temporary count for repeats
    
    for (int i=0; i<speed.length; i++) { // goes through each elem

        for (int j=i; j<speed.length; j++) { // compares to each elem after the first elem

            if (i != j && speed[i] == speed[j]) { // if matching values
                repeatCount++; // gets the repeat count

                if (repeatCount>prevRepCnt) { // a higher count of repeats than before
                    mode=speed[i]; // return that element
                }
                prevRepCnt = repeatCount; // Keeps the highest repeat record
            }
            repeatCount=0; // resets repeat Count for next comparison
        }
    }
    return mode;
    }
    
    /**
     * Return an array of characters, which are the categories corresponding to the integer speed in the array of speeds.
     */
    public String [] SpeedCategory () {
        int [] speed = Speed.getSpeed();
        String [] category = new String [speed.length];
        for(int i = 0; i < speed.length; i++)
        {
            if(speed[i]>=85){
                category[i]="A";}
            else if(speed[i]>=75){
                category[i]="B";}
            else if(speed[i]>=65){
                category[i]="C";}
            else if(speed[i]>=50){
                category[i]="D";
            }
            else {
                category[i]="E";}
        }
    return category;
    }

    /**
     * Display the number of occurences each speed category occurs.                                                            
     */
    public int[] speedDistn ()    {
    int[] a=Speed.getSpeed();
    int A=0;
    int B=0;
    int C=0;
    int D=0;
    int E=0;
    for(int i=0; i<a.length;i++){
    if(a[i]>=85){
    A=A+1;}
    else if(a[i]>=75){
    B=B+1;}
    else if(a[i]>=65){
    C=C+1;}
    else if(a[i]>=50){
    D=D+1;
    }
    else {
    E=E+1;}
    }
    System.out.println("A: "+A);
    System.out.println("B: "+B);
    System.out.println("C: "+C);
    System.out.println("D: "+D);
    System.out.println("E: "+E);
    int[]b={A,B,C,D,E};
    return b;
    }
}
