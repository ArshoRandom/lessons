package am.picsart.lessons.lesson4;

public class Lesson4StringDemo {

    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        byte[] bytes = {72, 101, 108, 108, 111};

        System.out.println("Create string using char array " + new String(chars,0,4));
        System.out.println("Create string using constructor " + new String("Hello"));
        System.out.println("Create string using byte array " + new String(bytes,2,2));

        String name = "Arshak";
        System.out.println("My name is " + name +", length of my name is " + name.length());
        System.out.println("Short version of my name is " + name.substring(0,4));
        System.out.println("First letter of my name is " + name.charAt(0));


        char [] buffer = new char[4];
        name.getChars(0,4,buffer,0);
        System.out.println("Short version of my name using getChars() " + new String(buffer));

        System.out.println("My name to upper case : " + name.toUpperCase());
        System.out.println();
        System.out.println("Use equals for validation");
        System.out.println(name.equals(name.toUpperCase()) ? name + " equals " + name.toUpperCase() : name + " not equal " + name.toUpperCase());
        System.out.println();
        System.out.println("Use equalsIgnoreCase for validation");
        System.out.println(name.equalsIgnoreCase(name.toUpperCase()) ? name + " equals " + name.toUpperCase() : name + " not equal " + name.toUpperCase());

        System.out.println();
        System.out.println("regionMatchesDemo");
        String bar = "bara bara";
        System.out.println(bar.regionMatches(0, bar, 5, 4));

        System.out.println(name.startsWith("A") ? "My name stats with A" : "My name dont stats with A");
        System.out.println(name.endsWith("l") ? "My name ends with l" : "My name dont ends with l");

        String a = "Bob";
        String b = "Aram";
        System.out.println(a.compareTo(b) > 0 ? a + " lexicological is greater than " + b : a.compareTo(b) == 0
                ? a + " lexicological equal to " + b : a + " lexicological less than " + b );

        System.out.println();
        System.out.println("Index of A in my name is " + name.indexOf("A"));
        System.out.println("Last index of a in my name is " + name.lastIndexOf("a"));

        System.out.println(name + " after replace " + name.replace("shak","tash"));

        String friends = String.join(", " ,"Arshak","Samvel", "Khoren","Vachagan");

        System.out.println(friends.contains("Samvel") ? "Samvel is our friend" : "Samvel is not our friend");
        System.out.println("Unicode number of first letter of my name is " + name.codePointAt(0));

        String[] friendsArray = friends.split(",");
        System.out.println();
        System.out.println("Print friends name and use trim()");
        for(String str: friendsArray){
            System.out.println(str.trim());
        }





    }

}
