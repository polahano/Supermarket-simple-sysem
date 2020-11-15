/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAO;

/**
 *
 * @author george
 */
public class BAOFactory {
    public static BAOUserInterface getUserBAO() {
		
		return new BAOUserImp();
		
	}
    public static BAOStoreInterface getStoreBAO() {
		
		return new BAOStoreImp();
		
	}
    
}
