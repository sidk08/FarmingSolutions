/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.DoctorRole;
import Business.Roles.FarmerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class DoctorOrganization extends Organization {

    public DoctorOrganization() {
        super(Organization.Type.DoctorOrganisation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
    
    
    
}
