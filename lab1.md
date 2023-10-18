# [Lab1 ](https://github.com/marksui/cse15l-lab-reports/tree/main)

![image](https://github.com/marksui/cse15l-lab-reports/assets/146782343/efba7c35-960d-4936-b493-4dce3fda083c)

*1. Share an example of using the command with no arguments.*
   
<img width="944" alt="1" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/7804aa03-cf00-42de-9c20-8a4d83a1eb98">

1. The instruction for question 1 is to navigate to the `"/home"` directory using the `"pwd"` command. When using the `"cd"` command, if no directory is specified, it returns you to the previous folder. However, since we are already in the home directory, it remains in the current folder.
*Working Directory: `/home` for 1* <br />

2. The `"ls"` command is used to display a list of files and folders in the specified path.
*Working Directory: `/home` for 2* <br />

3. Meanwhile, the `"cat"` command is used to print the contents of one or more files specified by their paths. When no arguments are provided, nothing happens; I'll need to type some text. To exit, I can use `"ctrl+D."`
*Working Directory: `/home` for 3* <br />

Summary for Error Messages: <br />
No Error for the `ls`,`cd`, and `cat`. <br />

*2. Share an exmaple of using the command with a path to a directory as an argument.*
<img width="918" alt="2" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/a1d2fa41-7c14-4e35-9175-d19b4ecbe97a">

1. I entered the command `cd lecture1` which directed me to the folder specified by the path. <br />
*Working Directory: `/home for 1`* <br />
2. Then, I entered the command `"ls message"` which showed me the folders and files in this path. <br />
*Working Directory: `/home/lecture1 for 2`* <br />
3. After that, I entered the command `'cat message'` but it displayed a message indicating that `'message'` is a directory, not a file. The terimal showed the error because I entered a directory, the `cat` command is only can be use for `cat /file/`.
*Working Directory: `/home/lecture1 for 3`* <br />

Summary for Error Messages: <br />
No Error for the `ls` and `cd`. <br />
Error for `cat`, b/c open the file, but not for the directory. <br />

*3. Share an example of using the command with a path to a file as an argument.*
<img width="939" alt="3" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/2fc4ff0b-9af9-4702-a1af-d121ca67950b">

1. When attempting to use the command `'cd Hello.class'` an error occurred because it is not a valid path. Because the `Hello.class` is a file, not a directory. The `"cd"` command is used to change directories, and it requires a valid directory path, not a file name. <br />
*Working Directory: `/home/lecture1 for 1`* <br />
2. Similarly, the `"ls Hello.class"` command simply lists the files and directories in the current directory. <br />
*Working Directory: `/home/lecture1 for 2`* <br />
3. Lastly, when using the `"cat Hello.class"` command, it displayed the content of the `"Hello.class"` file. The mojibake displayed is characters in a different language, since the terminal is not set to `UTF-8`.<br />
*Working Directory: `/home/lecture1 for 3`* <br />

Summary for Error Messages: <br />
No Error for the `ls` and `cat`. <br />
Error for `cd` , b/c it changes the working directory, not the file. <br />
