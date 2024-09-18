public class Day17 {
    public static void main(String[] args) {
        
        char value1 = 'a';
        char value2 = 'b';
             value2 = 'c';
        final char value3 = 'd';
             
        char value0;      
        value0 = value1;
        value1 = value2;
        value2 = value0;
        
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        
        
}
}
