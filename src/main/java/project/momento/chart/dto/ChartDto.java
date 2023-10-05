package project.momento.chart.dto;
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */
/* sign.html에 있는 가져오는 정보의 이름를 연결해주는 곳 */

import org.springframework.context.annotation.PropertySource;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import project.momento.page.Criteria;

@Data
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
public class ChartDto {
	
	private String dandruff;
	
	private String sebum;
	
	private String pustule;

	private String erythema;
	
	private String hairLoss;
	
	private String corneous;
	
	private String registDt;
	
	private String pkProdSeq;
	
	private String prodName;
	
	private String prodType;
	
	private String prodKeyword;
	
	private String prodPrice;
	
	private String prodImg;
	
	private String registId;
	

}