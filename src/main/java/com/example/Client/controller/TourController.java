package com.example.Client.controller;
import com.example.Client.consts.ApiPath;
import com.example.Client.consts.UrlPath;

import com.example.Client.dto.TourDTO;
import com.example.Client.response.TourResponseDTO;
import com.example.Client.utils.RestTemplateUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;


@Controller
public class TourController {
    @Autowired
    RestTemplateUtils restTemplateUtils;
    @Autowired
    RestTemplate restTemplate;
    @GetMapping(UrlPath.TOUR_PAGE)
    public String showTourlist(Model model, HttpServletRequest request){
        TourResponseDTO response = restTemplateUtils.getData(ApiPath.TOUR_FIND_ALL, request, TourResponseDTO.class);
        model.addAttribute("tours", response.getList());
        return "tour";
    }
    // show Home Tour
    @GetMapping(UrlPath.HOME_TOUR)
    public String showHomeTour(Model model, HttpServletRequest request) {
        TourResponseDTO response = restTemplateUtils.getData(ApiPath.HOME_TOUR_DETAIL,request,TourResponseDTO.class);
        model.addAttribute("tours", response.getList());
        return "home";
    }

@GetMapping(UrlPath.TOUR_DETAIL + "/{idTour}")
public String showTourDetail(@PathVariable int idTour, Model model, HttpServletRequest request) {
    TourDTO tour = restTemplateUtils.getData(ApiPath.API + ApiPath.TOUR_FIND_BY_ID + "/" + idTour, request, TourDTO.class);
        model.addAttribute("tour", tour);
        return "tourDetail";
}


    @RequestMapping("")
    public String home(){
        return "home";
    }
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    @RequestMapping("/cart")
    public String cart(){
        return "cart";
    }
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/profile")
    public String profile(){
        return "profile";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/password")
    public String password(){
        return "password";
    }
}
