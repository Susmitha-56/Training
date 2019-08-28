/*var sum=function(a,b)
{
    return a+b;
}
var mul=function(a,b)
{
    return a*b;
}

var divide=function(a,b)
{
    return a/b;
}

var maxval=function(a,b)
{
    var max=a>b?a:b;
    return max;
}

var cal=function(a,b,fun)
{
    return fun(a,b);
}
var average=cal(46,54,function(a,b)
{
return sum(a,b)/arguments.length;
});
var mx=cal(46,54,mul);
console.log(average)//run on node node test.js
var greet=function(fn,ln)
{

    var msg=function(msg)
    {
        console.log(msg+''+fn+''+ln);
    }
    return msg;
}
var greetfun=greet(' susmitha','dhadige   ');
greetfun('I love you');

var user=function()
{
    var firstname='';
    var lastname='';
    var obj={
        setFirstName:function(fname)
        {
            firstname=fname;
        },
        getFirstName:function()
        {
            return firstname;
        },
        setLirstName:function(lname)
        {
            lastname=lname;
        },
        getLirstName:function()
        {
            return lastname;
        },

    }
    return obj;
}

var susmitha=user();
susmitha.setFirstName('Susmitha');
console.log(susmitha.getFirstName());

----hotel--tip---

var greet=function(money)
{

    var msg=function(tip)
    {
        var x=money+tip;
        console.log(x);
    }
    return msg;
}
var greetfun=greet(1000);
greetfun(100);

-------------------------
var ages=[23,34,12,19,50,70,90];
var ageGT35Fun=function(age)
{
    return age >15;
}
var ageGT35=ages.filter(ageGT35Fun)
console.log(ageGT35)

-------------------------------------


var ages=[23,34,12,19,50,70,90];

var result=ages.map(function(age)
{
    return age + 2;
})
.filter(function(val,index,ages)
{
    return val>35;
})
.reduce(function(old, newVal)
{
    return old+newVal
}, 10);

console.log(result);

----using arrow functions-----------------------------------

var result=ages.map(age=> age+2)
.filter(val=> val>35)
.reduce((old,newVal),10);

ages.filter(age =>age>this.val ,{val:22})
.forEach(n=>console.log(n));
------------------------------------------------------------------------

var employees=[
    {
        id:15,
        dep:"hr",
        salary:25000
    },
    {
        id:16,
        dep:'c2e',
        salary:25001
    },
    {
        id:17,
        dep:'hr',
        salary:25002
    },
    {
        id:18,
        dep:'c2e',
        salary:25034
    },
    {
        id:19,
        dep:'hr',
        salary:25900
    },
    {
        id:20,
        dep:'c2e',
        salary:25233
    },
    {
        id:21,
        dep:'hr',
        salary:25122
    },
]
var out=0;
var out1=0;
for(var i=0;i<employees.length;i++){
    if(employees[i]['dep']=='hr')
    {
  out+=employees[i]['salary'];
    }
    if(employees[i]['dep']=='c2e')
    out1+=employees[i]['salary'];
}
console.log(out);
console.log(out1);

var numbers=[12,12,214,34,67];
numbers.filter(function(num)
{
 return num%2 ===0;
});
*/


const users = [
    { id: 11, name: 'Adam', age: 23, group: 'editor' },
    { id: 47, name: 'John', age: 28, group: 'admin' },
    { id: 85, name: 'William', age: 34, group: 'editor' },
    { id: 97, name: 'Oliver', age: 28, group: 'admin' }
  ];

document.querySelector('#users').innerHTML=users
.map(function(users){return users.name})
.map(function(name){
    return `<li>${name} </li>`})
.join('')