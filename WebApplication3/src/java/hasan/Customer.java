/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasan;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author h
 */
@Named(value = "customer")
@RequestScoped
public class Customer {

    /**
     * Creates a new instance of Customer
     */
    public Customer() {
    }
    
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void processValueChange(ValueChangeEvent event)throws AbortProcessingException {
       //javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().
       //addMessage.(event.getComponent().getClientId(),new FacesMessage("hello world"));
        if (null != event.getNewValue() && false) {
            FacesContext.getCurrentInstance().getExternalContext().
            getSessionMap().put("firstName", event.getNewValue());
       }
   }
   
   public String submitAction(){
       if(firstName.equals("hasan"))
           return "ok";
       return "not";
   }
   
   public String getTitle(){
       return "Hasan title jsf";
   }
    
}
