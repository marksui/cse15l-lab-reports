# Lab 5

## Part 1
### Step 1
#### The theoretical Ed post by a student: <br>
The environment: <br>
`Student's response: I am using macOs system and using Visual Studio code to edit.`

Detail the symptom: <br>
`Student's response: When I using the `bash grade.sh` command to complie and run the java files. The terimal showed crashes. In the bash script, there is only one file named "main.java" that is compiled and run. When I run the compile and run commands separately, the java file prints "Hello World" perfectly on the terminal, but when I try to use the bash script, the terminal crashes. '

A detailed description of the inputs and contexts that triggered the fault: <br>
`Student's response: I'm in the PS C:\Users\mboyk\CSE15L\DemoLab5 working directory which houses the HelloWorld.java and the runB.sh script. I run the bash script in the working directory, and it fails. I tried running the bash script before and after manually compiling the java file, but in either case the terminal crashes. `

### Step 2
#### A response from a TA asking a leading question or suggesting a command to try
`TA response: Hi Mark, I'm looking at your terminal, and I noticed that although it says "bash" on the right side of the terminal screen, your working directory is given in similar form to that of the powershell format for Windows. Could you try and press the down arrow next to the "+" on the right side of your terminal and add a "Git Bash" terminal. From there try running the same bash command as before bash runB.sh and let me know if it's still freezing your terminal. Thanks for the detailed description of your bug, hope this helps!`


### Step 3
image
The bug was that although the student believed they were running their bash commands in a bash terminal, in reality, the terminal trying to run the commands was not appropriate. The powershell terminal initally says "powershell" on the right side of the terminal when added, but after typing a bash command into the terminal, it becomes called "bash" which can be confusing and has confused me in the past. I decided to choose this bug because it has happened to me in the past and the help from google on this particular bug is difficult to find.

### Step 4
The file & directory structure needed is simply a new folder I called "DemoLab5" but this file can be named anything. The only two files that need to be made are "runB.sh" which will house the bash commands and "HelloWorld.java" which is the most basic java program which when run prints "Hello World" to a users terminal. The contents of each file before fixing the bug: The "runB.sh" consisted of

javac HelloWorld.java
java HelloWorld
set -e
While the "HelloWorld.java" consisted of

class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
The full command line (or lines) you ran to trigger the bug: The only command line neccesary to trigger this bug is bash runB.sh in a powershell terminal. A description of what to edit to fix the bug: All that is needed to fix this bug is to add a bash terminal instead of a powershell terminal. I'd just like to reiterate that although this bug may not seem the most complex, I believe it is hard to realize initally and can lead to a lot of stress from changing files that are not producing the bug as it seems as though the bash and java files are the one's causing the error.


## Part 2
I really enjoyed the process of the class, through constant practice and learning. Every week, I am wholeheartedly and actively participating in the labs to really get to grips with the new knowledge. I found vim and bash very interesting to learn. Especially `vim` let me know the newest way to operate. And `bash` taught me how commands become. Maybe I can understand it like this.
