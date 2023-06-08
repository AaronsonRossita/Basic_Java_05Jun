
public class Main{

    // psvm
    public static void main(String[] args) {

        // sout
        System.out.println("Hello");
        System.out.print("");

        // Numbers
        byte myByte = 127;  // -128 .. 127
        short myShort = 32767; // -32768 .. 32767
        int myInt = 129;
        long myLong = 4l;

        float myFloat = 3.7f;
        double myDouble = 2.99999;

        Byte myClassByte = 127;
        Short myClassShort = 3289;
        Integer myClassInteger = 4242314;
        Long myClassLong = 434543l;

        Float myClassFloat = 429843.656f;
        Double myClassDouble = 3849.56;


        // widening casting
        long x = myInt;

        // narrowing casting
        int y = (int)myLong;
        byte b = (byte)myInt;

        //System.out.println("now my byte is " + b);

        //System.out.println(myInt);

        myShort++;

        //System.out.println(myShort);

        boolean myBoolean = true;
        Boolean myClassBoolean = false;

        char myChar = 'a';
        String myString = "abc";

        Character myClassCharacter = 'b';

        int[] intArr = {1,2,3,4,5};
        int[] intArr2 = intArr.clone();

        System.out.println(intArr[0]);
        System.out.println(intArr2[0]);
        System.out.println("---------");

        intArr2[0] = 80;

        System.out.println(intArr[0]);
        System.out.println(intArr2[0]);

        String[] strArr = {"abc","def","3"};









    }


}

