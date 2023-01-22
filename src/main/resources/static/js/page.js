var app = angular.module("HoMS-Facility", ["ngRoute"]);

app.config(function ($routeProvider) {
    $routeProvider
        .when("/", {
            templateUrl: "/homepage",
            controller: "custController"
        })
        .when("/doctor", {
            //templateUrl: "doctor.jsp"
        })
        .when("/service", {
            //templateUrl: "service.jsp"
        })
        .when("/review", {
            templateUrl: "/review",
            controller: "custController"
        })
        .when("/about", {
            //templateUrl: "about.jsp"
        });
});