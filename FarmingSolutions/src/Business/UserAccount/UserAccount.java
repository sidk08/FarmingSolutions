/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.FarmerData.Farmer;
import Business.Roles.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author ritesh
 */
public class UserAccount {

    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private WorkQueue workQueueDoc;
//    private Farmer farmer;
   
    public UserAccount() {
        workQueue = new WorkQueue();
        workQueueDoc = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public WorkQueue getWorkQueueDoc() {
        return workQueueDoc;
    }

    public void setWorkQueueDoc(WorkQueue workQueueDoc) {
        this.workQueueDoc = workQueueDoc;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}
