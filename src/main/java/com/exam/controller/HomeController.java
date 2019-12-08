package com.exam.controller;

import com.exam.bean.Invitation;
import com.exam.bean.PagedDate;
import com.exam.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.ServerEndpoint;

@RestController
public class HomeController {
    @Autowired
    InvitationService invitationService;

    @RequestMapping("index")
    public PagedDate<Invitation> getInvitationPages(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value = "title", defaultValue = "") String title) {
        PagedDate<Invitation> list = invitationService.getInvitationPages(page, 5, title);
        return list;
    }
}
