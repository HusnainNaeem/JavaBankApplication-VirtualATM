package bank.application;

import javax.swing.JOptionPane;
public class BankModel {
    private double balance;
    private String accoNo;
    private String mpin;
    private int pin;
    private String name;
    private String fatherName;
    private String dob;
    private char gender;
    private String email;
    private String address;
    private String mailingAddress;
    private String province;
    private String city;
    private int postalCode;
    private String cnic;
    private String religon;
    private String martialSta;
    private String employmentSta;
    private String accType;

    // Getter and Setter for accoNo
    public String getAccoNo() {
        return accoNo;
    }

    public void setAccoNo(String accoNo) {
        this.accoNo = accoNo;
    }
    
     // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0) {
            this.balance = balance;
        }
    }
    

    // Getter and Setter for mpin
    public String getMpin() {
        return mpin;
    }

    public void setMpin(String mpin) {
        this.mpin = mpin;
    }

    // Getter and Setter for pin
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for fatherName
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    // Getter and Setter for dob
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    // Getter and Setter for gender
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for mailingAddress
    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    // Getter and Setter for province
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for postalCode
    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    // Getter and Setter for cnic
    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    // Getter and Setter for religon
    public String getReligon() {
        return religon;
    }

    public void setReligon(String religon) {
        this.religon = religon;
    }

    // Getter and Setter for martialSta
    public String getMartialSta() {
        return martialSta;
    }

    public void setMartialSta(String martialSta) {
        this.martialSta = martialSta;
    }

    // Getter and Setter for employmentSta
    public String getEmploymentSta() {
        return employmentSta;
    }

    public void setEmploymentSta(String employmentSta) {
        this.employmentSta = employmentSta;
    }

    // Getter and Setter for accType
    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }
    
    public boolean debitBalance(double ammount) {
        if( (this.balance - ammount)>=0 ) {
            this.balance = this.balance - ammount;
            return true;
        }else {
         JOptionPane.showMessageDialog(null,"Insufficient Balance ","Request Failed " ,JOptionPane.INFORMATION_MESSAGE);
         return false;
        }
    }
    
    public void creditBalanace (double ammount) {
        this.balance = this.balance + ammount;
    }
}
