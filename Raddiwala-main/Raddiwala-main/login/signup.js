

firebase.auth().onAuthStateChanged((user) => {
    if (user) {
      window.alert('Signed');// User is signed in, see docs for a list of available properties
      // https://firebase.google.com/docs/reference/js/firebase.User
      var uid = user.uid;
      // ...
    } else {
      // User is signed out
      // ...
    }
  });


function login(){
    var userEmail = document.getElementById("email").value;
    var userPass = document.getElementById("password").value;
    
    firebase.auth().createUserWithEmailAndPassword(userEmail, userPass)
    .then((user) => {
     window.location = 'signin.html'; // Signed in 
      // ...
    })
    .catch((error) => {
      var errorCode = error.code;
      var errorMessage = error.message;
      window.alert(errorMessage);
      // ..
    });
}