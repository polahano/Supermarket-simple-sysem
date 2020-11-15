/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAO;

import DTO.DTOCategory;
import DTO.DTOItem;
import java.util.ArrayList;

/**
 *
 * @author george
 */
public interface BAOStoreInterface {
    
	public boolean save(DTOItem item);
	public boolean deleteByBarCode(String barCode);
        public boolean edit(String barCode,String data_edit,String s);
        public boolean isExist(String barcode);
	public ArrayList<DTOItem> listAll();
	public boolean addNewCategory(DTOCategory cat);
        public boolean removeCategory(String name);
        public boolean editCategory(String oldCategoryName,String newCategoryName);
        public ArrayList<DTOCategory> listCategories();
        public boolean isCategoryExist(String name);
        public DTO.DTOItem getItem(String barcode);
        public DTO.DTOCategory getCategory(String name);
}
