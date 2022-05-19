package server.chatapp;

import java.io.*;
import java.net.*;
import java.sql.SQLOutput;

public class Server {
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(1201);
            Socket socket = serverSocket.accept();

            DataInputStream din = new DataInputStream(socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

            String msgin= "",msgout="";

            while(!msgin.equals("end")){
                msgin = din.readUTF();
                System.out.println(msgin);

                msgout = br.readLine();
                dout.writeUTF(msgout);
                dout.flush();
            }
            socket.close();

        }catch(Exception e){
            //handle exception
        }
    }
}
