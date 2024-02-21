package queue;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Set;

import java.text.ParseException;

import java.text.SimpleDateFormat;  

import java.util.Date;  

 

public class Ageelections {

	   
	public static Map<Integer,Integer> getdetails(Map<Integer,String> a)

    {

            Map detailsMap=null;

            detailsMap=new HashMap<Integer,Integer>();

            Set<Integer>keys=a.keySet();

            for(int key:keys)

            {    String date2=a.get(key);

                 //System.out.println(date2);

//                Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date2);

                 SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");

                 Date date = null;

                try {

                    date = formatter.parse(date2);

                } catch (ParseException e) {

                    e.printStackTrace();

                }

                int year=date.getYear()+1900;

                int s=2023-year;

                //inplace of 2023 we can write - date.getYear()+1900;

                if(s>18)

                {

                    detailsMap.put(key,s);

                }

            }

            return detailsMap;

            

}

   

	public static void main(String[] args) {

       

        Map map1=null;

        map1=new HashMap<Integer,String>();

          

        map1.put(5464,"01/01/2002");

        map1.put(5465,"10/03/2001");

        map1.put(5466,"12/04/2008");

        map1.put(5467,"09/05/2009");

        

        List<Integer> ans = new ArrayList<>();

        

        Map<Integer,Integer>detailsMap= getdetails(map1);

        detailsMap.forEach((key,value)->System.out.println("{"+key+"-"+value+"}"));

        

 

        }

}

 
