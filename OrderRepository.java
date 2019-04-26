import java.util.Map;
import java.util.TreeMap;

public interface OrderRepository {
    int addOrder(Order order);
    void cancelOrder(int orderId);
    int getOrder(int orderId);

}
