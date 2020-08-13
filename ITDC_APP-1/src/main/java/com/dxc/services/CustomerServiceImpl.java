package com.dxc.services;


import java.util.List;
import org.bson.Document;

import com.dxc.dao.CustomerDaoImpl;
import com.dxc.dao.ICustomerDao;
import com.dxc.pojos.bookingdetailes;
import com.dxc.pojos.hotel;
import com.dxc.pojos.user;





public class CustomerServiceImpl implements ICustomerService
{
 ICustomerDao dao=new CustomerDaoImpl();
    @Override
    public boolean userregister(user u) {
        
        return dao.userregister(u);
    }
    @Override
    public boolean customerlogin(user u) {
        
        return dao.customerlogin(u);
    }
    @Override
    public List<Document> hotellist(hotel h) {
        
        return dao.hotellist(h);
    }
    @Override
    public List<Document> bookingdetailslist(bookingdetailes bd) {
        
        return dao.bookingdetailslist(bd);
    }
    @Override
    public boolean bookhotel(bookingdetailes bd) {
        
        return dao.bookhotel(bd);
    }
    @Override
    public boolean CancelBooking(bookingdetailes bd) {
        
        return dao.CancelBooking(bd);
    }






}
 










