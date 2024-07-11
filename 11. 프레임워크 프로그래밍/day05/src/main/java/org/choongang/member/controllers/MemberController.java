package org.choongang.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    //@GetMapping("/member/join")
    //@RequestMapping(path="/member/join", method={RequestMethod.GET, RequestMethod.POST})
    @GetMapping("/join")
    public String join() {
        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(RequestJoin form) {

        return "redirect:/member/login";
    }


}
