package wrapperClass;

public class WrapperRecap {
    public static void main(String[] args) {
        Integer num = 10;
        Boolean isPrivate = false;

        //Integer a = new Integer(5);
        //Boolean b = new Integer(true);

        Integer c = Integer.valueOf(6);

        Short v = Short.valueOf((short) 10);
        Short v2 = Short.valueOf("11");
        Short v3 = 2;

        Float k = Float.valueOf(11.1f);
        Float k2 = Float.valueOf("11");
        Float k3 = 11.2f;

        Byte s = Byte.valueOf((byte)6);
        Byte s2 = Byte.valueOf("6");
        Byte s3 = 7;

        Boolean b = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf((boolean)true);
        Boolean b4 = Boolean.valueOf("true or some String"); //false
        Boolean b3 = false;
        System.out.println(b4);

        Long l = Long.valueOf(3455);
        Long l2 = Long.valueOf((long)5667);
        Long l4 = Long.valueOf("45676");
        System.out.println(l4);
        Long l3 = 118L;

        Double d = Double.valueOf(33.5553);
        Double d2 = Double.valueOf((double)22.7783);
        Double d3 = 33.773;
















    }
}
