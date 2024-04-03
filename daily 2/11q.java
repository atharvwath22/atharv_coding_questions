class replaceall
{
    public static void main (String args[])
    {
        String str="how are, you! buddy?";
        remove(str);                                                                         //   "[^a-zA-Z]"    this is used to remove all other non-alphabets
        System.out.println(str);
    }
    public static void remove(String s)
    {
       String m=  s.replaceAll("[^a-zA-Z]", "");
       System.out.println(m);

    }

}