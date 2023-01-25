<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
  <head>
    <meta charset="ISO-8859-1" />
    <title>Homepage</title>
  </head>
  <body>
    <h1>Welcome back </h1>
    <nav class="navbar navbar-light bg-light">
      <!-- <form class="form-inline">
        <input
          class="form-control mr-sm-2"
          type="search"
          placeholder="Search"
          aria-label="Search"
        />
        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">
          Search
        </button>
      </form> -->
      <div class="navbar-nav">
        <a class="nav-item nav-link" href="/staff/viewpatients">Patients</a>
        <a class="nav-item nav-link" href="/staff/viewschedule">Schedule</a>
        <a class="nav-item nav-link" href="/staff/viewhome">Home</a>
        <a class="nav-item dropdown" href="/staff/viewprofile" role="button">
          Profile
            <img class="rounded-circle" src="https://i.imgur.com/0eg2WHz.jpg" width="30" height="30" alt="ProfilePicture" />
            <div class="dropdown-menu" aria-labelledby="Profile">
              <a class="dropdown-item" href="/staff/viewprofile">Profile</a>
              <a class="dropdown-item" href="/logout">Logout</a>
            </div>
        </a>
      </div>
    </nav>

    <div>
        <h1>Staff Details</h1>
        <p>Name: <span th:text="${staff.name}"></span></p>
        <p>Role: <span th:text="${staff.role}"></span></p>
        <p>Department: <span th:text="${staff.department}"></span></p>
    </div>

    <div th:if="${department == 'Doctors'}">
      <a href="/doctors/home">Doctors Home</a>
    </div>

    <div th:if="${department == 'Nurse'}">
      <a href="/nurse/home">Nurse Home</a>  
    </div>

    <div th:if="${department == 'Admin'}">
      <a href="/admin/home">Admin Home</a>  
    </div>

    <div th:if="${department == 'Ambulance'}">
      <a href="/ambulance/home">Ambulance Home</a>
    </div>

    <div th:if="${department == 'Inventory'}">
      <a href="/inventory/home">Inventory Home</a>  
    </div>
  </body>
</html>