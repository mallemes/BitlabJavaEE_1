<%@ page import="com.javaee.bitlab.db.models.Task" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task details</title>
    <style>
        body {
            padding: 0;
        }

        .navbar {
            display: flex;
            padding: 20px;
            justify-content: flex-start;
            background-color: #0a2b84;
            color: #fff;
        }

        a {
            text-decoration: none;
            color: white;
        }
    </style>
</head>
<body>

<div>
    <div class="navbar">
        <div style="width: 20%">
            <strong>TASK MANAGER</strong>
        </div>
        <div style="width: 80%">
            <a href="/">All tasks</a>
        </div>
    </div>
    <%
        Task task = (Task) request.getAttribute("task");
    %>
    <div style="display: flex; justify-content: center">
            <div style="width: 60%">
                <form action="#">
                  <div class="form-group">
                      <label> Name:
                          <input class="form-control" type="text" value="<%out.println(task.getName());%>">
                      </label>
                  </div>
                    <div>
                        <label> Description:
                            <textarea class="form-control" name="" id="" cols="60" rows="4"><%out.println(task.getDescription());%></textarea>
                        </label>
                    </div>
                    <div>
                        <label> Deadline:
                            <input class="form-control" type="date" value="<%out.println(task.getDeadline());%>">
                        </label>
                    </div>
                   <div>
                       <label> Is done:
                           <input class="form-control" type="text">
                       </label>
                   </div>
                </form>
            </div>
    </div>
</div>
</body>
</html>
