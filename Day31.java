public class Day31 {
    public static void main(String[] args) {
        String a = "1";
        byte b = Byte.parseByte(a);
        System.out.println("byte: " + b);
        
        String c = "30";
        short d = Short.parseShort(c);
        System.out.println("short: " + d);
        
        String e = "18";
        int f = Integer.parseInt(e);
        System.out.println("int: "  + f);
        
        String g = "3018163";
        long h = Long.parseLong(g);
        System.out.println("long: " + h);
        
        String i = "30.8f";
        float j = Float.parseFloat(i);
        System.out.println("float: " + j);
        
        String k = "8.3";
        double l = Double.parseDouble(k);
        System.out.println("double: " + l);
        
        String m = "w";
        char n = m.charAt(0);
        System.out.println("char: " + n);
        
        String o = "true";
        boolean p = Boolean.parseBoolean(o);
        System.out.println("boolean: " + p);
}
}
