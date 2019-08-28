import {Employee as E,companies} from "./Employee";

const emp=new E("Susmitha",'Dhadige',22,5000000);
console.log(emp.age);
companies.forEach(company=>console.log(company));
