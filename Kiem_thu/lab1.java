import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import static java.lang.Math.sqrt;
import static org.junit.Assert.*;
import org.junit.Test;
import java.beans.Transient;
public class lab1 {
    static int giaiPT(double a, double b, double c){
        double x1,x2;
    double delta = b*b - 4*a*c;
    if(delta<0){
        x1=x2=0.0;
        return 0;
    }
    else if(delta==0){
        x1 = x2 = -b/(2*a);
        return 1;
    }
    else{
        delta = sqrt(delta);
        x1 = (-b + delta) / (2*a);
        x2 = (-b - delta) / (2*a);
        return 2;
        }
}


    
    public static void main(String[] args) {
       double a,b,c,x1,x2;
         Scanner sc = new Scanner(System.in);
         do{
            System.out.println("Nhap a: ");
            a = sc.nextDouble();
            System.out.println("Nhap b: ");
            b = sc.nextDouble();
            System.out.println("Nhap c: ");
            c = sc.nextDouble();
            x1=0;
            x2=0;
         }while(a==0);
         final int numNO= giaiPT(a,b,c);
            if( numNO == 0 ){
                System.out.println("Phuong trinh vo nghiem");
            }
            else if( numNO == 1 ){
                System.out.println("Phuong trinh co nghiem kep: " + x1);
            }
            else{
                System.out.println("Phuong trinh co 2 nghiem phan biet: " + x1 + " va " + x2);
            }
    
        }
        static int giaiPTTestCase(double a, double b, double c) {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                return 0;
            } else if (delta == 0) {
                return 1;
            } else {
                return 2;
            }
        }
        /**
         * @param a
         * @param b
         * @param c
         * @param x1
         * @param x2
         */
        @Test
        public void testgiaiPT1(){
            assertEquals(-1,giaiPTTestCase(1,2,1));  
        }
        @Test
        public void testgiaiPT2(){
            assertEquals(5,giaiPTTestCase(1,2,1));  
        }
        @Test
        public void testgiaiPT3(){
            assertEquals(1,giaiPTTestCase(1,2,1));  
        }





    }

    