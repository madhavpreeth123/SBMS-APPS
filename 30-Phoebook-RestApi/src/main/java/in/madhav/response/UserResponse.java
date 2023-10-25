package in.madhav.response;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class UserResponse {
	
	private String name;
	private String email;
	private String phoneNum;
	private String status;
	@Column(name = "response_timestamp")
	private LocalDateTime when;
	@Id
	@GeneratedValue
	private Integer UserId;
}
