
var map1 = new Map(); 
map1.set("first name", "Robb"); 
map1.set("last name", "Stark"); 
map1.set("friend 1","Bran") 
    .set("friend 2","Arya")
    .set("friend 3","Jhon"); 
console.log(map1); 
console.log("map1 has friend 3 ? " + map1.has("friend 3")); 
console.log("get value for key = friend 3 - "+ map1.get("friend 3")); 
console.log("delete element with key = friend 2 - " + map1.delete("friend 2")); 
map1.clear(); 
console.log(map1);
class Student
{
    constructor(id,fname,lname)
    {
      this.id=id;
      this.fname=fname;
      this.lname=lname;
    }
    detail()
    {
  document.writeln("Student Id is: "+this.id+"  <br> Student Full Name is: "+this.fname+" "+this.lname+"<br>")
    }
  }
//passing object to a variable 
var s1=new Student(786,"Afzal","Hussain");
var s2=new Student(123,"Umme","Hani");
s1.detail(); 
s2.detail();
