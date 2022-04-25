package com.itheima.mapper;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface BrandMapper {

    //查询所有
    List<Brand> selectAll();

    //查看详情：根据ID查询
    Brand selectByIdBrand(int id);

    //查看详情：条件查询
    //第一种方法：散装参数,如果方法中有多个参数，需要使用@Param("SQL参数占位符名称")
    List<Brand> selectByCondition(@Param("status")int status, @Param("companyName")String companyName, @Param("brandName")String brandName);
////    //第二种方法：对象参数，对象的属性名称要和参数占位符名称一致
    List<Brand> selectByCondition(Brand brand);
//    //第三种方法：map集合参数
    List<Brand> selectByCondition(Map map);

    //查看详情：单条件查询
    List<Brand> selectByConditionSingle(Brand brand);

    //添加
    void add(Brand brand);

    //修改
    int update(Brand brand);

    //删除
    void deleteById(int id);

    //批量删除
    void deleteByIds(int[] ids);


}
