package com.dxc.controllers;

import java.util.List;
import org.bson.Document;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.dxc.pojos.bookingdetailes;
import com.dxc.pojos.hotel;
import com.dxc.services.AdminServiceImpl;
import com.dxc.services.IAdminService;


@Controller
public class AdminController 
 {
     IAdminService adminservice=new AdminServiceImpl();
     String message="";

     @RequestMapping("/home")
     public String home()
     {
         return "Home.html";//............

  }
 @RequestMapping("/login")
 public String adminlogin(Model m, @RequestParam int adminid, @RequestParam String password )

{

     boolean b=adminservice.adminlogin(adminid,password);
     if(b==true)
     {
         message="Admin Login Succussfully";
         m.addAttribute("message",message);
         return "AdminMenu.jsp";    
     }
     else
     {
         message="Incorrect Login Credentials";
         m.addAttribute("message", message);
         return "message.jsp";   
     }
 }
 //..........................................................................
 @RequestMapping("/addhotel")
    public String AddHotel(@ModelAttribute hotel h, Model m)
     {
         adminservice.AddHotel(h);
         message="Hotel Added Successfully";
         m.addAttribute("message",message);
       return "message.jsp";
     }
    //....................................................................... 
 @RequestMapping("/displayhotellist")
     public String displayhotellist(@ModelAttribute hotel h,Model m)
     {
         List<Document> list=adminservice.displayhotellist(h);
         m.addAttribute("list", list);
         return "DisplayHotelList.jsp";
         
     }
 //................................................................
     @RequestMapping("CancelHotelBookingList")
     public String cancelhotelbookinglist(@ModelAttribute  bookingdetailes bd,Model m)
     {
         List<Document> list=adminservice.cancelhotelbookinglist(bd);
         m.addAttribute("list", list);
         return "CancelHotelBookingList.jsp";
     }
     //....................................................................
     @RequestMapping("/CancelRequestedBooking")
      public String cancelrequestedbooking(@ModelAttribute bookingdetailes bd, Model m)
      {
         boolean b=adminservice.cancelrequestedbooking(bd);
         if(b==true)
         {
             message="Canceled Successfully";
             m.addAttribute("message",message);
             return "message.jsp";    
         }
         else
         {
             message="Cancel Booking Hotel Is Done!!!!";
             m.addAttribute("message", message);
             return "message.jsp";    
         }
      }
     }






































