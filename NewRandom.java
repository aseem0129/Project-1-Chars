import java.util.ArrayList;
import java.util.Random;

/**
 * Aseem Sethi
 * 201890379
 * 9/30/2022
 * A NewRandom class which inherits all methods
 * from Random class with 6 new methods. Each new method
 * has its own functionality.
 */

public class NewRandom extends Random {

    /**
     * method that overloads a built-in Random class method which takes in two parameters
     * low and high and returns a random character within those bounds
     * @return random character
     */
    public int nextInt(int low, int high) {
        int n = nextInt(high - low + 1) + low;
        return n;
    }

    /**
     * This method returns any random character
     * from a to z
     * @return random character
     */
    public char nextChar() {
        int n = nextInt('a', 'z');  //Setting bound to any character from a to z
        return (char) n;  //return the character of value n
    }

    /**
     * Overloads the nextChar method by adding parameter from and to. Method returns any
     * character starting from the first bound and ending at the last. Both parameters
     * must be characters.
     * @return random character
     */
    public char nextChar(char from, char to) {
        ArrayList<Character> addChar = new ArrayList<>(); //initialize array to be used later

        /*
        if - else block to determine whether "from" is
        less than, greater than, or equal to "to"
         */
        if (from < to) { //if "from" is less than "to"
            /*
            for loop to go through and run it equals "to" and
            add characters to the array
            */
            for (int i = from; i <= to; i++) {
                addChar.add((char) i);  //add character of value i to array
            }
        } else if (from > to) {  //if "from" is greater than "to"
            /*
            for loop to start at "from" and run until it
            equals z and add all the in between chars to the array
             */
            for (int i = from; i <= 'z'; i++) {
                addChar.add((char) i);  //add character of value i to array
            }
            /*
            another for loop that starts at 'a' and run until
            it is equal to "to" and adds all those characters to
            the array
             */
            for (int i = 'a'; i <= to; i++) {
                addChar.add((char) i);  //add character of value i to array
            }

            /*
            else statement that is set to run if no other conditions
            are met. in this case it would be if "from" is equals to
            "to." ex if c equals c.
             */
        } else {
            /*
            for loop to start at "from" and run until it
            equals z and add all the in between chars to the array
             */
            for (int i = from; i <= 'z'; i++) {
                addChar.add((char) i);
            }
            /*
            another for loop that starts at 'a' and run until
            it is equal to "to" and adds all those characters to
            the array
             */
            for (int i = 'a'; i <= to; i++) {
                addChar.add((char) i);
            }
        }

        int n = 0; //declare and initialize variable n to 0
        /*
        for loop to run while it is less than the size
        of the array.
         */
        for (int i = 0; i < addChar.size(); i++) {
            n = nextInt(addChar.size());  //n equals a random char
        }
        return addChar.get(n);  //return array at index n
    }

    /**
     * method that takes in two char parameters and
     * returns a char that is not in the bounds of
     * those parameters
     * @return random character
     */
    public char nextCharNone(char from, char to) {
        /*
        two arraylists created to use in this method
        */
        ArrayList<Character> addChar = new ArrayList<>();
        ArrayList<Character> chooseChar = new ArrayList<>();

        /*
        if statement to check whether "from" is less than "to." if
        it is then the following is straight forward which is just
        adding every char to the arraylist
         */
        if (from < to) {
            /*
            for loop which starts at "from" and runs until i
            is equal to "to"
             */
            for (int i = from; i <= to; i++) {
                addChar.add((char) i);  //while condition is true add i to arraylist
            }
        /*
        statement to check whether "from" is greater than "to." if not
        run until the last char which is z and then start at a and run
        until "to"
         */
        } else if (from > to) {
            /*
            this for loop starts at "from" and runs until i is
            equal to z.
             */
            for (int i = from; i <= 'z'; i++) {
                addChar.add((char) i);  //add char value of i to arraylist
            }
            /*
            for loop to start from 'a' and run until the last bound, "to"
             */
            for (int i = 'a'; i <= to; i++) {
                addChar.add((char) i);  //add char value of i to array
            }
        /*
        else statement to run if none of the other
        conditions are met. in this case of the "from" and
        "to" variables are the same.
         */
        } else {
            /*
            for loop to start at "from" value and run until
            i is equal to z. add all chars in between.
             */
            for (int i = from; i <= 'z'; i++) {
                addChar.add((char) i);
            }
            /*
            for loop that starts at 'a' and runs until i is equal
            to the "to" value. add all the chars in between
             */
            for (int i = 'a'; i <= to; i++) {
                addChar.add((char) i);
            }
        }
        /*
        for loop with inner for- each loop that checks if each letter is equal to any character in
        arraylist addChar and if not increment variable n until it has gone  through the whole array. if n is
        equal to the arraylist size, that means the character has been compared to every character in addChar and is
        not the same as any of them. this char can be added to the arraylist of chars to choose from
         */
        for (char i = 'a'; i <= 'z'; i++) {  //start at a and end at z
            int n = 0;  //declare and initialize inside loop, so it may restart at 0 with every character
            /*
            inner for each loop that checks to see if a character is not equal to any character
            in addChar array. if not then increment variable n and check with next character in addChar
             */
            for (Character character : addChar) {
                if (i != character) {
                    n++;  //to increment n
                }
            }
            if (n == addChar.size()) {
                chooseChar.add(i);  //to add the character to chooseChar
            }
        }

        int n = 0;  //declare and initialize int n to 0
        /*
        for loop to start at 0 and run while i is less than the size of chooseChar array.
        make n equal a random character with the bound of chooseChar size
         */
        for (int i = 0; i < chooseChar.size(); i++) {
            n = nextInt(chooseChar.size());
        }
        return chooseChar.get(n);  //return random char
    }

