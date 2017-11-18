package Business;


import Business.Network.Network;
import Business.Organization.Organization;
import Business.Roles.Role;
//import Business.Role.Role;
//import Business.Role.SystemAdminRole;
//import Business.Vaccine.VaccineCatalog;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Aastha
 */
public class EcoSystem extends Organization  {

   
   // private ArrayList<Network> networkList;
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
          
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    /**
     *
     * @return
     */
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList = new ArrayList<>();
//        roleList.add(new SystemAdmin());
//        return roleList;
//    }

    public boolean checkIfUsernameIsUnique(String username) {

//        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
//            return false;
//        }

        return true;
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        
//  roles.add(new System());
//        roles.add(new HospitalAdminRole());
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

    
    
}