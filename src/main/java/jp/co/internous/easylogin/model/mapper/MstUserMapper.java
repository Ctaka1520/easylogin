package jp.co.internous.easylogin.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.easylogin.model.domain.MstUser;

@Mapper
public interface MstUserMapper {
//	@Select：発行するSQL文がSELECTのとき付与する
	@Select("SELECT * FROM mst_user WHERE user_name = #{username} AND password = #{password}")
	MstUser findByUserNameAndPassword( String username, String password);
}
