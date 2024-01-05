import java.io.*;
import java.text.DecimalFormat;
//TASK-1
import java.util.*;

class TemperatureConverter{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        double f,c,f1,c1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature from fahrenheit:");
        f=sc.nextDouble();
        c=((f-32)*5/9);
        System.out.println("Temperature from celsius:"+df.format(c));
        System.out.println("Enter temperature from celsius:");
        f1=sc.nextDouble();
        f1=(c*1.8)+32;
        System.out.println("Temperature from fahrenheit:"+df.format(f));
    }
}
//Output:
// Enter Temperature from fahrenheit:
// 98.4
// Temperature from celsius:36.89
// Enter temperature from celsius:
// 36.8
// Temperature from fahrenheit:98.40
