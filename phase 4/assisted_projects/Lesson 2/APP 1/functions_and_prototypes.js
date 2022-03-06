// function constructor 

function student(name, cource, dateOfBirth){
    this.name=name;
    this.cource=cource;
    this.dateOfBirth=dateOfBirth;
}

// creating calculateAge() method to the Prototype property 
student.prototype.calculateAge= function(){  
    console.log('The current age is: '+(2022- this.dateOfBirth)); 
} 
console.log(student.prototype); 
  

// creating Objects
let St1= new student('Afzal', 'Electrical And Electronics', 1998);  
console.log(St1) ;
St1.calculateAge(); 

let St2= new student('Hani', 'Electical And Information', 1999); 
console.log(St2) 
St2.calculateAge();

let St3= new student('Sadiq', 'Computer Sience', 1998); 
console.log(St3) 
St3.calculateAge();
