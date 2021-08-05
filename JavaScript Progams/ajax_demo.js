var obj;
function loadObject() {
obj = new XMLHttpRequest();     //create the object reference. 
//obj.open("GET","demo.txt");     // method get, post, put and delete 
obj.open("GET","https://jsonplaceholder.typicode.com/todos")
obj.onreadystatechange= callback;   // it call again and again to check the request status 
obj.send();
}
/*
    readyState = 0 : not initialize 
    readyState = 1, request send to server 
                2, processing 
                3, ready to give response 
                4, : got the response 
*/
function callback(){
  // alert(obj.readyState+" "+obj.status)
  if(obj.readyState==4 && obj.status==200){
      alert(obj.responseText)
  }
}