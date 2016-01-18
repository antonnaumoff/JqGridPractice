<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="menu">
  Menu
  <ul>
    <li>
      <spring:url value="/" var="departments" htmlEscape="true"/>
      <a href="${departments}">Departments</a>
    </li>
    <li>
      <spring:url value="/employees/99" var="employees" htmlEscape="true"/>
      <a href="${employees}">Employees</a>
    </li>
  </ul>
</div>