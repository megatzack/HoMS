var app = angular.module("HoMS-Facility", ["ngRoute"]);

app.config(function ($routeProvider) {
    $routeProvider
        .when("/homepage", {
            templateUrl: "/homepage",
            controller: "homepageController"
        })
        .when("/doctor", {
            templateUrl: "/doctor",
        })
        .when("/service", {
            templateUrl: "/service",
        })
        .when("/staffservice", {
            templateUrl: "/staffservice",
        })
        .when("/review", {
            templateUrl: "/review"
        })
        .when("/about", {
            templateUrl: "/about",
        })
        .when("/service/medicalShop", {
            templateUrl: "/service/medicalShop",
        })
        .when("/service/medicalRecord", {
            templateUrl: "/service/medicalRecord",
        })
        .when("/service/medicalQueue", {
            templateUrl: "/service/medicalQueue",
        })
});