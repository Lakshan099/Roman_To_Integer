import java.util.Scanner;

class RomanToInteger {
    //RomanConverter

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // create scanner as s
        System.out.print("Enter Roman value: ");
        String roman = s.nextLine(); // get user input

        int total = calInteger(roman); // cal the total value of roman numbers
        System.out.println("Integer output: " + total); // print total

    }

    static int getValue(char letter) { // return the value of romen letter
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    static int calInteger(String roman) {
        int total = 0; // set total val as 0
        for (int i = 0; i < roman.length(); i++) { // for loop works upto user input text length

            int getVal_1 = getValue(roman.charAt(i)); // get the value of frist romen char
            if (i + 1 < roman.length()) { // check if i + 1 less than to text length
                int getVal_2 = getValue(roman.charAt(i + 1)); // get the value of second romen char
                if (getVal_1 >= getVal_2) { // compare two values
                    total += getVal_1; // if grater than second one add val1 to total
                } else {
                    total -= getVal_1; // else subract val1 from total
                }
            } else {
                total += getVal_1; // else i + 1 grater than text length add val1 to total
            }

        }
        return total; // return final total
    }
}