    /**
     * nextChar method that takes in parameters from which is the char to start from
     * and int i which is how many more chars can be used to return a random character
     * out of. from parameter must be a char.
     * @return random character
     */
    public char nextChar(char from, int i) {
        ArrayList<Character> addChar = new ArrayList<>();  //addChar arraylist to be used in the method

        //if statement to check if the from + i is greater than variable from and
        //also if from + i is a letter or not.
        if (from < from + i && Character.isLetter(from + i)) {
            //for loop is to start from variable "from" and while it is less
            //than or equal to from + i
            for (int j = from; j <= from + i; j++) {
                if (Character.isLetter(j)) {  //to check if j is a character
                    addChar.add((char) j);  //if yes add character to addChar arraylist
                }
            }
        }
        //to check if from + i is less than from and to check if from + i
        //is a letter or not
        else if (from + i < from && Character.isLetter(from + i)) {
            //for loop that starts from the variable "from" and runs while j is
            //greater than or equal to from + i
            for (int j = from; j >= from + i; j--) {
                //if statement to check if the character is a letter
                if (Character.isLetter(j)) {
                    addChar.add((char) j); //if a letter then add the char to arraylist
                }
            }
        }
        //if i variable is 0 then just add the from variable without doing anything to it
        else if (i == 0) {
            addChar.add(from);
        }
        /*
        if "from+i" is greater than 'z', which means if the end point is more than z,
        then start from 'a' since there are no more letters after 'z' so the only characters
        that are after z are special characters etc.
         */
        else if (from + i > 'z') {
            //declare and initialize n to 0.
            int n = 0;
            //while loop to add chars to the arraylist while they are less than
            //'z' or equal to 'z'
            while (from <= 'z') {
                addChar.add(from);  //add the characters to arraylist
                from++;  //increment from
                n++;  //increment n
            }
            /*
            variable endAt holds an expression to determine when to end the for loop. what
            is happening is variable i minus n. n is the amount of letters before z, i is
            how many more letters there are supposed to be after the first letter given. need
            to add it to 'a' so that it starts from the letter 'a' and adds on to that.
             */
            int endAt = 'a' + (i - n);
            //for loop that starts at 'a' and runs until where its supposed to end.
            //adds all the chars in between
            for (char j = 'a'; j <= endAt; j++) {
                addChar.add(j);  //add the chars to arraylist addChar
            }
        }
        /*
        statement to check if from + i is less than 'a'. since 'a' is the first letter
        in the alphabet anything before it will be not be in the lowercase alphabet characters.
        if from+i is anything less than 'a' the letter before it should be 'z'.
         */
        else if (from + i < 'a') {
            int n = 0; //declare and initialize n to 0
            /*
            while the "from" variable is greater than or equal to 'a', add it to the addChar
            arraylist and decrement "from." Also increment the n variable everytime so that we
            know how many letters there are
             */
            while (from >= 'a') {
                addChar.add(from); //add "from" variable to addChar arraylist
                from--;  //decrement the variable
                n++;  //increment n so that we know how many letters there are
            }

            //declare and initialize the endAt variable which adds i to n and adds the sum to
            //the value of 'z' so that it knows to start at z and go from there
            int endAt = 'z' + (i + n);
            /*
            for loop which starts at the letter 'z' and runs until it reaches the endAt
            variable. it decrements j to get to that point. while doing this it adds all
            the characters to the addChar arraylist.
             */
            for (char j = 'z'; j >= endAt; j--) {
                addChar.add(j);
            }
        }

        int n = 0; //declare and initialize variable n to 0

        //for loop which starts at 0 and increments all the way up to the size of
        //addChar arraylist. Has variable n equal a random character
        for (int j = 0; j < addChar.size(); j++) {
            n = nextInt(addChar.size());
        }

        //return the character value of n from addChar
        return addChar.get((char)n);
    }

    /**
     * This is the nextSpecialChar method which returns
     * a random special character by checking if the characters
     * that are in bound are special characters or not.
     * @return random character
     */
    public char nextSpecialChar() {
        ArrayList<Character> addSpecialChar = new ArrayList<>();  //an arraylist to add characters to

        //next two lines are bounds low and high
        int low = 33;
        int high = 126;

        /*
        for loop to go through starting at low until high and
        checking if each character is a letter or digit.
         */
        for (int i = low; i <= high; i++) {
            if (Character.isLetter(i) || Character.isDigit(i)) {
                continue;  //if it is a letter or digit continue to next iteration
            } else {
                addSpecialChar.add((char) i);  //if not add the character to array
            }
        }

        int n = 0;  //declare and initialize variable n to 0

        /*
        for loop to run until the end of the array set n
        equal to random special character
         */
        for (int j = 0; j < addSpecialChar.size(); j++) {
            n = nextInt(addSpecialChar.size());
        }

        return addSpecialChar.get(n); //return array at index n
    }
}

