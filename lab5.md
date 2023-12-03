# Lab 5

## Part 1
### Step 1
#### The theoretical Ed post by a student: <br>
The environment: <br>
`Student's response: I am using macOs system and using Visual Studio(Version: 1.84.0 (Universal)) code and java version "21.0.1" to edit.`

Detail the symptom: <br>
`Student's response: When I use the bash grade.sh command to compile and run the Java files, the terminal shows nothing. I feel really confused, and nothing happens. In the bash script, there is only one file named "NumberGuessingGame.java" that is compiled and run. When I run the compile and run commands separately, the command in the terminal is okay, but when I used the bash, it is not working. However, when I try to use the bash command, nothing happens in the terminal. '

A detailed description of the inputs and contexts that triggered the fault: <br>
`Student's response: The working directory for the java and sh files are in /Users/mark/Desktop/lab5. I am really sure that I am in the working directory. When I entered those command in the terminal by my hands, it is okay. But when I used the bash, it is not working. I uploaded my screenshot and the code. Maybe it is my environment differences or my grade.sh it contains some format error.`
<img width="826" alt="截屏2023-12-03 下午2 02 55" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/4307f7cc-890d-43e7-8d9c-61692920222f">
<img width="494" alt="截屏2023-12-03 下午2 21 55" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/3086d284-0219-426b-bf2b-4b371ef84d11">
<img width="484" alt="截屏2023-12-03 下午2 21 52" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/3762d357-61a2-43da-9904-a03ea9da73c8">



### Step 2
#### A response from a TA asking a leading question or suggesting a command to try
`TA response: Hi Mark, From what I've seen so far, I think there's something wrong inside your bash because you've also specifically set up if conditions, but it seems to me that there's some problem with that. I suggest you look up the if condition in the command, like -ne -eq and what that means. I suggest you change this line <if [ $? -ne 0 ]; then>. Thanks for the detailed description, hope this wroks for you.`

### Step 3
<img width="640" alt="截屏2023-12-03 下午2 43 02" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/aa9dddf3-8bff-4bc0-9cf7-7005fcb8e3f1">
<img width="434" alt="截屏2023-12-03 下午2 43 04" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/b28c591a-1ec1-44e9-b9c5-b1e1e9175aab">

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
