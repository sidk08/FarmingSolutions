/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Roles.Role;
import java.util.HashSet;
import Business.Roles.FarmerRole;

/**
 *
 * @author admin
 */
public class FarmerOrganisation extends Organization {
     public FarmerOrganisation() {
        super(Organization.Type.FarmerOrganisation.getValue());
    }
    
    @Override
    public HashSet<Role> getSupportedRole() {
        
        return null;
    }
}
