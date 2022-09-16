import java.util.*;
import java.util.stream.Collectors;

public class CalculateClientTransaction {

    public static void main(String[] args) {

        ClientTransaction clientTransaction1 = new ClientTransaction("c1", 100);
        ClientTransaction clientTransaction2 = new ClientTransaction("c2", 150);
        ClientTransaction clientTransaction3 = new ClientTransaction("c3", 200);
        ClientTransaction clientTransaction4 = new ClientTransaction("c1", 250);

        List<ClientTransaction> clientTransactions = new ArrayList<>();

        clientTransactions.add(clientTransaction1);
        clientTransactions.add(clientTransaction2);
        clientTransactions.add(clientTransaction3);
        clientTransactions.add(clientTransaction4);

        List<String> topKClients = new ArrayList<>();
        int k = 2;

        topKClients = getTopKClients(clientTransactions, k);
        System.out.println("top K Clients based on transaction amount :"+topKClients);
    }

    private static List<String> getTopKClients(List<ClientTransaction> clientTrans, int k) {

        Map<String, Integer> map = clientTrans.stream().collect(Collectors.groupingBy(ClientTransaction::getClientId,
                Collectors.summingInt(ClientTransaction::getAmount)));

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        for (Map.Entry entry : map.entrySet()) {
            treeMap.put((int) entry.getValue(), entry.getKey().toString());
        }

        //treeMap.forEach((x,y) -> System.out.println(x+" : "+y));
        //System.out.println(treeMap.descendingMap());
        NavigableMap<Integer, String> navigableMap = treeMap.descendingMap();

        System.out.println("Map in descending order : ");
        navigableMap.forEach((x, y) -> System.out.println(x + " : " + y));
        //System.out.println(navigableMap);
        int count = 0;
        List<String> clients = new ArrayList<>();

        for (Map.Entry entry : navigableMap.entrySet()) {
            clients.add(String.valueOf(entry.getKey()));
            count++;

            if (count == k)
                break;
        }
        return clients;
    }
}
