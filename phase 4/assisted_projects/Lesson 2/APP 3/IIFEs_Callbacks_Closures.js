//IIFE and Closure
const StId = (function() {
    let count = 0;
    return function() {
      ++count;
      return `Std${count}`;
    };
  })();
  
  console.log("New Student IDs are listed here");
  console.log("Afzal: "+StId()); 
  console.log("Hani: "+StId()); 
  console.log("Sadiq: "+StId());
  console.log("Aarifa: "+StId());

  //Callbacks
  console.log("\n"); //to start the output from the neext line
  function fullName(firstName, lastName, callback){
    console.log("My name is " + firstName + " " + lastName);
    callback(firstName);
  }
  
  var greeting = function(fn){
    console.log('Welcome ' + fn);
  };
  
  fullName("Afzal", "Hussain", greeting);
  console.log("\n");
  fullName("Hani", "R", greeting);
  console.log("\n");
  fullName("Sadiq", "Gadag", greeting);
  console.log("\n");
  fullName("Aarifa", "Gadag", greeting);
