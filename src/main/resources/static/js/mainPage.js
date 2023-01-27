var app = angular.module("Facility", ["ngRoute"]);

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
        .when("/review", {
            templateUrl: "/review"
        })
        .when("/about", {
            templateUrl: "/about",
        })
        .when("/service/medicalShop", {
            templateUrl: "/service/medicalShop",
        })
});