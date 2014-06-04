/*
 *  AUTHOR:     Andrew Hetzler
 *  CREATED:    June 3rd, 2014
 *  VERSION:    0.1 
*/

package net.hetztech.codedepot.user.preferences;

public class UserPreferencesAccount {
    private String firstName, lastName, userName, password;
    
    public UserPreferencesAccount ( ) {
        
    }
    
    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }
    
    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }
    
    public void setUserName ( String userName ) {
        this.userName = userName;
    }
    
    public void setPassword ( String password ) {
        this.password = password;
    }
    
    public String getFirstName ( ) {
        return firstName;
    }
    
    public String getLastName ( ) {
        return lastName;
    }
    
    public String getUserName ( ) {
        return userName;
    }
    
    public String getPassword ( ) {
        return password;
    }
}