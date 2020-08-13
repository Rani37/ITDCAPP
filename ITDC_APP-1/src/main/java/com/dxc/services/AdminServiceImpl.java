
    
package com.dxc.services;


import java.util.List;




import org.bson.Document;





import com.dxc.dao.AdminDaoImpl;
import com.dxc.dao.IAdminDao;
import com.dxc.pojos.bookingdetailes;
import com.dxc.pojos.hotel;





public class AdminServiceImpl implements IAdminService 
{
 IAdminDao dao=new AdminDaoImpl();





@Override
public boolean adminlogin(int adminid, String password) {
    
    return dao.adminlogin(adminid,password);
}





@Override
public void AddHotel(hotel h) 
{
     dao.AddHotel(h);
    
}





@Override
public List<Document> displayhotellist(hotel h) {
    
    return dao.displayhotellist(h);
}





@Override
public List<Document> cancelhotelbookinglist(bookingdetailes bd) {
    
    return dao.cancelhotelbookinglist(bd);
}





@Override
public boolean cancelrequestedbooking(bookingdetailes bd) {





    return dao.cancelrequestedbooking(bd);
}





}
 






















