var app = angular.module("HoMS-Facility", ["ngRoute"]);

app.config(function ($routeProvider) {
    $routeProvider
        .when("/homepage", {
            templateUrl: "/homepage",
            controller: "homeController"
        })
        .when("/doctor", {
            templateUrl: "/doctor",
            controller: "homeController"
        })
        .when("/service", {
            templateUrl: "/service",
            controller: "homeController"
        })
        .when("/review", {
            templateUrl: "/review"
        })
        .when("/about", {
            templateUrl: "/about",
            controller: "homeController"
        })
        .when("/staff", {
            templateUrl: "/staff/homepage",
            controller: "homeController"
        });
});