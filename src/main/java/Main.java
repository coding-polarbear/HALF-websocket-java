import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws URISyntaxException {
        Socket socket = IO.socket("http://localhost:3001");
        socket.on("result", args1 -> {
            System.out.println(args1[0]);
        });
        socket.connect();
    }
}
