public class account { 
    public BankAccount getUserBankAccount() {        
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        int authResult = authenticateUser(username, password);
    }
}