package test.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.ShowSheduleDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class ShowSheduleTest {
	
	@Autowired
	ShowSheduleDao dao;
	
	
	@Test
	public void retriveShedule(){
		 Date date;
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd");
		String userInput = "2009/02/20";
		try {
			date = (Date) sdf.parse(userInput);
			System.out.println(date);
			dao.retriveShedule(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
