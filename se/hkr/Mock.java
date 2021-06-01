package se.hkr;

public class Mock {
    boolean connected = false;

    public void connect (String url , String pass,String username){
        if (connected){
            System.out.println("Already connected");
            return;
        }
        System.out.println("Connecting...  to " + url + " with " + username);
        connected=true;
    }
    public void disconnect (){
        if (connected){
            System.out.println("disconnecting...");
            connected=false;
        }
        else System.out.println("NO connection has been established yet");
    }
}
