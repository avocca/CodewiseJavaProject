package wrapperClass;

public class Casting {
    public static void main(String[] args) {
        byte a = 20;
       //implicit casting is done by java compiler
        //and it converts one data type to another
        int b  = a;
        short c = a;
        long d = a;
        float e = a;
        double f = a;

        //explicit casting is used to convert one data type to another
        //manually by putting parenthesis () in front of the given data type

        int intNum = 10;
        byte byteNum = (byte)intNum; //-128 to 127

        System.out.println(byteNum);

       // short shortNum = intNum; //short is smaller than int (will not work)
        short shortNum = (byte)intNum;
        short shortNum2 = (short)intNum;
        short shortNum3 = byteNum;

        long longNum = 1234;
        intNum = (int)longNum;  //explicit
        byteNum = (byte)longNum; //explicit
        System.out.println("byteNum: " + byteNum);

        double doubleNum = longNum;
        doubleNum = intNum; //implicit
        doubleNum = 1433.535f; //implicit

        //explicit casting - done manually, by converting higher data type to a lower data type
        //implicit casting - done by JVM, automatically converting a smaller type to a larger type size

        //Convert String to primitive int

        String stringNumber = "1999";
        Integer intNumber2 = Integer.valueOf(stringNumber);
        int r = intNumber2;

        //Convert stringNumber to primitive double

        Double dd = Double.valueOf(stringNumber);
        double dd2 = dd;

        Short sh = Short.valueOf(stringNumber);
        short sh2 = sh;

        long l = Long.valueOf(stringNumber);

        //valueOf() - returns objects
        //parseInt() - returns primitives

        //Convert String to wrapper class int

        String intWrap = "123";
        int n = Integer.parseInt(intWrap);  // to get primitive
        System.out.println(n);

        Integer intWrap2 = Integer.valueOf(intWrap); // to get an object

        Double doubleWrap = Double.valueOf(intWrap);
        Short shortWrap = Short.valueOf(intWrap);
        Boolean booleanWrap = Boolean.valueOf(intWrap);

        //Convert Wrapper class to a String
        Integer intObj = Integer.valueOf("200");
        String str2 = String.valueOf(intObj);
        String str3 = String.valueOf(doubleWrap);

        //convert to primitive
        Integer intObject = Integer.valueOf("200");
        int int1 = Integer.valueOf(intObject);
        int int2 = intObject;
        int int3 = Integer.valueOf((int)intObject);
        int int4 = Integer.parseInt("200");
        

























    }
}
