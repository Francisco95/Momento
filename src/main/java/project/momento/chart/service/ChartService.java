package project.momento.chart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;
import project.momento.chart.dto.ChartDto;
import project.momento.chart.mapper.ChartMapper;
import project.momento.page.Criteria;

@Transactional
@RequiredArgsConstructor /* 단위생성자(?)*/
@Service
public class ChartService {
	
	@Autowired
	private ChartMapper chartMapper;

	public List<ChartDto> getProductList(Criteria cri) {
		// TODO Auto-generated method stub
		return chartMapper.getProductList(cri);
	}

	public int getProductListCount(Criteria cri) {
		// TODO Auto-generated method stub
		return chartMapper.getProductListCount(cri);
	}
}