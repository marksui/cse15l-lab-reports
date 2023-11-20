# Lab 4

### Step 4
Use `ssh` command to login into the ieng6 account. <br>
`ssh cs15lfa23ey@ieng6.ucsd.ed` `<enter>` <br>
<img width="505" alt="截屏2023-11-19 下午8 14 10" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/3a5973ec-92c1-41dc-9a23-e2a803d7af98">

### Step 5
Use `git clone` command to clone the fork of repository from my github account. <br>
`git clone https://github.com/marksui/lab7.git` `<enter>` <br>
<img width="731" alt="截屏2023-11-19 下午8 22 38" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/943a3472-bea6-4e4b-b2ad-71a0336b1c50">


### Step 6
Use the `pwd` `<enter>` and `ls` `<enter>` command to find the directory and files and folder inside. Then type `cd lab7` `<enter>` command to the lab7 folder. Finally, we can type `bash test.sh` `<enter>` to compile java files, and to run the java test. We would have the test results. The test is failed. 
<img width="853" alt="截屏2023-11-19 下午8 24 34" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/fd6be6b0-359b-4769-87ea-a3ef51cf773e">


### Step 7
Since from step 6, we failed test. We need to edit the code to fix it. First, we need to use `ls``<enter>` make sure we are in `lab7` folder. Then, we have to type `vim ListExamples.java` to modify the java code. Because we are in the text editing tools, so we need to use keyboard command to access and edit. Our goal is change line 43 from `input1 += 1` to `index2 += 1`.
<img width="1037" alt="截屏2023-11-19 下午8 27 31" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/e25b3e9b-0f47-4836-989d-561aef520af3">

Into the vim txt edit mode,  <br>
First, press `<j>` 43 times, so that editor moves cursor to line 43  <br>
Second, press `<l>` 12 times, so that editor moves cursor to the space after `index1`  <br>
Third, press `<i>` to edit text mode <br>
Fourth, press `<backspace>` to delete the `1` of `index1`   <br>
Fifth, press `<2>` to add 2 after `index`, so we changed `index1` to `index2`  <br>
Final, press `<esc>` `:wq` `<enter>` to save and exit.   <br>
<img width="659" alt="截屏2023-11-19 下午8 34 07" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/b4fc1756-ffec-4d59-9295-33dad187260f">

### Step 8
First, press `<upArrow>` for 3 times, then press <enter> to run the `bash test.sh` command again.  <br>
From the screenshot image, we can see that we solve the bug.
<img width="607" alt="截屏2023-11-19 下午8 43 32" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/4c395ee7-c374-4640-9367-e742045c83d2">


### Step 9
Type command `git add ListExamples.java` to add ListExamples.java to commits
Type command `git commit -m "done"` to commit the change to my github account
Type command `git push` to push the changes
<img width="1043" alt="截屏2023-11-19 下午8 53 18" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/927ddf57-8c10-40b8-b445-5bebd9864456">


