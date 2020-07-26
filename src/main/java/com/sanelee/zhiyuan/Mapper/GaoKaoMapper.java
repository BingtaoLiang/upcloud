package com.sanelee.zhiyuan.Mapper;

import com.sanelee.zhiyuan.Model.GaoKao;
import com.sanelee.zhiyuan.Model.GaoKaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GaoKaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    long countByExample(GaoKaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    int deleteByExample(GaoKaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    int deleteByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    int insert(GaoKao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    int insertSelective(GaoKao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    List<GaoKao> selectByExampleWithRowbounds(GaoKaoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    List<GaoKao> selectByExample(GaoKaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    GaoKao selectByPrimaryKey(Integer sid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") GaoKao record, @Param("example") GaoKaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    int updateByExample(@Param("record") GaoKao record, @Param("example") GaoKaoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    int updateByPrimaryKeySelective(GaoKao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gaokao
     *
     * @mbg.generated Fri Dec 20 12:59:45 CST 2019
     */
    int updateByPrimaryKey(GaoKao record);
}