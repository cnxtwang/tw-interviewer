package interviewer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterviewController {


    @RequestMapping("/interview")
    public Interview getInterview(){
        Interview interview = new Interview();
        interview.setId(1L);
        interview.setName("juntao");
        interview.setTechStack("java");
        return interview;
    }

}
