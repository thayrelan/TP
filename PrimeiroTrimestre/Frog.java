public class Frog extends Thread{
   
    private String frogName;
    private int Jump;
    private int howFar=0;

    public int getfrogName(){
        return this.frogName;
    }
    public int gethowFar(){
        return this.howFar;
    }
    
    
    public Frog(String frogname, int Jump){
        start();
    }

    public void moveFrog(){
        howFar += Jump;
    }

    public void run(){
        Thread.sleep(500);
        moveFrog();
    }

}