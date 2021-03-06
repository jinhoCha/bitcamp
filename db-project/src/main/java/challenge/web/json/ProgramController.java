package challenge.web.json;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import challenge.domain.Program;
import challenge.domain.ProgramMedia;
import challenge.service.ProgramMediaService;
import challenge.service.ProgramService;

@RestController
@RequestMapping("/program")
public class ProgramController {

    ProgramService programService;
    ProgramMediaService programMediaService;

    public ProgramController(ProgramService programService, 
            ProgramMediaService programMediaService) {
        this.programService = programService;
        this.programMediaService = programMediaService;
    }

   @RequestMapping("add")
   @ResponseStatus(HttpStatus.CREATED)
    public void add(Program program/*, ProgramMedia programMedia*/) throws Exception {
           System.out.println("컨트롤러는 들어옴");
            programService.add(program);
            /*programMediaService.add(programMedia);*/
    }

    @RequestMapping("delete")
    //@ResponseStatus(HttpStatus.OK) // 응답 상태 코드 값의 기본은 "200(OK)" 이다.
    public void delete(
            @RequestParam("no") int no) throws Exception {
       programService.delete(no);
    }

    @RequestMapping("list{page}")
    public Object list(
            @PathVariable String page,
            @MatrixVariable(defaultValue="1") int pageNo,
            @MatrixVariable(defaultValue="3") int pageSize) {
        return programService.list(pageNo, pageSize);
    }

    @RequestMapping("listCard")
    public Object list(
            ) {
        return programService.listCard();
    }

    @RequestMapping("update")
    @ResponseStatus(HttpStatus.OK)
    public void update(Program program) throws Exception {
        programService.update(program);
    }

    @RequestMapping("{no}")
    public Program view(@PathVariable int no) throws Exception {
        return programService.get(no);
    }

}
