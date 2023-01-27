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
            templateUrl: "/review",
            controller: "homeController"
        })
        .when("/about", {
            templateUrl: "/about",
            controller: "homeController"
        })
        .when("/queue", {
            templateUrl: "/queue",
            controller: "homeController"
        });
});