<img src="https://r.resimlink.com/3tyD.png"></img> 

<h2><font face="tahoma" size="5" color="#361ad6"> Human Resources Management System (HRMS) </font></h2>

<h2>Code Packages</h2>

<ul>
    <li><b><font face="tahoma" size="5" color="#361ad6"> Main </font></b></li>
        <ul>
            <li><a  target=”#361ad6” href='https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/HrmsApplication.java'> HrmsApplication.java </a></li>
        </ul>
    <li><b><font face="tahoma" size="5" color="#361ad6"> Business </font></b></li>
        <ul>
            <li>Abstract</li>
                <ul>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/abstracts/PositionService.java">PositionService.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/abstracts/JobSeekerService.java">JobSeekerService.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/abstracts/EmployerService.java">EmployerService.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/abstracts/EmployeeService.java">EmployeeService.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/abstracts/DepartmentService.java">DepartmentService.java</a></li>
                </ul>
            <li>Concretes</li>
                <ul>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/concretes/PositionManager.java">PositionManager.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/concretes/JobSeekerManager.java">JobSeekerManager.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/concretes/EmployerManager.java">EmployerManager.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/concretes/EmployeeManager.java">EmployeeManager.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/business/concretes/DepartmentManager.java">DepartmentManager.java</a></li>
                </ul>
        </ul>
    <li><b><font face="tahoma" size="5" color="#361ad6"> Core </font></b></li>
    <ul>
        <li>Abstract</li>
        <ul>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/abstracts/CheckEmailService.java">CheckEmailService.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/abstracts/EmailSendService.java">EmailSendService.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/abstracts/MernisCheckService.java">MernisCheckService.java</a></li>
        </ul>
        <li>Concretes</li>
        <ul>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/concretes/CheckMailManager.java">CheckMailManager.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/concretes/EmailSendManagerAdapter.java">EmailSendManagerAdapter.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/concretes/FakeMailCheckManager.java">FakeMailCheckManager.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/concretes/FakeMernisCheckAdapter.java">FakeMernisCheckAdapter.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/concretes/MernisCheckAdapter.java">MernisCheckAdapter.java</a></li>
        </ul>
        <li>Utilities</li>
        <ul>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/utilities/DataResult.java">DataResult.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/utilities/ErrorDataResult.java">ErrorDataResult.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/utilities/ErrorResult.java">ErrorResult.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/utilities/Result.java">Result.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/utilities/SuccessDataResult.java">SuccessDataResult.java</a></li>
            <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/core/utilities/SuccessResult.java">SuccessResult.java</a></li>
        </ul>
    </ul>
    <li><b><font face="tahoma" size="5" color="#361ad6"> DataAccess </font></b></li>
        <ul>
            <li>Abstract</li>
                <ul>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/dataaccess/abstracts/PositionDao.java">PositionDao.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/dataaccess/abstracts/UserDao.java">UserDao.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/dataaccess/abstracts/JobSeekerDao.java">JobSeekerDao.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/dataaccess/abstracts/EmployerDao.java">EmployerDao.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/dataaccess/abstracts/EmployeeDao.java">EmployeeDao.java</a></li>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/dataaccess/abstracts/DepartmentDao.java">DepartmentDao.java</a></li>
                </ul>
        </ul>
    <li><b><font face="tahoma" size="5" color="#361ad6"> Entities </font></b></li>
        <ul>
            <li>Abstracts</li>
            <ul>
                <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/entities/abstracts/User.java">User.java</a></li>
            </ul>
            <li>Concretes</li>
                <ul>
                    <li><a target=”#361ad6” href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/entities/concretes/Position.java">Position.java</a></li>
                    <li><a target=”#361ad6”
                           href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/entities/concretes/JobSeeker.java">JobSeeker.java</a></li>
                      <li><a target=”#361ad6”
                             href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/entities/concretes/Employer.java">Employer.java</a></li>
                    <li><a target=”#361ad6” 
                           href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/entities/concretes/Employee.java">Employee.java</a></li>
                     <li><a target=”#361ad6” 
                            href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/entities/concretes/Employee.java">Employee.java</a></li>
                    <li><a target=”#361ad6” 
                            href="https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/entities/concretes/Department.java">Department.java</a></li>
                </ul>
        </ul>   
<li><b><font face="tahoma" size="5" color="#361ad6"> API / Controllers </font></b></li>
        <ul>
            <li><a target=”#361ad6” href='https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/api/controllers/PositionsController.java'> PositionsController.java </a></li>
            <li><a target=”#361ad6” href='https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/api/controllers/JobSeekerController.java'> JobSeekerController.java </a></li>
            <li><a target=”#361ad6” href='https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/api/controllers/EmployerController.java'> EmployerController.java </a></li>
            <li><a target=”#361ad6” href='https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/api/controllers/EmployeeController.java'> EmployeeController.java </a></li>
            <li><a target=”#361ad6” href='https://github.com/tubaaktas/HRMS/blob/master/src/main/java/kodlamaio/hrms/api/controllers/DepartmentController.java'> DepartmentController.java </a></li>            
        </ul>
    </ul>

