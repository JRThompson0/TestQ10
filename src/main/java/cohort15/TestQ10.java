package cohort15;
import java.util.Scanner;
public class TestQ10 {
    //Question 1
    public static void Odd10() {
        int number = 10;
        while (number  > 0) {
            int numberMod = number % 2;
            if (numberMod == 1) {
                System.out.println(number);
            }
            number--;
        }
    }

    //Question 2
    public static int AddArray(int[] AArray) {
        int sum = 0;
        for (int i = 0; i < AArray.length; i++) {
            sum = sum + AArray[i];
        }
        return sum;
    }
    //Question 3
    public static int AverageArray(int[] AArray) {
        int sum = AddArray(AArray);
        int length = AArray.length;
        return sum / length;
    }

    //Question 4
    public static int fuzzyDiceRoll() {
        double roll = Math.random();
        double rollSix = roll * 6;
        return (int) Math.round(rollSix);
    }

    //Question 5
    public static int AddEvenArray(int[] AArray) {
        int length = AArray.length;
        int sum = 0;
        for (int i = 0; i < length; i++) {
            int currentNumber = AArray[i];
            int numberMod = currentNumber % 2;
            if (numberMod != 1) {
                sum = sum + currentNumber;
            }
        }
        return sum;
    }
    //Question 6
    public static int CubeVolume(int sideLength)
    {
        return sideLength*sideLength*sideLength;
    }
    //Question 7
    public static int CharacterCounter(String sampleString, char findCharacter)
    {
        int counter = 0;
        int length = sampleString.length();
        for(int i=0;i<length;i++)
        {
            char currentChar = sampleString.charAt(i);
            if (currentChar == findCharacter)
            {
                counter++;
            }
        }
        return counter;
    }
    //Question 8
    public static boolean PalChecker(String palCheckee)
    {
        boolean palStatus = true;
        palCheckee = palCheckee.toLowerCase();
        char[] characters = palCheckee.toCharArray();
        int lastIndex = characters.length-1;
        for (int i=0;i<=lastIndex;i++)
        {
            char currentChar = characters[i];
            int compareIndex = lastIndex-i;
            char compareChar = characters[compareIndex];
            if (i>=compareIndex)
                break;
            if(currentChar!=compareChar)
            {
                palStatus = false;
                break;
            }
        }
        return palStatus;
    }
    //Q9
    public static boolean leapYearChecker(int yearNumbah)
    {
        int divisionCheck4 = yearNumbah%4;
        int divisionCheck400 = yearNumbah%400;
        int divisionCheck100 = yearNumbah%100;
        if (divisionCheck4!=0)
        {
            return false;
        }
        if(divisionCheck100==0)
        {
            return divisionCheck400 == 0;
        }
        return true;
    }
//Q10
    public static void ticketServe()
    {
        Scanner textScan = new Scanner(System.in);
        System.out.println("Ticket Number?");
        int ticketNumber = textScan.nextInt();
        textScan.nextLine();
        System.out.println("Destination?");
        String destination = textScan.nextLine();
        System.out.println("Now serving customer number " +ticketNumber+". Enjoy your trip to "+destination+"!");
    }

    public static void main(String[] args)
    {
        //Q1
        Odd10();
        //Q2
        int[] sampleArray;
        sampleArray = new int[]{1,2,3,4,5,7};
        int sum = AddArray(sampleArray);
        System.out.println("Array sum equals " +sum);
        //Q3
        System.out.println("AverageArray");
        int average = AverageArray(sampleArray);
        System.out.println(average);
        //Q4
        System.out.println("Diceroller: "+fuzzyDiceRoll());
        //Q5
        System.out.println("AddEvenArray");
        System.out.println(AddEvenArray(sampleArray));
        //Q6
        int cubeSide = 5;
        System.out.println("Cube volume finder. Side length of " + cubeSide);
        System.out.println(CubeVolume(cubeSide));
        //Q7
        String sampleString ="This is a sample string for method testing purposes. Zebra Axolotl Bridge.";
        System.out.println(sampleString);
        char character = 'a';
        System.out.println("sought character:  " + character);
        int count = CharacterCounter(sampleString,character);
        System.out.println("Appears "+count+"times.");
        //Q8
        String palindrome = "Racecar";
        String notaPal = "Giraffe";
        boolean isPal = PalChecker(notaPal);
        System.out.println("is Giraffe a palindrome?  " +isPal);
        isPal = PalChecker(palindrome);
        System.out.println("is Racecar a palindrome?  "+isPal);
        //Q9
        int yearNumber = 2011;
        boolean leapcheck = leapYearChecker(yearNumber);
        System.out.print("is "+yearNumber+" a leap year?  "+leapcheck +"\n");
        yearNumber = 2012;
        leapcheck = leapYearChecker(yearNumber);
        System.out.print("is "+yearNumber+" a leap year?  "+leapcheck+"\n" );
        //Q10
        ticketServe();
    }
}