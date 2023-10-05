package project.momento.imgup.mapper;

import java.lang.reflect.Member;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import project.momento.imgup.dto.ImgupDto;


@Mapper
public interface ImgupMapper {
	ImgupDto imgupFile(ImgupDto imgupDto);
}