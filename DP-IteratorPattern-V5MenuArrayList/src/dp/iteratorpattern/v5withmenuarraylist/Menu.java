/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern.v5withmenuarraylist;

import java.util.Iterator;

/**
 *
 * @author moronkreacionz
 */
public interface Menu {

    public Iterator createIterator();

    public void setMenuName(String menuName);

    public String getMenuName();

    public void setAlternateDays(boolean b);

}
