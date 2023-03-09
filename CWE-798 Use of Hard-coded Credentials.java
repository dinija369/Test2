public class account { 
        
    int VerifyAdmin(String password) {
        if (!password.equals("Mew!")) {
        return(0);
        }
        //Diagnostic Mode
        return(1);
    }

    public boolean admin(String password) {
        if (password.equals("68af404b513073584c4b6f22b6c63e6b")) {
        System.out.println("Entering Diagnostic Mode...");
        return true;
        }
        System.out.println("Incorrect Password!");
        return false;
    }
}