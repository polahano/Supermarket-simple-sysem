/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAO;

import DTO.DTOUser;
import java.util.ArrayList;

/**
 *
 * @author george
 */
public interface BAOUserInterface {
       public boolean add(DTOUser user);
    public boolean delete(String user_type,String userName,String password);
    public boolean edit(String user_type,String userName,String oldPassword,String newPassword);
    public boolean isExist(String user_type,String username, String password);
    public DTOUser find(String user_type,String username, String password);
    public ArrayList<DTOUser> listAllEmployees();
}
