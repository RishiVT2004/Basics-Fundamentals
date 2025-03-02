class basics1 {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        System.out.println("Rishi");
        int l1 = 10; // primitive data type 
        short l2 = 1;
        long l3 = 4739l;
        
        // Data Types 
        System.out.println(Byte.MIN_VALUE + " -> " + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " -> " + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " -> " + Integer.MAX_VALUE); // class Integer 
        System.out.println(Long.MIN_VALUE + " -> " + Long.MAX_VALUE);

        float f = 10.9480f;
        double d = 39.382798;

        System.out.println(f+" "+d);
        
        char a = 'a';
        System.out.println((int)a);

        String x1 = "String"; 
        String x2 = "String";
        String x3 = "new String";
        
        /*as x1 and x2 have same value but diffrn name,x2 point to a memory location which 
         stores "hello" , x1 stores "hello"
         */
        
         // checks if string point to same memory location(reference)
        System.out.println(x2 == x1); // true
        System.out.println(x3 == x1); // false 
        System.out.println(x3.equals(x1)); // false 
    }
}

/*
 * Public : access modifier 
 * Static : this method can be accesed via class , obj not needed
 * void : no return 
 
 * System : provides access to system class 
 * out : instance of printstream class indicating consile 
 * println : method to print a line on console 
 
 */