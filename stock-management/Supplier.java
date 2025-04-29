public class Supplier {
    private String supplierId;
    private String companyName;
    private String contactPerson;
    private String phone;
    private String email;

    public Supplier(String supplierId, String companyName, String contactPerson, String phone, String email) {
        this.supplierId = supplierId;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        setPhone(phone);
        setEmail(email);
    }

    private void setPhone(String phone) {
        if (!phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number.");
        }
        this.phone = phone;
    }

    private void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email.");
        }
        this.email = email;
    }
}
