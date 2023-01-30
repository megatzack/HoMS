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
        .when("/service/ambulance", {
            templateUrl: "/service/ambulance",
        })
        .when("/service/staffSchedule", {
            templateUrl: "/service/staffSchedule",
        })
        .when("/service/admin/ambulance_plate", {
            templateUrl: "/service/admin/ambulance_plate",
        })
        .when("/service/admin/ambulance_setschedule", {
            templateUrl: "/service/admin/ambulance_setschedule",
        })
        .when("/service/admin", {
            templateUrl: "/service/admin",
        })
        .when("/service/medicalShop", {
            templateUrl: "/service/medicalShop",
        })
        .when("/service/medicalReport", {
            templateUrl: "/service/medicalReport",
        })
        .when("/service/medicalQueue", {
            templateUrl: "/service/medicalQueue",
        })
});