package project.momento.chart.mapper;

import java.lang.reflect.Member;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import project.momento.chart.dto.ChartDto;
import project.momento.imgup.dto.ImgupDto;
import project.momento.page.Criteria;


@Mapper
public interface ChartMapper {

	void userpage(ChartDto chartDto);

	List<ChartDto> getProductList(Criteria cri);

	int getProductListCount(Criteria cri);

}