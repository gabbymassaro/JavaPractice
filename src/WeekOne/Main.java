package WeekOne;

class Main {
    public static void main(String[] args) {
        // --------------------------------------------------------------------------------------
        // 1. Make the below print "Hello World"
        String str = "Hello World";
        System.out.println(str);

        // --------------------------------------------------------------------------------------
        // 2. Find out what happens when you print `str2`
        String str2 = null;
        System.out.println(str2);

        // --------------------------------------------------------------------------------------
        // 3. ints, booleans, doubles, and floats are all compared using `==`
        //    Make the below program print whether or not `i` and `r` are equal
        int i = 0;
        int r = 1;
        System.out.println(i == r);

        // --------------------------------------------------------------------------------------
        // 4. Now, assign the below variable with the above variables equality.
        // hey bitch, its me, he wanted you to store i ==r in the boolean, but he said assign, so same difference
        boolean intsAreEqual = i == r;

        // --------------------------------------------------------------------------------------
        //  5. Strings are compared using the .equals() method. Make the program below
        //     print whether or not name and nickName are equivalent
        String name = "Gabby";
        String nickName = "Gooby";
        System.out.println(name.contentEquals("Gabby"));
        System.out.println(name.toUpperCase());

        // --------------------------------------------------------------------------------------
        // 6. Using the above variables, assign what you think the correct value the below
        //    boolean should have
        boolean nameEqualsNickName = name.contentEquals(nickName);
    }
}