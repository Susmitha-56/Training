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
export class Employee{

    constructor(private _firstname:string, private _lastname:string, private  _age?:number,  private _salary?:number){}

    get age():number{
        return this._age;
    }

    set age(age:number){
        this._age = age;
    }

    get name():string{
        return this._firstname;
    }

    set name(name:string){
        this._firstname = name;
    }
}

export const companies=['samsung','Dbs','Amazon'];
const employee:Employee = new Employee("x",'Dhadige')

employee.name = "Susmitha";
console.log(`Name is ${employee.name}`);
