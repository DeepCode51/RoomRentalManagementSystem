package com.mapper;

import com.model.Byumen;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ByumenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_byumen
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer byumenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_byumen
     *
     * @mbggenerated
     */
    int insert(Byumen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_byumen
     *
     * @mbggenerated
     */
    Byumen selectByPrimaryKey(Integer byumenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_byumen
     *
     * @mbggenerated
     */
    List<Byumen> selectAll(@Param("byumen")Byumen record,@Param("page")int page,@Param("rows")int rows);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_byumen
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Byumen record);
}