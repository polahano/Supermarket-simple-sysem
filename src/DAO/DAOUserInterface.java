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
public interface DAOUserInterface {
    public void add(DTOUser user);
    public void delete(String user_type,String userName,String password);
    public void edit(String user_type,String userName,String oldPassword,String newPassword);
    public DTOUser find(String user_type,String username, String password);
    public ArrayList<DTOUser> listAllEmployees();
    public ArrayList<DTOUser> listAllAdminstrators();

}
