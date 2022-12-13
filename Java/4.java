class datatype
{
    /*
     * Primitive data types: Data types that cannot be broken down into simpler forms.
     * Non-primitive data types: Data types that can be broken down into simpler forms.
     */
    public static void main(String[] args) 
    {
        float b;
        long c;
        //b = 10.06;     //This is taken as double (default), and will result in an error.
        b = 10.06f;    //This is taken as float.
        //c = 10412432;  //This is taken as an integer (default).
        c = 10412432l; //This is taken as a long value.
        System.out.print(b+'\t'+c);
    }
}