package murach.db;
/**
 * Name: Eugene Froelich
 * @Date:   11/02/2017
 * Project: Ch21 Ex1
 */

/* 
 * This is just a wrapper class so we can throw a common exception for
 * the UI to catch without tightly coupling the UI to the database layer.
 */
@SuppressWarnings("serial")
public class DBException extends Exception {
    DBException() {}
    
    DBException(Exception e) {
        super(e);
    }
}