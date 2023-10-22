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

<img width="858" alt="13" src="https://github.com/marksui/cse15l-lab-reports/assets/146782343/d357cd38-53d8-4ff2-9050-5e02fe063dbc"> <br>


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
