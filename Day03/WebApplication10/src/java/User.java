
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String favoriteFood;
    private String favoriteColor;

    public User() {
        
    }
    
    public User(String firstName, String lastName, String email, String favoriteFood, String favoriteColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.favoriteFood = favoriteFood;
        this.favoriteColor = favoriteColor;
    }
    
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

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
    
    
}
