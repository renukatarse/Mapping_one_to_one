package com.scp.general_store;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test_General_store {
	
	public static void main(String[] args) {
		 
		
		SessionFactory sf = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session= sf.openSession();
		Transaction tx=session.beginTransaction();


        Sales sl = new Sales("j.m road","pune","india");
        Sales sl1 = new Sales("shivaji road","Ahamadpur","india");
        Sales sl2 = new Sales("sinhagad road","warje_malwadi","india");
        Sales sl3 = new Sales("shewalwadi road","hadapsar","india");
     
   
		Counter c = new Counter("Rohit","khade","manager");
        Counter c1 = new Counter("shubham","bellale","head");
        Counter c2 = new Counter("pradeep","gadekar","sales_executive");
        Counter c3 = new Counter("heena","momin","hod");
      
        sl.setCount(c);
        

        session.save(c);        session.save(sl);
        session.save(c2);       session.save(sl1);
        session.save(c3);       session.save(sl2);
        session.save(c1);       session.save(sl3);
        
        tx.commit();
        session.close();  
    }
 

}










         
         
                
       
        
