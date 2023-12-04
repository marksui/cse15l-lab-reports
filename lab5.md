# Lab 5

## Part 1
### Step 1
#### The theoretical Ed post by a student: <br>
The environment: <br>
`Student's response: I am using macOs system and using Visual Studio(Version: 1.84.0 (Universal)) code and java version "21.0.1" to edit.`

Detail the symptom: <br>
`Student's response: When I use the bash grade.sh command to compile and run the Java files, the terminal shows nothing. I feel really confused, and nothing happens. In the bash script, there is only one file named "NumberGuessingGame.java" that is compiled and run. When I run the compile and run commands separately, the command in the terminal is okay, but when I used the bash, it is not working. However, when I try to use the bash command, nothing happens in the terminal.`

A detailed description of the inputs and contexts that triggered the fault: <br>
`Student's response: The working directory for the java and sh files are in /Users/mark/Desktop/lab5. I am really sure that I am in the working directory. When I entered those command in the terminal by my hands, it is okay. But when I used the bash, it is not working. I uploaded my screenshot and the code. Maybe it is my environment differences or my grade.sh it contains some format error.`
<img width="822" alt="截屏2023-12-03 下午8 59 31" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/698a0292-80fd-4c7e-bdf7-632208d9d9ca">
<img width="494" alt="截屏2023-12-03 下午2 21 55" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/3086d284-0219-426b-bf2b-4b371ef84d11">
<img width="484" alt="截屏2023-12-03 下午2 21 52" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/3762d357-61a2-43da-9904-a03ea9da73c8">



### Step 2
#### A response from a TA asking a leading question or suggesting a command to try
`TA response: Hi Mark, From what I've seen so far, I think there's something wrong inside your bash because you've also specifically set up if conditions, but it seems to me that there's some problem with that. I suggest you look up the if condition in the command, like -ne -eq and what that means. I suggest you change this line <if [ $? -ne 0 ]; then>. Thanks for the detailed description, hope this wroks for you.`

### Step 3
<img width="640" alt="截屏2023-12-03 下午2 43 02" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/aa9dddf3-8bff-4bc0-9cf7-7005fcb8e3f1"> <br>
<img width="434" alt="截屏2023-12-03 下午2 43 04" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/b28c591a-1ec1-44e9-b9c5-b1e1e9175aab"> <br>
Here is the bug one:
<img width="484" alt="截屏2023-12-03 下午2 21 52" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/3762d357-61a2-43da-9904-a03ea9da73c8">

This bug came up when student didn't not know how to use `-ne` and `-eq` for comment, and TA was good in helping him understand the concept. It's because the bash is not reporting an error, just a if statement logical error, because the program is working.

### Step 4
The required files are `NumberGuessingGame.class` `NumberGuessingGame.java` `grade.sh` inside the `lab5` folder.
```
lab5 % ls
NumberGuessingGame.class        NumberGuessingGame.java         grade.sh
```
Path:
```
/Users/mark/Desktop/lab5
```
grade.sh:
```
set -e
javac *.java
if [ $? -ne 0 ]; then
    echo "Compilation successful."
    java NumberGuessingGame
else
    echo "Compilation failed. Check the code for errors."
fi
```
NumberGuessingGame.java:
```
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100. Can you guess it?");

        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}
```
The edited code that fixed the bug, grade.sh:
```
set -e
javac *.java
if [ $? -eq 0 ]; then
    echo "Compilation successful."
    java NumberGuessingGame
else
    echo "Compilation failed. Check the code for errors."
fi
```
By modifying the if statement in grade.sh and changing the `ne` in it to `eq` we can accomplish this. <br>
## Part 2
I really enjoyed the process of the class, through constant practice and learning. Every week, I am wholeheartedly and actively participating in the labs to really get to grips with the new knowledge. I found vim and bash very interesting to learn. Especially `vim` let me know the newest way to operate. And `bash` taught me how commands become. Maybe I can understand it like this.
