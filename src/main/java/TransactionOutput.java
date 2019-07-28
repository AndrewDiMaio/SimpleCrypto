import java.security.PublicKey;

public class TransactionOutput {
    public String id;
    public PublicKey reciepient; //also known as the new owner of these coins.
    public float value; //the amount of coins they own
    public String parentTransactionId; //the id of the transaction this output was created in

    //Constructor
    public TransactionOutput(PublicKey reciepient, float value, String parentTransactionId) {
        this.reciepient = reciepient;
        this.value = value;
        this.parentTransactionId = parentTransactionId;
        this.id = Sha256Util.applySha256(Sha256Util.getStringFromKey(reciepient)+ value +parentTransactionId);
    }

    //Check if coin belongs to you
    public boolean isMine(PublicKey publicKey) {
        return (publicKey == reciepient);
    }

    @Override
    public String toString() {
        return "TransactionOutput{" +
                "id='" + id + '\'' +
                ", reciepient=" + reciepient +
                ", value=" + value +
                ", parentTransactionId='" + parentTransactionId + '\'' +
                '}';
    }
}
