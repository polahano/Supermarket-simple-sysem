package DAO;

import DTO.DTOCategory;
import java.util.ArrayList;


import DTO.DTOItem;

public interface DAOStoreInterface {
	
	public void save(DTOItem item);
	public void deleteByBarCode(String barCode);
        public void edit(String barCode,String data_edit,String s);
	public ArrayList<DTOItem> listAll();
	public void addNewCategory(DTOCategory cat);
        public void removeCategory(String name);
        public void editCategory(String oldCategoryName,String newCategoryName);
        public ArrayList<DTOCategory> listCategories();

}
