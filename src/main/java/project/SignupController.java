package project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import project.User;
import project.UserRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/signup") // This means URL's start with /carDrive
public class SignupController {
	
	@Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;
	
	
	@GetMapping(path="/add")
	public @ResponseBody void addNewUser (@RequestParam String firstName
			,@RequestParam String lastName, @RequestParam String email, @RequestParam String password ) {

		User n = new User();
		n.setFirstName(firstName);
		n.setLastName(lastName);
		n.setEmail(email);
		n.setPassword(password);
		userRepository.save(n);
		
	}
	
}
