import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {

    int num = 0;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-message")) {
            if (query.startsWith("s=")) {
                String toAdd = query.split("=")[1];
                this.lines.add(toAdd);
                return String.format("%s. %s\n", this.lines.size(), toAdd);
            } else {
                return "Need a Query\n";
            }
        }
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
