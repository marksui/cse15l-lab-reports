# Lab 4
### Step 4
Use `ssh` command to login into the ieng6 account.
`ssh cse15lfa23ey@ieng6.ucsd.edu` `<enter>`

### Step 5
Use `git clone` command to clone the fork of repository from my github account. <br>
`git clone https://github.com/marksui/lab7.git`


### Step 6
Use the `pwd` and `ls` command to find the directory and files and folder inside. Then type `cd lab7` command to the lab7 folder. Finally, we can use `javac -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar *.java` to compile java files, and use `java -cp .:lib/hamcrest-core-1.3.jar:lib/junit-4.13.2.jar org.junit.runner.JUnitCore ListExamplesTests` to run the java test. We would have the test results. The test is failed. 


===================================================================================================================
### Step 7
Since from step 6, we failed test. We need to edit the code to fix it. First, we need to use `ls` make sure we are in `lab7` folder. Then, we have to type `nano ListExamples.java` to modify the java code. Because we are in the text editing tools, so we need to use keyboard command to access and edit. Our goal is change line 43 from `input1 += 1` to `index2 += 1`.

Into the txt edit mode,  <br>
First, press `<downArrow>` 42 times, so that editor moves cursor to line 43  <br>
Second, press `space>` 12 times, so that editor moves cursor to the space after `index1`  <br>
Third, press `<backspace>` to delete the `1` of `index1`    <br>
Fourth, press `<2>` to add 2 after `index`, so we changed `index1` to `index2`  <br>
Final, press `ctrl + o` `<enter>` to save and press and then press `ctrl + x` `<enter>` to exit.   <br>

### Step 8
First, press `<upArrow>` for 3 times, then press <enter> to run the `javac` command again.  <br>
Second, press `<upArrow>` for 3 times, then press <enter> to run run `java` command again.    <br>
From the screenshot image, we can see that we solve the bug.


### Step 9
Type command `git add ListExamples.java` to add ListExamples.java to commits
Type command `git commit -m "1" to commit the change to my github account
Type command `git push` to push the changes


