package questions.chapter13.questions.q24;

public class TicketManager {
    /*

    24. What statements about the following class definition are true? (Choose all that apply.)
public final class TicketManager {
private int tickets;
private static TicketManager instance;
private TicketManager() {}
static synchronized TicketManager getInstance() { // k1
if (instance==null) instance = new TicketManager(); // k2
return instance;
}
public int getTicketCount() { return tickets; }
public void addTickets(int value) {tickets += value;} // k3
public void sellTickets(int value) {
synchronized (this) { // k4
tickets -=
value;
} } }
++A. It compiles without issue.
B. The code will not compile because of line k2.
C. The code will not compile because of line k3.
D. The locks acquired on k1 and k4 are on the same object.
E. The class correctly protects the tickets data from race conditions.
++F. At most one instance of TicketManager will be created in an application that uses this
class.
     */

    private int tickets;

    private static  TicketManager instance;

    private TicketManager(){

    }

    static synchronized TicketManager getInstance(){
        if(instance ==null) instance=new TicketManager();
        return instance;
    }

    public int getTicketCount(){
        return tickets;
    }

    public void addTickets(int value){
        tickets +=value;
    }

    public void sellTickets(int value){
        synchronized (this){
            tickets -=value;
        }
    }
}
