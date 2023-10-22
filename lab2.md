# Lab2

## Part1

## Part2
<img width="624" alt="11" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/08f571cb-6af2-4467-b85e-e13b8882875e"> <br>
**The path to the private key for your SSH key for logging into ieng6** <br>
The absoulte path to the private key is `/Users/mark/.ssh/id_rsa.pub`

<img width="663" alt="22" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/aadc5b3e-cb71-471c-a914-d945c7865afc"> <br>
**The path to the public key for your SSH key for logging into ieng6** <br>
The absoulte path to the public key is `/home/linux/ieng6/cs15lfa23/cs15lfa23ey/.ssh/authorized_keys`

<img width="678" alt="33" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/16dfd893-b271-4005-a678-b4d924dd5e96"> <br>
**A terminal interaction where you log into ieng6 with your course-specific account without being asked for a password.** <br>
This command `scp /Users/mark/.ssh/id_rsa.pub cs15lfa23ey@ieng6.ucsd.edu:~/.ssh/authorized_keys` copies the SSH public key file `/Users/mark/.ssh/id_rsa.pub` from the local computer to the authorized_keys file on the school server. This allows connection to the school server to be authenticated with the SSH public key without having to enter a password.


## Part3
During the second and third week, I learned many skills about terminals and how to connect to the school computer. I believe that these skills helped me a lot, allowing me to run programs without having to configure a local computer just by connecting to the school's computer. In my previous school, I used to connect to the school's servers through ssh and passwords, and since my passwords were complicated, I hated entering them. In this week, I learned that by using secret key, we don't need to enter the password. This is very convenient and time saving. In addition, I have gained a deeper knowledge of the internet and web pages, in terms of constructing web pages and analyzing links.
