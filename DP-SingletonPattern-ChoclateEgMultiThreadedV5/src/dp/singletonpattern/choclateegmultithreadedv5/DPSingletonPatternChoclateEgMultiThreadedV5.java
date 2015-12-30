/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.singletonpattern.choclateegmultithreadedv5;

/**
 *
 * @author moronkreacionz
 */
public class DPSingletonPatternChoclateEgMultiThreadedV5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("V3 - regular chocolate singleton class \n "
                + "V4 - uses static initializer \n"
                + "V5 - uses volatile static member variable with double check \n "
                + ".. make note of above.\n\n\n"
                + ".. \n"
                + ".. \n"
                + "Multi Threaded Implementation, but this one \n"
                + "does not handle singleton object creation correctly. \n"
                + ":note: observe that each thread has its own count of singleton \n"
                + "objects and the no of times it ran through, the count incremented \n"
                + "whereas a regular singleton class should not have increased the count \n"
                + "right? "
                + "This is behaving erratic, at times it is showing count 1 \n"
                + "or sometimes its count 2 \n"
                + "need to check, why so\n");
        
        System.out.println("Threads Implementation ");
        
        System.out.println("-----------------------");
        System.out.println("Threads code starts here ");
        
        WorkCadbury wc = new WorkCadbury();
        WorkHershey wh = new WorkHershey();

        Thread t1 = new Thread(wc);
        Thread t2 = new Thread(wh);

        t1.start();
        t2.start();

        t1.setName("T1-Cadbury");
        t2.setName("T2-Hershey");

        Thread t = Thread.currentThread();
        ChocoHolic[] amul = new ChocoHolic[5];
        for (int i = 0; i < 5; i++) {
            amul[i] = ChocoHolic.getInstance();
            System.out.println("----Amul Thread t.getName() " + t.getName() + " "
                    + " :loop-" + i + "\tamul["+i+"] count:" + amul[i].getCount());
            try {
                Thread.sleep(900);
            } catch (Exception ex) {
                System.out.println("Exception occured" + ex);
            }
            System.out.println("     ");
        }

        System.out.println("-----------------------");
        System.out.println("Threads code ends here ");
    }
}

class WorkCadbury implements Runnable {

    @Override
    public void run() {
        ChocoHolic[] cadbury = new ChocoHolic[5];
        Thread t = Thread.currentThread();
        System.out.println("Hello Cadbury ChocoHolic Class");
        for (int i = 0; i < 5; i++) {
            cadbury[i] = ChocoHolic.getInstance();
            System.out.println("\tCadbury Thread t.getName:" + t.getName() + " :loop-" 
                    + i + "\tcadbury["+i+"] count:" + cadbury[i].getCount());
            try {
                Thread.sleep(300);
            } catch (Exception ex) {
                System.out.println("\tWork Cadbury - Exception occured" + ex);
            }
        }// five times in this thread itself for Cadbury Chocolates 
    }
}

class WorkHershey implements Runnable {

    @Override
    public void run() {
        ChocoHolic[] hershey = new ChocoHolic[5];
        Thread t = Thread.currentThread();
        System.out.println("Hello Hershey ChocoHolic Class");
        for (int i = 0; i < 5; i++) {
            hershey[i] = ChocoHolic.getInstance();
            System.out.println("\tHershey Thread t.getName:" + t.getName() + " :loop-" 
                    + i +"\thershey["+i+"] count:" + hershey[i].getCount());
            try {
                Thread.sleep(800);
            } catch (Exception ex) {
                System.out.println("\tWork Hershey - Exception occured" + ex);
            }
        }// five times in this thread itself for Hershey Chocolates
    }
}

/* - Sample output 
Multi Threaded Implementation, but this one 
does not handle singleton object creation correctly. 
:note: observe that each thread has its own count of singleton 
objects and the no of times it ran through, the count incremented 
whereas a regular singleton class should not have increased the count 
right? This is behaving erratic, at times it is showing count 1 
or sometimes its count 2 
need to check, why so

Threads Implementation 
-----------------------
Threads code starts here 
Hello Cadbury ChocoHolic Class
Hello Hershey ChocoHolic Class
----Amul Thread t.getName() main  :loop-0	amul[0] count:2
	Cadbury Thread t.getName:T1-Cadbury :loop-0	cadbury[0] count:1
	Hershey Thread t.getName:T2-Hershey :loop-0	hershey[0] count:2
	Cadbury Thread t.getName:T1-Cadbury :loop-1	cadbury[1] count:2
	Cadbury Thread t.getName:T1-Cadbury :loop-2	cadbury[2] count:2
	Hershey Thread t.getName:T2-Hershey :loop-1	hershey[1] count:2
     
----Amul Thread t.getName() main  :loop-1	amul[1] count:2
	Cadbury Thread t.getName:T1-Cadbury :loop-3	cadbury[3] count:2
	Cadbury Thread t.getName:T1-Cadbury :loop-4	cadbury[4] count:2
	Hershey Thread t.getName:T2-Hershey :loop-2	hershey[2] count:2
     
----Amul Thread t.getName() main  :loop-2	amul[2] count:2
	Hershey Thread t.getName:T2-Hershey :loop-3	hershey[3] count:2
     
----Amul Thread t.getName() main  :loop-3	amul[3] count:2
	Hershey Thread t.getName:T2-Hershey :loop-4	hershey[4] count:2
     
----Amul Thread t.getName() main  :loop-4	amul[4] count:2
     
-----------------------
Threads code ends here 
*/