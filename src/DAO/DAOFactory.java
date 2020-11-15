/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author george
 */
public class DAOFactory {
    public static DAOUserInterface getUserDAO() {
		
		return new DAOUserImp();
		
	}
    public static DAOStoreInterface getStoreDAO() {
		
		return new DAOStoreImp();
		
	}
    
}
