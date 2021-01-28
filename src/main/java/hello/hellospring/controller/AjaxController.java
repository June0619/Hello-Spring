package hello.hellospring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR        : JUNG JI WOON
 * @DATE-TIME    : 2021-01-28 오전 11:05
 * @NOTE        :
 */
@RestController
public class AjaxController {

    @PostMapping("/api.do")
    public ResponseEntity<String> apiTest(@RequestParam("param1") String param1) {

        String result = "";




        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
}
