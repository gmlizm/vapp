package com.aboo.vapp.core.data.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Qualifier;

import com.aboo.vapp.core.model.User;

@Mapper
public interface UserMapper {
	
	  // 通过Object新增
    @Insert("INSERT INTO USER(id,uname) VALUES(#{id}, #{uname})")
    int insertByObject(User user);
    
    // Delete By Id
    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);
    
    // Update
    @Update("UPDATE user SET uname=#{uname} WHERE id=#{id}")
    void update(User user);
    
    // Find by Parameter
    //@Select("select max_connections as id,user as uname from user WHERE user = #{uname}")
    @Qualifier("msql2DataSource")
    public User findByName(@Param("uname") String uname);
}
