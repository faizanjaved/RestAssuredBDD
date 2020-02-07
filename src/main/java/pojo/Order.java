package pojo;

public class Order {
    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;
    private boolean complete;

    public Order() {
        setId(6);
        setPetId(5);
        setQuantity(2);
        setShipDate("2020-02-02T14:12:44.922Z");
        setStatus("placed");
        setComplete(false);
    }

    public Order(Integer id, int petId, int quantity, String shipDate, String status, boolean complete) {
        setId(id);
        setPetId(petId);
        setQuantity(quantity);
        setShipDate(shipDate);
        setStatus(status);
        setComplete(complete);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
