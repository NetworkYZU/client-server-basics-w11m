/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.clientserverbasics;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author user
 */
public class SocketServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try(ServerSocket severSocket = new ServerSocket(8000)){
        while(true){
                Socket socket  = severSocket.accept();
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(out,"utf-8");
                osw.write("Hello World!");
                osw.flush(); // output the osw message right now!
            }
        }
        // TODO code application logic here
    }
    
}
