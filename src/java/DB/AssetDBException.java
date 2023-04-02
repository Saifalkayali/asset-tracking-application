/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 * This class throws AssetDB Exceptions when they are caught 
 * @author salkayali
 */
public class AssetDBException extends Exception {
    public AssetDBException(String msg) {
        super(msg);
    }

    public AssetDBException(String message, Throwable cause) {
        super(message, cause);
    
}
}