package com.example.Client.consts;

public interface ApiPath {
    String API = "http://localhost:8080/api/v1";


    // TOUR
    String TOUR_CREATE  = "/tour/create";
    String TOUR_FIND_ALL = API + "/tour/find-all";
    String  TOUR_FIND_BY_ID ="/tour/find-by-id";
    String TOUR_UPDATE = "/tour/update";
    String TOUR_DELETE = "/tour/delete";
    String HOME_TOUR_DETAIL = API + "/tour/home-tour-detail";
    // TOUR DETAIL
    String TOUR_DETAIL_CREATE = "/tour-detail/create";
    String TOUR_DETAIL_FIND_ALL = "/tour-detail/find-all";
    String TOUR_DETAIL_FIND_BY_ID = "/tour-detail/find-by-id";
    String TOUR_DETAIL_UPDATE = "/tour-detail/update";
    String TOUR_DETAIL_DELETE = "/tour-detail/delete";

}
