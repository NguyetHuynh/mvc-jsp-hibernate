package spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView; 
//bi loi thu vien thay vi sevlet thi de porlet --> error hic

@Controller
public class StockController {
	@RequestMapping("/insert")
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse res)
	{	
		String catId = request.getParameter("categoryId");
		int categoryId = Integer.valueOf(catId);
		String stockCode = request.getParameter("stockCode");
		String stockName = request.getParameter("stockName");
		
		StockDao stDao = new StockDao();
		Stock st = new Stock(categoryId, stockCode, stockName);
		stDao.saveStock(st);
		return new ModelAndView("ListTeam");

	}
}

