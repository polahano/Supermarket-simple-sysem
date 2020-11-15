/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KMarketFrames;

import DTO.DTOCategory;
import DTO.DTOItem;
import DTO.DTOUser;

/**
 *
 * @author MainFrame
 */
public class MainFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creating default users , items and categories
        BAO.BAOUserInterface def_User = BAO.BAOFactory.getUserBAO();
        BAO.BAOStoreInterface def_obj = BAO.BAOFactory.getStoreBAO();
// Creating default users
        DTO.DTOUser user_1 = new DTOUser();
        DTO.DTOUser user_2 = new DTOUser();
        user_1.setName("Ahmed");
        user_1.setPassword("ahmedpass");
        user_1.setPhone("01045678911");
        user_1.setType("Adminstrator");
        def_User.add(user_1);
        /////////
        user_2.setName("Ali");
        user_2.setPassword("alipass");
        user_2.setPhone("01035118911");
        user_2.setType("Employee");
        def_User.add(user_2);
// Creating default categories
        DTO.DTOCategory cat_1 = new DTOCategory();
        DTO.DTOCategory cat_2 = new DTOCategory();
        cat_1.setName("Chocolates");
        cat_2.setName("Soft drinks");
        def_obj.addNewCategory(cat_1);
        def_obj.addNewCategory(cat_2);
// Creating default items then saving it into categories
        DTO.DTOItem item_1 = new DTOItem();
        DTO.DTOItem item_2 = new DTOItem();
        DTO.DTOItem item_3 = new DTOItem();
        DTO.DTOItem item_4 = new DTOItem();
        item_1.setBarcode("00114564498");
        item_1.setName("chocolate");
        item_1.setManufacturerName("Moro");
        item_1.setBuyPrice(4);
        item_1.setSellPrice(6);
        item_1.setQuantity(50);
        item_1.setCategory(cat_1);
        /////////
        item_2.setBarcode("00117764498");
        item_2.setName("chocolate");
        item_2.setManufacturerName("Galaxy");
        item_2.setBuyPrice(6);
        item_2.setSellPrice(8);
        item_2.setQuantity(40);
        item_2.setCategory(cat_1);
        /////////
        item_3.setBarcode("02471394492");
        item_3.setName("Drink");
        item_3.setManufacturerName("pepsi");
        item_3.setBuyPrice(3);
        item_3.setSellPrice(5);
        item_3.setQuantity(60);
        item_3.setCategory(cat_2);
        /////////
        item_4.setBarcode("02471394493");
        item_4.setName("Drink");
        item_4.setManufacturerName("7-UP");
        item_4.setBuyPrice(3);
        item_4.setSellPrice(4);
        item_4.setQuantity(55);
        item_4.setCategory(cat_2);
        
        def_obj.save(item_1);
        def_obj.save(item_2);
        def_obj.save(item_3);
        def_obj.save(item_4);
        SignIn.main(args);
    }
    
}
