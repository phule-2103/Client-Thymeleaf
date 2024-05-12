package com.example.Client.consts;

public interface UrlPath {
    String BASE_URL = "/admin/v1";
    // PING
    String PING = BASE_URL + "/ping";

    // TOUR
    String TOUR_PAGE = BASE_URL + "/tour";
    String TOUR_DETAIL = BASE_URL + "/tourDetail";
    String HOME_TOUR = BASE_URL + "/home";
}
