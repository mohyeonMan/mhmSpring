package user.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
public class UserDTO {
	private String name,id,pwd;
}
