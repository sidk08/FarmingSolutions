package Business;

//import Business.Employee.Employee;

import Business.Employee.Employee;
import Business.UserAccount.UserAccount;

import Business.Roles.SystemAdminRole;

//import Business.UserAccount.UserAccount;

/**
 *
 * @author Aastha
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
       Employee employee = system.getEmployeeDirectory().createEmployee("System Administrator");
       
         UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
