package com.test.mapper;

import com.example.homework.model.Account;
import com.example.homework.model.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    long countByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    int deleteByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    int deleteByPrimaryKey(String number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    List<Account> selectByExampleWithRowbounds(AccountExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    Account selectByPrimaryKey(String number);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ACCOUNT
     *
     * @mbg.generated Wed Nov 27 09:02:06 CST 2019
     */
    int updateByPrimaryKey(Account record);
}