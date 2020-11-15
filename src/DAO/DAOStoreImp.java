package DAO;

import DTO.DTOCategory;
import java.util.ArrayList;

import DTO.DTOItem;


public class DAOStoreImp implements DAOStoreInterface {
	private static ArrayList<DTOItem> items=  new ArrayList<>();
        private static ArrayList<DTOCategory> Categories =new ArrayList<>();
	
	@Override
	public void save(DTOItem item) {
            items.add(item);	
	}
	
	
	

	@Override
	public void deleteByBarCode(String barCode) {
	for(DTOItem itemN:items){
        if(itemN.getBarcode().equals(barCode)){
            int i =items.indexOf(itemN);
            items.remove(i);
            break;
        }
        
        }	
		
	}

	@Override
	public ArrayList<DTOItem> listAll() {
            return items;
	}

	@Override
	public void addNewCategory(DTOCategory cat) {
            Categories.add(cat);
	
	}

    @Override
    public void removeCategory(String name) {
        for(DTOCategory catN:Categories){
        if(catN.getName().equals(name)){
          for(DTOItem itemN:items){
          if(itemN.getCategory().getName().equals(name)){
          int i= items.indexOf(itemN);
          items.remove(i);
          }
          
          }
          Categories.remove(catN);
          break;
        }
        }
    }

    @Override
    public void editCategory(String oldCategoryName, String newCategoryName) {
        for(DTOCategory catN:Categories){
        if(catN.getName().equals(oldCategoryName)){
          for(DTOItem itemN:items){
          if(itemN.getCategory().getName().equals(oldCategoryName)){
          int i= items.indexOf(itemN);
          items.get(i).getCategory().setName(newCategoryName);
          }
          
          }
          Categories.get(Categories.indexOf(catN)).setName(newCategoryName);
          break;
        }
        }
    }

    @Override
    public void edit(String barCode, String data_edit, String s) {
        for (DTOItem itemN : items)
        {
            if(itemN.getBarcode().equals(barCode))
            {
                if(data_edit.equalsIgnoreCase("sell price")){
                 itemN.setSellPrice(Float.parseFloat(s));
                }
                else if(data_edit.equalsIgnoreCase("buy price")){
                itemN.setBuyPrice(Float.parseFloat(s));
                }
                else if(data_edit.equalsIgnoreCase("quantity")){
                    itemN.setQuantity(Integer.parseInt(s));
                }
           
            }
                
                
        }
            
    }

    @Override
    public ArrayList<DTOCategory> listCategories() {
        return  Categories;
    }

	
}
