package org.example;

public class concatDemo {
    public static void main(String[] args) {

        String str1 = "Learn ";
        String str2 = "Java";

        System.out.println(str1.concat(str2)); // "Learn Java"


        System.out.println(str2.concat(str1)); // "JavaLearn "

        String s3 =  "hello";
        String s4 = "Learners";

        String s5 = s3 + s4;

        String message = "Welcome " + "to " + "Java";


        String s = "Chapter" + 2; // s becomes Chapter2


        String s1 = "Supplement" + 'B'; // s1 becomes SupplementB
    }

}
