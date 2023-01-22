var app = angular.module("HoMS-Facility", ["ngRoute"]);

app.config(function ($routeProvider) {
    $routeProvider
        .when("/homepage", {
            templateUrl: "/homepage",
            controller: "custController"
        })
        .when("/doctor", {
            templateUrl: "/doctor",
            controller: "custController"
        })
        .when("/service", {
            templateUrl: "/service",
            controller: "custController"
        })
        .when("/review", {
            templateUrl: "/review",
            controller: "custController"
        })
        .when("/about", {
            templateUrl: "/about",
            controller: "custController"
        });
});