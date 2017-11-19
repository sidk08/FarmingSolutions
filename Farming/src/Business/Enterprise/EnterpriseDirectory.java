<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class EnterpriseDirectory {
     private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
//    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
//        Enterprise enterprise = null;
////        if (type == Enterprise.EnterpriseType.Hospital){
////            enterprise = new HospitalEnterprise(name);
////            enterpriseList.add(enterprise);
////        }
////        else if (type == Enterprise.EnterpriseType.CDC){
////            enterprise = new CDCEnterprise(name);
////            enterpriseList.add(enterprise);
////        }
////        else  if (type == Enterprise.EnterpriseType.Distributor){
////            enterprise = new DistributorEnterprise(name);
////            enterpriseList.add(enterprise);
////        }
//        return enterprise;
//    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }
        
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type){
         
        Enterprise enterprise =null;
        
        if(type.getValue().equals(Enterprise.EnterpriseType.District)){
            enterprise = new DistrictEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
    
}
>>>>>>> 6eef278d3b9ed04d227b037dcf5d933fe079c4a1
