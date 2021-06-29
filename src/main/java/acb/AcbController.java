package acb;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcbController {
	
	
	@GetMapping("/{id}/cards")
	public APIResponse getCardsByUserId(@PathVariable String id) {
		
		return new APIResponse();
	}
	
    @RequestMapping(path = "/person", method = RequestMethod.POST)
    public Person person(@Valid @RequestBody Person person) {
        return person;
    }
    
    
}
