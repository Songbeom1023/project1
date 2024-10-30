package project1.src;

import java.net.Socket;

public class ClientThread extends Thread implements Runnable{
    Client c;

    private Socket socket;


    public ClientThread(Client c) {
        this.c = c;
    }

    @Override
    public void run() {
        try{


        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }
}
