package Business;

//import Business.Disease.DiseaseCatalog;
//import Business.Network.Network;
//import Business.Organization.Organization;
//import Business.Role.Role;
//import Business.Role.SystemAdminRole;
//import Business.Vaccine.VaccineCatalog;
import java.util.ArrayList;

/**
 *
 * @author Aastha
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private DiseaseCatalog diseaseCatalog;
    private VaccineCatalog vaccineCatalog;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
            business.setDiseaseCatalog(new DiseaseCatalog());
            business.setVaccineCatalog(new VaccineCatalog());
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

//    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

//        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
//            return false;
//        }

        return true;
    }

    public DiseaseCatalog getDiseaseCatalog() {
        return diseaseCatalog;
    }

    public void setDiseaseCatalog(DiseaseCatalog diseaseCatalog) {
        this.diseaseCatalog = diseaseCatalog;
    }

    public VaccineCatalog getVaccineCatalog() {
        return vaccineCatalog;
    }

    public void setVaccineCatalog(VaccineCatalog vaccineCatalog) {
        this.vaccineCatalog = vaccineCatalog;
    }
    
    
    
}