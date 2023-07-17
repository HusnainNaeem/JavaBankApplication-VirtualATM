package bank.application;

import java.sql.*;
import javax.swing.JOptionPane;

public class Controller {
    ControllerConnection connection = new ControllerConnection();
    
    public void saveData(BankModel bankDetail) {
        
        String saveQuery = "INSERT INTO accTable (accoNo, accType, balance, employmentSta) VALUES (?, ?, ?, ?)";
        String saveCustInfoQuery = "INSERT INTO custInfoTable (accoNo, name, fatherName, dob, gender, email, address, mailingAddress, province, city, postalCode, cnic, religon, martialSta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        String saveSecuredInfoQuery = "INSERT INTO SecuredInfoTable (accoNo, mpin, pin) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement accStatement = connection.getConnection().prepareStatement(saveQuery);
            PreparedStatement custInfoStatement = connection.getConnection().prepareStatement(saveCustInfoQuery);
            PreparedStatement securedInfoStatement = connection.getConnection().prepareStatement(saveSecuredInfoQuery);

            accStatement.setString(1, bankDetail.getAccoNo());
            accStatement.setString(2, bankDetail.getAccType());
            accStatement.setDouble(3, bankDetail.getBalance());
            accStatement.setString(4, bankDetail.getEmploymentSta());

            custInfoStatement.setString(1, bankDetail.getAccoNo());
            custInfoStatement.setString(2, bankDetail.getName());
            custInfoStatement.setString(3, bankDetail.getFatherName());
            custInfoStatement.setString(4, bankDetail.getDob());
            custInfoStatement.setString(5, String.valueOf(bankDetail.getGender()));
            custInfoStatement.setString(6, bankDetail.getEmail());
            custInfoStatement.setString(7, bankDetail.getAddress());
            custInfoStatement.setString(8, bankDetail.getMailingAddress());
            custInfoStatement.setString(9, bankDetail.getProvince());
            custInfoStatement.setString(10, bankDetail.getCity());
            custInfoStatement.setInt(11, bankDetail.getPostalCode());
            custInfoStatement.setString(12, bankDetail.getCnic());
            custInfoStatement.setString(13, bankDetail.getReligon());
            custInfoStatement.setString(14, bankDetail.getMartialSta());

            securedInfoStatement.setString(1, bankDetail.getAccoNo());
            securedInfoStatement.setString(2, bankDetail.getMpin());
            securedInfoStatement.setInt(3, bankDetail.getPin());

            accStatement.executeUpdate();
            custInfoStatement.executeUpdate();
            securedInfoStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Controller class", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
   
    public boolean checkLogin(String login, String pass) {
    String loginQuery = "SELECT * FROM SecuredInfoTable WHERE accoNo = ? AND mpin = ?";
    
    try {
        PreparedStatement statement = connection.getConnection().prepareStatement(loginQuery);
        statement.setString(1, login);
        statement.setString(2, pass);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            resultSet.close();
            return true; // Login exists in the database
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return false; // Login does not exist or an exception occurred
}

    
    public void setBalance(double balance, String accNo) {
        String saveQuery = "UPDATE accTable SET balance = ? WHERE accoNo = ?";
        
        try {
            PreparedStatement balanceStatement = connection.getConnection().prepareStatement(saveQuery);
            balanceStatement.setDouble(1, balance);
            balanceStatement.setString(2, accNo);
            balanceStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public BankModel getAllDetail(String accoNo) {
        BankModel tempRecord = new BankModel();
        
        String query = "SELECT * FROM accTable JOIN custInfoTable ON accTable.accoNo = custInfoTable.accoNo WHERE accTable.accoNo = ?";
        
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement(query);
            statement.setString(1, accoNo);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                tempRecord.setAccoNo(resultSet.getString("accTable.accoNo"));
                tempRecord.setAccType(resultSet.getString("accType"));
                tempRecord.setBalance(resultSet.getDouble("balance"));
                tempRecord.setEmploymentSta(resultSet.getString("employmentSta"));
                tempRecord.setName(resultSet.getString("name"));
                tempRecord.setFatherName(resultSet.getString("fatherName"));
                tempRecord.setDob(resultSet.getString("dob"));
                tempRecord.setGender(resultSet.getString("gender").charAt(0));
                tempRecord.setEmail(resultSet.getString("email"));
                tempRecord.setAddress(resultSet.getString("address"));
                tempRecord.setMailingAddress(resultSet.getString("mailingAddress"));
                tempRecord.setProvince(resultSet.getString("province"));
                tempRecord.setCity(resultSet.getString("city"));
                tempRecord.setPostalCode(resultSet.getInt("postalCode"));
                tempRecord.setCnic(resultSet.getString("cnic"));
                tempRecord.setReligon(resultSet.getString("religon"));
                tempRecord.setMartialSta(resultSet.getString("martialSta"));
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return tempRecord;
    }

    public void updateBalance(BankModel bankDetail) {
        String updateQuery = "UPDATE accTable SET balance = ? WHERE accoNo = ?";
        
        try {
            PreparedStatement statement = connection.getConnection().prepareStatement(updateQuery);
            statement.setDouble(1, bankDetail.getBalance());
            statement.setString(2, bankDetail.getAccoNo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
