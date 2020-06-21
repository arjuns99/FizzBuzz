package fizzbuzz.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import fizzbuzz.utils.FizzBuzzUtils;

@Controller
public class FizzBuzzController {


	@Autowired	
	private FizzBuzzUtils fizzBuzzUtils;
	 
	 
	 @RequestMapping(value = "/getList", method = RequestMethod.GET)
	  @ResponseBody
	  public void getList(@RequestParam @NotNull Integer no,HttpServletResponse response) throws IOException {
	    try {
	    	System.out.println("number entered="+no);
	        List<Object> list = new ArrayList<Object>();	        
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");			
			if (no >= 1 && no <= 1000) {
				list =fizzBuzzUtils.getList(no);
			} else {
				response.getWriter().write("{\"msg\":\"" + "Please enter number in range b/w 1 to 1000" + "\"}");
			}

		    response.getWriter().write(new ObjectMapper().writeValueAsString(list));
	    }
	    catch (Exception ex) {
	    	response.getWriter().write("{\"msg\":\"" + ex.getMessage() + "\"}");
	    }
	  }
	

}
