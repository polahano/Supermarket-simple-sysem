/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAO;

import DAO.DAOFactory;
import DAO.DAOUserInterface;
import DTO.DTOUser;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author george
 */
public class BAOUserImp implements BAOUserInterface {

    DAOUserInterface obj = DAOFactory.getUserDAO();

    @Override
    public boolean add(DTOUser user) {
        boolean flag = true;
        if (user.getType().equalsIgnoreCase("Adminstrator")) {
            for (DTOUser userN : obj.listAllAdminstrators()) {
                if (!(userN.getName().equals(user.getName()))) {
                    continue;
                }
                flag = false;
            }
            if (flag) {
                obj.add(user);
            }

        } else if (user.getType().equalsIgnoreCase("Employee")) {
            for (DTOUser userN : obj.listAllEmployees()) {
                if (!(userN.getName().equals(user.getName()))) {
                    continue;
                }
                flag = false;
            }
            if (flag) {
                obj.add(user);
            }
        }
        return flag;
    }

    @Override
    public boolean delete(String user_type, String userName, String password) {
        boolean flag = false;
        if (user_type.equalsIgnoreCase("Adminstrator")) {
            for (DTOUser userN : obj.listAllAdminstrators()) {
                if (userN.getName().equals(userName)) {
                    if (userN.getPassword().equals(password)) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                obj.delete(user_type, userName, password);
            }

        } else if (user_type.equalsIgnoreCase("Employee")) {
            for (DTOUser userN : obj.listAllEmployees()) {
                if (userN.getName().equals(userName)) {
                    if (userN.getPassword().equals(password)) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                obj.delete(user_type, userName, password);
            }

        }
        return flag;
    }

    @Override
    public boolean edit(String user_type, String userName, String oldPassword, String newPassword) {
        boolean flag = false;
        if (user_type.equalsIgnoreCase("Adminstrator")) {
            for (DTOUser userN : obj.listAllAdminstrators()) {
                if (userN.getName().equals(userName)) {
                    if (userN.getPassword().equals(oldPassword)) {
                        flag = true;
                        break;
                    }
                    
                }
            }
            if (flag) {
                obj.edit(user_type, userName, oldPassword, newPassword);
            }

        } else if (user_type.equalsIgnoreCase("Employee")) {
            for (DTOUser userN : obj.listAllEmployees()) {
                if (userN.getName().equals(userName)) {
                    if (userN.getPassword().equals(oldPassword)) {
                        flag = true;
                        break;
                    }
                  
                }
            }
            if (flag) {
                obj.edit(user_type, userName, oldPassword, newPassword);
            }
        }
        return flag;
    }

    @Override
    public boolean isExist(String user_type, String username, String password) {
        boolean flag = false;
        if (user_type.equalsIgnoreCase("Adminstrator")) {
            for (DTOUser userN : obj.listAllAdminstrators()) {
                if (userN.getName().equals(username)) {
                    if (userN.getPassword().equals(password)) {
                        flag = true;
                        break;
                    }
                }
            }
          /*  if (flag) {
                obj.find(user_type, username, password);
            }*/

        } else if (user_type.equalsIgnoreCase("Employee")) {
            for (DTOUser userN : obj.listAllEmployees()) {
                if (userN.getName().equals(username)) {
                    if (userN.getPassword().equals(password)) {
                        flag = true;
                        break;
                    }
                }
            }
           /* if (flag) {
                obj.find(user_type, username, password);
            }*/

        }
        return flag;
    }

    @Override
    public DTOUser find(String user_type, String username, String password) {
        boolean flag = false;
        if (user_type.equalsIgnoreCase("Adminstrator")) {
            for (DTOUser userN : obj.listAllAdminstrators()) {
                if (userN.getName().equals(username)) {
                    if (userN.getPassword().equals(password)) {
                        flag = true;
                        break;
                    }
                }
            }

        } else if (user_type.equalsIgnoreCase("Employee")) {
            for (DTOUser userN : obj.listAllEmployees()) {
                if (userN.getName().equals(username)) {
                    if (userN.getPassword().equals(password)) {
                        flag = true;
                        break;
                    }
                }
            }

        }
        return obj.find(user_type, username, password);
    }

    @Override
    public ArrayList<DTOUser> listAllEmployees() {
        return obj.listAllEmployees();
    }

}
