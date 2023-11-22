package generator.mapper;

import generator.domain.TEmp;

/**
* @author liang
* @description 针对表【t_emp】的数据库操作Mapper
* @createDate 2023-11-22 10:29:13
* @Entity generator.domain.TEmp
*/
public interface TEmpMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TEmp record);

    int insertSelective(TEmp record);

    TEmp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TEmp record);

    int updateByPrimaryKey(TEmp record);

}
