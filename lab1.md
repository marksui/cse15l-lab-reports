# [Lab1 ](https://github.com/marksui/cse15l-lab-reports/tree/main)

![image](https://github.com/marksui/cse15l-lab-reports/assets/146782343/efba7c35-960d-4936-b493-4dce3fda083c)

*1. Share an example of using the command with no arguments.*
   
![image](https://github.com/marksui/cse15l-lab-reports/assets/146782343/30373bec-72f0-4c2c-b22e-6f59df8ef537)

*Working Directory: `/home`*
1. The instruction for question 1 is to navigate to the `"/home"` directory using the `"pwd"` command. When using the `"cd"` command, if no directory is specified, it returns you to the previous folder. However, since we are already in the home directory, it remains in the current folder.
*Working Directory: `/home`*
2. The `"ls"` command is used to display a list of files and folders in the specified path.
*Working Directory: `/home`*
3. Meanwhile, the `"cat"` command is used to print the contents of one or more files specified by their paths. When no arguments are provided, nothing happens; I'll need to type some text. To exit, I can use `"ctrl+D."`

Summary:
No Error for the `ls`,`cd`, and `cat`.

*2. Share an exmaple of using the command with a path to a directory as an argument.*
![image](https://github.com/marksui/cse15l-lab-reports/assets/146782343/47e8ba46-129f-49a0-8356-e44f58230b1c)

*Working Directory: `/home`*
1. I entered the command `cd lecture1` which directed me to the folder specified by the path.
*Working Directory: `/home/lecture1`*
3. Then, I entered the command `"ls message"` which showed me the folders and files in this path.
4. *Working Directory: `/home/lecture1`*
5. After that, I entered the command `'cat message'` but it displayed a message indicating that `'message'` is a directory, not a file. The terimal showed the error because I entered a directory, the `cat` command is only can be use for `cat /file/`.

Summary:
No Error for the `ls` and 'cd`.
Error for `cat`, b/c open the file, but not for the directory.

*3. Share an example of using the command with a path to a file as an argument.*
   ![image](https://github.com/marksui/cse15l-lab-reports/assets/146782343/c60442b9-8905-4dd3-afe7-53c79392c3fd)

*Working Directory: `/home/lecture1`*
1. When attempting to use the command `'cd Hello.class'` an error occurred because it is not a valid path. Because the `Hello.class` is a file, not a directory. The `"cd"` command is used to change directories, and it requires a valid directory path, not a file name. 
*Working Directory: `/home/lecture1`*
2. Similarly, the `"ls Hello.class"` command simply lists the files and directories in the current directory.
*Working Directory: `/home/lecture1`*
3. Lastly, when using the `"cat Hello.class"` command, it displayed the content of the `"Hello.class"` file. The mojibake displayed is characters in a different language, since the terminal is not set to `UTF-8`.

Summary:
No Error for the `ls` and `cat`.
Error for `cd` , b/c it changes the working directory, not the file.
