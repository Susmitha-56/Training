"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Employee_1 = require("./Employee");
var emp = new Employee_1.Employee("Susmitha", "dhadige", 21, 100000);
console.log(emp.age);
Employee_1.companies.forEach(function (comapany) { return console.log(comapany); });
