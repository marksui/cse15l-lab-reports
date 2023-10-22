# Lab2

## Part1

Code:
```ruby

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.ArrayList;
import java.net.URLDecoder;

class Handler implements URLHandler {
    List<String> lines = new ArrayList<>();
    public String handleRequest(URI url) {
        String query = url.getQuery();
        if (url.getPath().equals("/add-message")) {
            if (query != null && query.startsWith("s=")) {
                String toAdd = query.split("=")[1];
                this.lines.add(toAdd);
                StringBuilder output = new StringBuilder();
                for (int i = 0; i < lines.size(); i++) {
                    try 
                    {
                        String decodedToAdd = URLDecoder.decode(lines.get(i), "UTF-8");
                        output.append(String.format("%d. %s\n", i + 1, decodedToAdd));
                    } 
                    catch (java.io.UnsupportedEncodingException err) 
                    {
                        System.err.println(err.getMessage());
                    }

                }
                return output.toString();
            } else {
                return "Need a Query\n";
            }
        }

        return "Use `/add-message` to add query. \n";
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
```
<br>
<img width="796" alt="12" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/878cbb61-864a-4d11-ab3a-ce73f30f1bc2"> <br>

*Which methods in your code are called?* <br>
handleRequest(URI url) method. 
<br><br>
*What are the relevant arguments to those methods, and the values of any relevant fields of the class?* <br>
Relevant Arguments is the `url` to the `handleRequest` method. This is the URI of the incoming HTTP request, which includes the path and query parameters. Relevant Fields is `lines` which is an ArrayList of strings, used to maintain a list of `add-messages`.
<br><br>
*How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.* <br>
When we add to the `url` sends a request to `/add-message?s=Hello`, the lines list is initially empty. After add the message, the `lines` list will contain one string variable, which is "Hello". Because the message "Hello" is added to the list. Before the request, lines is an empty list.
After the request, the value of lines is "Hello".
<br>
The client sends a request to `/add-message?s=Hello.` The `handleRequest` method is called. The query variable is set to `s=Hello`. Since the `url.getPath()` is `/add-message`, the code check if the query starts with "s=", which is true. The `toAdd` variable is set to `”Hello”` by splitting the query. Then the it added to the `lines` list. The output is a `StringBuilder`. A for loop iterates over the `lines` list. In the first for-loop iteration, set "Hello" to output. Finally, it will return out "1. Hello\n".
<br>

<img width="858" alt="13" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/d357cd38-53d8-4ff2-9050-5e02fe063dbc"> <br>
*Which methods in your code are called?* <br>
handleRequest(URI url) method. 
<br><br>
*What are the relevant arguments to those methods, and the values of any relevant fields of the class?* <br>
Relevant Arguments is the `url` to the `handleRequest` method. This is the URI of the incoming HTTP request, which includes the path and query parameters. Relevant Fields is `lines` which is an ArrayList of strings, used to maintain a list of `add-messages`.
<br><br>
*How do the values of any relevant fields of the class change from this specific request? If no values got changed, explain why.* <br>
When we add to the `url` sends a request to `/add-message?s=Hello`, the lines list is initially empty. After add the message, the `lines` list will contain one string variable, which is "How are you". Before the request, lines is "Hello" from picture1. Because the message "How are you" is added to the list. After the request, the value of lines is "Hello", "How are you". <br>

The client sends a request to `/add-message?s=Hello.` The `handleRequest` method is called. The query variable is set to `s=How are you`. Since the `url.getPath()` is `/add-message`, the code check if the query starts with "s=", which is true. The `toAdd` variable is set to `”How are you”` by splitting the query. Then the it added to the `lines` list. The output is a `StringBuilder`. A for loop iterates over the `lines` list. In the first for-loop iteration, set "Hello" to output, and the second for-loop, set "How are you" to output. Finally, it will return out "1. Hello\n 2. How are you\n".
<br>


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
