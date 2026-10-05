package assignmentjava5;

class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString() {
        return "InvoiceItem: " +
                "\n\t Id is: " + id +
                "\n\t Description is: " + desc +
                "\n\t Quantity is: " + qty +
                "\n\t Unit Price is: " + unitPrice;
    }
}

class Testitem {
    public static void main(String[] args) {

        InvoiceItem i1 = new InvoiceItem("A01", "Laptop", 2, 500.00);

        System.out.println(i1);

        i1.setQty(3);
        i1.setUnitPrice(450.00);

        System.out.println(i1);

        System.out.println("id is: " + i1.getId());
        System.out.println("description is: " + i1.getDesc());
        System.out.println("quantity is: " + i1.getQty());
        System.out.println("unit price is: " + i1.getUnitPrice());
        System.out.println("total is: " + i1.getTotal());
    }
}
