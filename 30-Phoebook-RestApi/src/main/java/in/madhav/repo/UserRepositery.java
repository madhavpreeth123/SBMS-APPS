package in.madhav.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.madhav.response.UserResponse;

public interface UserRepositery extends JpaRepository<UserResponse, Integer> {

	@Query("select u from UserResponse u where u.phoneNum=:phoneNum ")
	public List<UserResponse> getUser(@Param("phoneNum") String phoneNum);
	
	 @Query("select u.UserId from UserResponse u where u.phoneNum = :phoneNum")
	 Integer getUserIdByPhoneNum(@Param("phoneNum") String phoneNum);
}
