public class ClientTransaction {

    String clientId;
    int amount;

    public ClientTransaction(String clientId, int amount) {
        this.clientId = clientId;
        this.amount = amount;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
