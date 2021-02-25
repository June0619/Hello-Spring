package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.stereotype.Controller;

/**
 * @AUTHOR        : JUNG JI WOON
 * @DATE-TIME    : 2021-02-26 오전 8:29
 * @NOTE        :
 */
@Controller
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

}
