public class SwapNumbers {

    public static void main(String[] args) {

        int a = 42, b = 77;
        /* for reduce the best menory mangement here i going to use XOR 
        And this method is only work for int not for decimal point nummbers*/
        a=a^b;// a=101010 xor b=1001101
        b=a^b;
        a=a^b;

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        // for decimal point numbeers
        double x= 33.2, y = 44.5;

        x = x - y;  //-11.3
        y=  x  + y;  //33.2
        x = y - x;  //44.5 
        
        System.out.println("First number = " + x);
        System.out.println("Second number = " + y);

        /* Here I am using did't use the 'temp' method reason for that is it's not  
        to save memory here I using the logic it's one of the effective way Swap Nunbers*/


    }
}