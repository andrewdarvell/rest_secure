package secure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by darvell on 07.04.15.
 */

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Person create(@RequestBody Person person){
        System.out.println(person);
        return null;
    }

    @RequestMapping(value = "{personId}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable("personId") long personId){
        Person person = personRepository.findOne(personId);
        System.out.println(personId);

        return person;
    }


}
