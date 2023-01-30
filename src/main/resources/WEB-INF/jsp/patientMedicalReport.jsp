<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <!-- CSS only -->
    <style>
      table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
      }
    </style>
    
    <link rel="stylesheet" th:href="@{/css/pmr.css}">
    
    <title>HoMS</title>
</head>
<body>
  <div class="containers">
    <p class="title">Patient Medical Report</p>    
  </div>
  <table>
    <tr>
      <th>
        Patient ID:
      </th>
      <th>
        Medical History:
      </th>
    </tr>
      <tr th:each="record : ${record}">
        <td th:text="${record.patientID}"></td>
        <td th:text="${record.medicalHistory}"></td>
      </tr>
  </table>
</body>
</html>