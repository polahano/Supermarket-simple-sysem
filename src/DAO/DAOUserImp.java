/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.DTOUser;
import java.util.ArrayList;

/**
 *
 * @author george
 */
public class DAOUserImp implements DAOUserInterface{
   
  private static ArrayList<DTOUser> Employees = new ArrayList<>();
  private static ArrayList<DTOUser> Adminstrators = new ArrayList<>();
    
    @Override
    public void add(DTOUser user) {
        if(user.getType().equalsIgnoreCase("Employee")){
          Employees.add(user);
        }
        else if(user.getType().equalsIgnoreCase("Adminstrator")){
        Adminstrators.add(user);
        }
    }

    @Override
    public void delete(String user_type,String userName,String password) {
        if(user_type.equalsIgnoreCase("Employee")){
          for(DTOUser userN :Employees){
          if(userN.getName().equals(userName)){
           if(userN.getPassword().equals(password)){
             Employees.remove(userN);
             break;
           }
          }
          }
        }
        else if(user_type.equalsIgnoreCase("Adminstrator")){
       for(DTOUser userN :Adminstrators){
          if(userN.getName().equals(userName)){
           if(userN.getPassword().equals(password)){
             Adminstrators.remove(userN);
             break;
           }
          }
          }
        }
    }

    @Override
    public void edit(String user_type,String userName,String oldPassword,String newPassword) {
         if(user_type.equalsIgnoreCase("Employee")){
          for(DTOUser userN :Employees){
          if(userN.getName().equals(userName)){
           if(userN.getPassword().equals(oldPassword)){
               userN.setPassword(newPassword);
             break;
           }
           
          }
          }
        }
        else if(user_type.equalsIgnoreCase("Adminstrator")){
       for(DTOUser userN :Adminstrators){
          if(userN.getName().equals(userName)){
           if(userN.getPassword().equals(oldPassword)){
             userN.setPassword(newPassword);
             break;
           }
         
          }
          }
        }
    }
    @Override
    public ArrayList<DTOUser> listAllEmployees() {
        return Employees;
    }

    @Override
    public ArrayList<DTOUser> listAllAdminstrators() {
        return Adminstrators;
    }

    @Override
    public DTOUser find(String user_type,String username, String password) {
         if(user_type.equalsIgnoreCase("Employee")){
          for(DTOUser userN :Employees){
          if(userN.getName().equals(username)){
           if(userN.getPassword().equals(password)){
             return userN;
           
           }
          }
          }
        }
        else if(user_type.equalsIgnoreCase("Adminstrator")){
       for(DTOUser userN :Adminstrators){
          if(userN.getName().equals(username)){
           if(userN.getPassword().equals(password)){
            return userN;
           }
          }
          }
        }
        return null;
    }
    
}
