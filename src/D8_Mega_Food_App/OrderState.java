package D8_Mega_Food_App;

public interface OrderState {

    public void pay(Order order);
    public void prepare(Order order);
    public void deliver(Order order);
    public void cancel(Order Order);
    public String getStateName();
}
