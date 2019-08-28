"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
/*class Employee{
    private firstname:string;
    private lastname:string;
    private age:number;
    private salary:number;
    //if we declare private in construction then no need of above 4 lines and below this lines
    constructor(firstname:string ,lastname:string ,age:number ,salary:number)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.salary=salary;
    }
    getAge():number{
        return this.age;
    }
    setAge(age:number):void{
        this.age=age;
    }
    getSalary():number{
        return this.salary;
    }
    setSalary(salary:number):void{
        this.salary=salary;
    }
    
    getFirstName():string {
         return this.firstname;
    }

    setFirstName(firstname:string):void {
    this.firstname=firstname;
    }


    getLastName():string {
        return this.lastname;
   }

   setLastName(lastname:string):void {
   this.lastname=lastname;
   }


}
const emp:Employee= new Employee("susmitha","dhadige",22,100000);
console.log(`Name is ${emp.getFirstName()} ${emp.getLastName()}`)
*/
var Employee = /** @class */ (function () {
    function Employee(_firstname, _lastname, _age, _salary) {
        this._firstname = _firstname;
        this._lastname = _lastname;
        this._age = _age;
        this._salary = _salary;
    }
    Object.defineProperty(Employee.prototype, "age", {
        get: function () {
            return this._age;
        },
        set: function (age) {
            this._age = age;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Employee.prototype, "name", {
        get: function () {
            return this._firstname;
        },
        set: function (name) {
            this._firstname = name;
        },
        enumerable: true,
        configurable: true
    });
    return Employee;
}());
exports.companies = ['samsung', 'Dbs', 'Amazon'];
var employee = new Employee("x", 'Dhadige');
employee.name = "Susmitha";
console.log("Name is " + employee.name);
