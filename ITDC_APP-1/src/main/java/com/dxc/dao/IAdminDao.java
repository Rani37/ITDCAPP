
    
package com.dxc.dao;


import java.util.List;





import org.bson.Document;





import com.dxc.pojos.bookingdetailes;
import com.dxc.pojos.hotel;





public interface IAdminDao {





    boolean adminlogin(int adminid, String password);





    void AddHotel(hotel h);





    List<Document> displayhotellist(hotel h);





    List<Document> cancelhotelbookinglist(bookingdetailes bd);





    boolean cancelrequestedbooking(bookingdetailes bd);
 





}
 





















