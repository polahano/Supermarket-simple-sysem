/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAO;

import DAO.DAOFactory;
import DAO.DAOStoreInterface;
import DTO.DTOCategory;
import DTO.DTOItem;
import java.util.ArrayList;


/**
 *
 * @author george
 */
public class BAOStoreImp implements BAOStoreInterface{
    DAOStoreInterface obj =DAOFactory.getStoreDAO();
    
    @Override
    public boolean save(DTOItem item) {
        boolean flag = true;
        for(DTOItem itemN : obj.listAll()){
           if(!(itemN.getBarcode().equalsIgnoreCase(item.getBarcode()))){
            continue;
           }
               flag=false;
        }
        if(flag){
        obj.save(item);
        }
        
        return flag;
        
    }

    @Override
    public boolean deleteByBarCode(String barCode) {
        boolean flag = false;
        for(DTOItem itemN : obj.listAll()){
           if(itemN.getBarcode().equalsIgnoreCase(barCode)){
            flag=true;
            break;
           }
              
        }
        if(flag){
        obj.deleteByBarCode(barCode);
        }
       return flag;
    }

    @Override
    public boolean edit(String barCode, String data_edit, String s) {
        boolean flag = false;
        for(DTOItem itemN : obj.listAll()){
           if(itemN.getBarcode().equalsIgnoreCase(barCode)){
           flag=true;
            break;
           }
              
        }
        if(flag){
        obj.edit(barCode, data_edit, s);
        }
       return flag;
    }

    @Override
    public ArrayList<DTOItem> listAll() {
        return obj.listAll();
    }

    @Override
    public boolean addNewCategory(DTOCategory cat) {
        boolean flag = true;
        for(DTOCategory catN : obj.listCategories()){
           if(!(catN.getName().equalsIgnoreCase(cat.getName()))){
            continue;
           }
               flag=false;
        }
        if(flag){
        obj.addNewCategory(cat);
        }
        return flag;
    }

    @Override
    public boolean removeCategory(String name) {
        boolean flag=false ;
        for(DTOCategory cat : obj.listCategories()){
           if(cat.getName().equalsIgnoreCase(name)){
               flag=true;
             break;
           }
           
           
        }
        if(flag){
        obj.removeCategory(name);
        }
       return flag;
    }

    @Override
    public boolean editCategory(String oldCategoryName, String newCategoryName) {
        boolean flag = false;
         for(DTOCategory cat : obj.listCategories()){
           if(cat.getName().equalsIgnoreCase(oldCategoryName)){
               flag=true;
             break;
           } 
        }
        if(flag){
        obj.editCategory(oldCategoryName, newCategoryName);
        }
        return flag;
    }

    @Override
    public ArrayList<DTOCategory> listCategories() {
     return obj.listCategories();
    }

    @Override
    public boolean isExist(String barcode) {
         boolean flag = false;
        for(DTOItem itemN : obj.listAll()){
           if(!(itemN.getBarcode().equalsIgnoreCase(barcode))){
            continue;
           }
               flag=true;
        }
      
        
        return flag;
        
    }

    @Override
    public boolean isCategoryExist(String name) {
            boolean flag = false;
         for(DTOCategory cat : obj.listCategories()){
           if(cat.getName().equalsIgnoreCase(name)){
               flag=true;
             break;
           } 
        }
        
        return flag;

    }

    @Override
    public DTOItem getItem(String barcode) {
         boolean flag = false;
        for(DTOItem itemN : obj.listAll()){
           if(itemN.getBarcode().equalsIgnoreCase(barcode)){
           return itemN;
           }
              
        }
      
       return null;
    }

    @Override
    public DTOCategory getCategory(String name) {
       
         for(DTOCategory cat : obj.listCategories()){
           if(cat.getName().equalsIgnoreCase(name)){
              return cat;
        
           } 
        }
        
        return null;
    }
    }
    
    
    

