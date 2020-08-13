
    
package com.dxc.dao;


import java.util.List;




import org.bson.Document;





import com.dxc.pojos.bookingdetailes;
import com.dxc.pojos.hotel;
import com.dxc.pojos.user;





public interface ICustomerDao {





    boolean userregister(user u);





    boolean customerlogin(user u);





    List<Document> hotellist(hotel h);





    List<Document> bookingdetailslist(bookingdetailes bd);





    boolean bookhotel(bookingdetailes bd);





    boolean CancelBooking(bookingdetailes bd);








}
 























