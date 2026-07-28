class Geeks 
{

    // Function to do operations with different data types
    static void dataTypes(int a, float b, double c, long l, byte d)
{

        double p = c/b;
        double q = b/a;
        double r = c/a;
        double m= r+l;
        int s = a/d;

        // Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
}
        public static void main(String[] args)
    {
        Geeks g = new Geeks();
        g.dataTypes(1, 2.0f, 3.0, 5L, (byte)127);
    }   
}
