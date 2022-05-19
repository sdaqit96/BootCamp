package clinet.chatapp;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("127.0.0.1",1201);

            DataInputStream din = new DataInputStream(socket.getInputStream());
            DataOutputStream dout = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

            String msgin= "",msgout="";

            while(!msgin.equals("end")){
                msgout = br.readLine();
                dout.writeUTF(msgout);

                msgin = din.readUTF();
                System.out.println(msgin);
            }
            socket.close();

        }catch(Exception e){
            //handle exception
        }
    }
}
