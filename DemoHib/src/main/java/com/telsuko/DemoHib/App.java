package com.telsuko.DemoHib;
import org.hibernate.Session;
import org.hibernate.loader.entity.NaturalIdEntityJoinWalker;
import org.hibernate.cfg.Configuration;
import com.mysql.cj.xdevapi.SessionFactory;

import java.sql.Savepoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Alien telsuko  = new Alien();
       telsuko.setAid(101);
       telsuko.setAname("reshma");
       telsuko.setColor("green");
       
       
       Configuration  con = new Configuration();
        org.hibernate.SessionFactory sf = con.buildSessionFactory();
       
       Session session = sf.openSession();
       session.save(telsuko);
       
       
    }
}
