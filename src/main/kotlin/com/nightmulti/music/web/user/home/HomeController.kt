package com.nightmulti.music.web.user.home

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class HomeController constructor(val data: HomeMapper) {

    @GetMapping(value = ["/user/{USER_ID}/home"])
    fun home(@PathVariable USER_ID: String, model: Model): String {
        model.addAttribute("USER", data.getUser(USER_ID))
        return "user/home"
    }

}
