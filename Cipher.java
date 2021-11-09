public class Cipher {

    public static void cipher(String message, int key) {

        String lowercase_name;

       lowercase_name = message.toLowerCase(); //converting all the characters in the user entered message to capital letters

        String name = lowercase_name.replaceAll("\\s+", ""); //remove whitespaces

       String name2 = name.replaceAll("\\p{Punct}",""); //removes punctuations

        String a = "";

        for (int i = 0; i < name2.length(); i++) //loop to cipher message
        {
            char value = (name2.charAt(i)); //value of a char character

            if (Character.isLetter(value)) {

                value = (char)(value+key);

                if (value > 'z') {

                value = (char) (value - 26);

            }
                a = a + value; //adds the ciphered character

        }
            else if (Character.isDigit(value))
            {

                int b = (char)(value - key);

                a = a + b; //adds the ciphered character


            }

        }

        System.out.print("Your message: " + a); //displays final result and in lowercase
    }
}
