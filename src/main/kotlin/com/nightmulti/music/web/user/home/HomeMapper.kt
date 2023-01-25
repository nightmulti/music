package com.nightmulti.music.web.user.home

import com.nightmulti.music.web.user.User
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Select

@Mapper
interface HomeMapper {

    @Select(
        """
            SELECT * FROM `USER` WHERE `USER_ID` = #{USER_ID}
        """
    )
    fun getUser(@Param("USER_ID") USER_ID: String): User

}
