package project.momento.mypage.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import project.momento.chart.dto.ChartDto;
import project.momento.chart.service.ChartService;
import project.momento.page.Criteria;
import project.momento.page.Paging;

@Controller
public class MypageController {
	
	/*
	 * @Autowired private SignService SignService;
	 */
	
	@Autowired
	private ChartService chartService;

	/*
	 * 사이트에서 이동
	 */
	@RequestMapping(value="/mypage.com", produces="application/text;charset=utf-8") /* value주소 이름*/
	public ModelAndView Mypage(Criteria cri, Model model, ChartDto chartDto) {
		ModelAndView mv = new ModelAndView("content/mypage"); 
		int total = 0;
		total = chartService.getProductListCount(cri);
		// 페이징 객체
        Paging paging = new Paging();
        paging.setCri(cri);
        paging.setTotalCount(total); 
        System.out.println(paging);
        System.out.println(cri);
		List<ChartDto> list = chartService.getProductList(cri);
		mv.addObject("list", list);
		mv.addObject("paging", paging);   
		return mv;
	}
	
}
