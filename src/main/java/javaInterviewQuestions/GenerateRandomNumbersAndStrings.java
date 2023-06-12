package javaInterviewQuestions;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args) {
        //1)using Random class
        // Random rand = new Random();
        /*int randInt = rand.nextInt(1000);   // ----> v skobkah ukazivaem sifru i budet generirovat' ot 0 do etogo chisla
        System.out.println(randInt);*/
       /* double randDouble =  rand.nextDouble();    // ---->range 0.0 and less than 1.0
        System.out.println(randDouble);*/

        //2) using Math class (generate decimal numbers)
        System.out.println(Math.random());

    }
}
